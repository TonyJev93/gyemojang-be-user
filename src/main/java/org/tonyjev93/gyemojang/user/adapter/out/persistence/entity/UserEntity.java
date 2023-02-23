package org.tonyjev93.gyemojang.user.adapter.out.persistence.entity;

import lombok.*;
import org.hibernate.annotations.Comment;
import org.tonyjev93.gyemojang.user.application.dto.UserDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Users")
@Getter
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity {
    @Id
    @Comment("사용자 아이디")
    @Column(name = "user_id")
    private String id;

    @Comment("이름")
    @Column(nullable = false)
    private String name;

    public static UserEntity create(String id, String name) {
        return UserEntity.builder()
                .id(id)
                .name(name)
                .build();
    }

    public UserDto toPort() {
        return UserDto.of(this.id, this.name);
    }
}
