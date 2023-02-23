package com.tonyjev93.gyemojang.user.application.port.out;

import com.tonyjev93.gyemojang.user.application.dto.UserDto;

public interface UserRepository {
    UserDto findById(String id);

    UserDto create(String id, String name);
}
