package com.zimesfied.user.service;

import com.zimesfied.user.api.UsersApiDelegate;
import com.zimesfied.user.domain.UserModel;
import com.zimesfied.user.model.UserRequest;
import com.zimesfied.user.model.UserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;

@Slf4j
@RestController
public class UserService implements UsersApiDelegate {

    @Override
    public ResponseEntity<UserResponse> addUser(UserRequest userRequest) {
        log.info("Adding a new user | {}", userRequest);

        UserModel userModel = UserModel.builder()
                .dob(userRequest.getDob().toLocalDateTime())
                .phone(userRequest.getPhone())
                .email(userRequest.getEmail())
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .build();

        //validate user information
        //Save to database
        //notify admin
        //create user account




        UserResponse response = new UserResponse();

        response.setDob(userModel.getDob().atOffset(ZoneOffset.UTC));
        response.setEmail(userModel.getEmail());
        response.setFirstName(userModel.getFirstName());
        response.setLastName(userModel.getLastName());
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
