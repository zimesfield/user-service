package com.zimesfied.user.mapper;

import com.zimesfied.user.domain.UserModel;
import com.zimesfied.user.model.UserRequest;
import com.zimesfied.user.model.UserResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserModel toModel(UserRequest userRequest);
    UserResponse toResponse(UserModel userModel);
}
