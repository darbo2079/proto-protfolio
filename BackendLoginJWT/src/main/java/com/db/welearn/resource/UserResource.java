package com.db.welearn.resource;

import com.db.welearn.domain.StudyGroup;
import com.db.welearn.domain.User;
import com.db.welearn.domain.UserPrincipal;
import com.db.welearn.exception.domain.EmailExistException;
import com.db.welearn.exception.domain.ExceptionHandling;
import com.db.welearn.exception.domain.UserNotFoundException;
import com.db.welearn.exception.domain.UsernameExistException;
import com.db.welearn.service.GroupService;
import com.db.welearn.service.UserService;
import com.db.welearn.utility.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.db.welearn.constant.SecurityConstant.JWT_TOKEN_HEADER;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping(path = { "/", "/user"})
//@CrossOrigin("http://localhost:4200") -> gibt eine bessere Möglichkeit, das zu machen: CORS-Filter Bean in main (?)
public class UserResource extends ExceptionHandling {
    private UserService userService;
    private GroupService groupService;
    private AuthenticationManager authenticationManager;
    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    public UserResource(UserService userService, AuthenticationManager authenticationManager, JwtTokenProvider jwtTokenProvider, GroupService groupService) {
        this.userService = userService;
        this.groupService = groupService;
        this.authenticationManager = authenticationManager;
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @PostMapping ("/login")
    public ResponseEntity<User> login(@RequestBody User user) {
        authenticate(user.getUsername(), user.getPassword());
        User loginUser = userService.findUserByUsername(user.getUsername());
        UserPrincipal userPrincipal = new UserPrincipal(loginUser);
        HttpHeaders jwtHeader = getJwtHeader(userPrincipal);
        return new ResponseEntity<>(loginUser, jwtHeader, HttpStatus.OK);
    }

    @PostMapping ("/register")
    public ResponseEntity<User> register(@RequestBody User user) throws UserNotFoundException, EmailExistException, UsernameExistException {
        User newUser = userService.register(user.getUsername(), user.getEmail(), user.getPassword());
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }

    //Groups
    @PostMapping("/add")
    public ResponseEntity<StudyGroup> addNewGroup(@RequestBody StudyGroup studyGroup){
        StudyGroup newGroup = groupService.addNewGroup(studyGroup.getGroupName());
        return new ResponseEntity<>(newGroup, HttpStatus.OK);
    }

    /*@GetMapping("/list")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getUsers();
        return new ResponseEntity<>(users, OK);
    }*/

    @GetMapping("/list")
    public ResponseEntity<List<StudyGroup>> getAllGroups() {
        List<StudyGroup> studyGroups = groupService.getGroups();
        return new ResponseEntity<>(studyGroups, OK);
    }


    private HttpHeaders getJwtHeader(UserPrincipal user) {
        HttpHeaders headers = new HttpHeaders();
        headers.add(JWT_TOKEN_HEADER, jwtTokenProvider.generateJwtToken(user));
        return headers;
    }

    //authentifiziert User und wirft eine Exception falls Daten inkorrekt
    private void authenticate(String username, String password) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
    }
}
