package com.tonyjev93.gyemojang.user.application.port.in;

import com.tonyjev93.gyemojang.user.application.dto.UserDto;

public interface UserUseCase {
    UserDto getById(String id);

    UserDto create(String id, String name);
}
