package com.zimesfied.user.domain;


import lombok.Builder;
import lombok.Getter;

import java.time.OffsetDateTime;

@Getter
@Builder
public class UserModel {

    private Long id;
    private String firstName;

    private String lastName;

    private OffsetDateTime dob;

    private String phone;

    private String email;
}
