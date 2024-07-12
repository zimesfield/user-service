package com.zimesfied.user.domain;


import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class UserModel {

    private String firstName;

    private String lastName;

    private LocalDateTime dob;

    private String phone;

    private String email;
}
