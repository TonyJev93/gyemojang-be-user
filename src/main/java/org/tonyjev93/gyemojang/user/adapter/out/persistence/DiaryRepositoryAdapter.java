package org.tonyjev93.gyemojang.user.adapter.out.persistence;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.tonyjev93.gyemojang.user.adapter.out.persistence.entity.UserEntity;
import org.tonyjev93.gyemojang.user.adapter.out.persistence.repository.UserRepositoryJpa;
import org.tonyjev93.gyemojang.user.application.dto.UserDto;
import org.tonyjev93.gyemojang.user.application.port.out.UserRepository;

@Service
@RequiredArgsConstructor
public class DiaryRepositoryAdapter implements UserRepository {

    private final UserRepositoryJpa repository;

    @Override
    public UserDto findById(String id) {
        return repository.findById(id).map(UserEntity::toPort).orElseGet(() -> null);
    }

    @Override
    public UserDto create(String id, String name) {
        return repository.save(UserEntity.create(id, name)).toPort();
    }
}
