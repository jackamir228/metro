package com.example.metro.station;

import com.example.metro.Color;
import com.example.metro.line.Line;
import com.example.metro.Metro;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.time.Duration;
import java.util.List;

//Станция - содержит имя станции, предыдущую и следующую станцию, время перегона только до следующей станции(java.time.Duration),
//линию к которой принадлежит, станции на которые можно пересесть, ссылку на метро в которой находится.
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class Station {
    StationName name;
    //final String name;
    Station previousStation;
    Station nextStation;
    Duration transitTime;
    Line lineStation;
    Station transitStation;
    Metro metro;
    List<Station> stationsForTransit;

    public Station(//String name,
                   StationName name,
                   Station previousStation, Station nextStation,
                   Duration transitTime, Line lineStation, Station transitStation, Metro metro, Color color) {
        //this.name = name;
        this.name = name;
        this.previousStation = previousStation;
        this.nextStation = nextStation;
        this.transitTime = transitTime;
        this.lineStation = lineStation;
        this.transitStation = transitStation;
        this.metro = metro;
    }

    public Station(Line lineStation, StationName name, Duration transitTime,
                   List<Station> stationsForTransit) {
        this.lineStation = lineStation;
        this.name = name;
        this.transitTime = transitTime;
        this.stationsForTransit = stationsForTransit;
    }

    public Station(StationName name, Station nextStation, Duration transitTime, Line lineStation,
                   Station transitStation, Metro metro, List<Station> stationsForTransit) {
        this.name = name;
        this.nextStation = nextStation;
        this.transitTime = transitTime;
        this.lineStation = lineStation;
        this.transitStation = transitStation;
        this.metro = metro;
        this.stationsForTransit = stationsForTransit;
    }
}
