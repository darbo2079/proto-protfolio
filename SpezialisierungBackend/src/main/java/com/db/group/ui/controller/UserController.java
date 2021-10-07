package com.db.group.ui.controller;

import com.db.group.service.UserService;
import com.db.group.shared.dto.UserDto;
import com.db.group.ui.model.request.UserDetailsRequestModel;
import com.db.group.ui.model.response.UserRest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users") //http://localhost:8080//users
@CrossOrigin(origins= "http://localhost:4200")
public class UserController {
    @Autowired
    UserService userService;


    //@RequestBody: so method can read the body of http request and convert the JSON body into a java object
    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
        UserRest returnValue = new UserRest();
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userDetails, userDto);

        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser, returnValue);

        return returnValue;
    }
}
