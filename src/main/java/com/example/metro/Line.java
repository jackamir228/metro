package com.example.metro;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
//Линия метро - содержит цвет линии, станции линии, ссылку на метро в которой линия находится
public class Line {
    Color color;
    List<Station> stations;
    Metro metro;

    public Line(Color color, List<Station> stations, Metro metro) {
        this.color = color;
        this.stations = stations;
        this.metro = metro;
    }

    public Line(Color color) {
        this.color = color;
    }
}
