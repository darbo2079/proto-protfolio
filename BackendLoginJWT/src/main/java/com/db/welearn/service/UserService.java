package com.db.welearn.service;

import com.db.welearn.domain.User;
import com.db.welearn.exception.domain.EmailExistException;
import com.db.welearn.exception.domain.UserNotFoundException;
import com.db.welearn.exception.domain.UsernameExistException;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UserService {

    User register(String username, String email, String password) throws UserNotFoundException, EmailExistException, UsernameExistException;

    List<User> getUsers();

    User findUserByUsername(String username);

    User findUserByEmail(String email);

    User updateProfileImage(String username, MultipartFile profileImage);
}
