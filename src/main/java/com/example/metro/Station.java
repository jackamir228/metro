package com.example.metro;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.time.Duration;

//Станция - содержит имя станции, предыдущую и следующую станцию, время перегона только до следующей станции(java.time.Duration),
//линию к которой принадлежит, станции на которые можно пересесть, ссылку на метро в которой находится.
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class Station {
    //StationName name;
    final String name;
    Station previousStation;
    Station nextStation;
    Duration transitTime;
    Line lineStation;
    Station transitStation;
    Metro metro;

    public Station(String name, Station previousStation, Station nextStation,
                   Duration transitTime, Line lineStation, Station transitStation, Metro metro) {
        this.name = name;
        this.previousStation = previousStation;
        this.nextStation = nextStation;
        this.transitTime = transitTime;
        this.lineStation = lineStation;
        this.transitStation = transitStation;
        this.metro = metro;
    }
}
