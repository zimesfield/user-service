package com.zimesfied.user.service;

import com.zimesfied.user.api.UsersApiDelegate;
import com.zimesfied.user.domain.UserModel;
import com.zimesfied.user.mapper.UserMapper;
import com.zimesfied.user.model.UserRequest;
import com.zimesfied.user.model.UserResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class UserService implements UsersApiDelegate {

    private final UserMapper userMapper;

    @Override
    public ResponseEntity<UserResponse> addUser(UserRequest userRequest) {
        log.info("Adding a new user | {}", userRequest);
        UserModel userModel = userMapper.toModel(userRequest);

        //validate user information
        //Save to database
        //notify admin
        //create user account

        UserResponse response = userMapper.toResponse(userModel);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<List<UserResponse>> getAllUsers() {
        return UsersApiDelegate.super.getAllUsers();
    }

    @Override
    public ResponseEntity<List<UserResponse>> getUser(Long id) {
        return UsersApiDelegate.super.getUser(id);
    }
}
