package org.tonyjev93.gyemojang.user.application.port.in;

import org.tonyjev93.gyemojang.user.application.dto.UserDto;

public interface UserUseCase {
    UserDto getById(String id);

    UserDto create(String id, String name);
}
