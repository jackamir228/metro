package com.example.metro.line;

import com.example.metro.Color;
import com.example.metro.Metro;
import com.example.metro.station.Station;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
//Линия метро - содержит цвет линии, станции линии, ссылку на метро в которой линия находится
public abstract class Line {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line line)) return false;
        return color == line.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
