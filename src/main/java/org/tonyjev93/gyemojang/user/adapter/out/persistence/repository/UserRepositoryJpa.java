package org.tonyjev93.gyemojang.user.adapter.out.persistence.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.tonyjev93.gyemojang.user.adapter.out.persistence.entity.UserEntity;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepositoryJpa extends PagingAndSortingRepository<UserEntity, String> {
    List<UserEntity> findByName(@Param("name") String name);
}
