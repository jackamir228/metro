package com.example.metro;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
public class Metro {
    City city;
    List<Line> lines;

    public Metro(City city, List<Line> lines) {
        this.city = city;
        this.lines = lines;
    }
}
