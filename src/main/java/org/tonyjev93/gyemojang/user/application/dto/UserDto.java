package org.tonyjev93.gyemojang.user.application.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class UserDto {
    private String id;
    private String name;

    public static UserDto of(String id, String name) {
        return new UserDto(id, name);
    }
}
