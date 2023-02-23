package org.tonyjev93.gyemojang.user.application.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.tonyjev93.gyemojang.user.application.dto.UserDto;
import org.tonyjev93.gyemojang.user.application.port.in.UserUseCase;
import org.tonyjev93.gyemojang.user.application.port.out.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService implements UserUseCase {

    private final UserRepository userRepository;

    @Override
    public UserDto getById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public UserDto create(String id, String name) {
        return userRepository.create(id, name);
    }
}
