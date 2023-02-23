package com.tonyjev93.gyemojang.user.application.service;

import com.tonyjev93.gyemojang.user.application.dto.UserDto;
import com.tonyjev93.gyemojang.user.application.port.in.UserUseCase;
import com.tonyjev93.gyemojang.user.application.port.out.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
