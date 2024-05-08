package com.example.metro;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum City {
    PERM,
    MOSCOW,
    SAMARA

}
