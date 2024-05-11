package com.example.metro.station;

import com.example.metro.line.Line;
import com.example.metro.station.Station;
import com.example.metro.station.StationName;

import java.time.Duration;
import java.util.List;

public class EndStation extends Station {
    public EndStation(Line lineStation, StationName name, Duration transitTime, List<Station> stationsForTransit) {
        super(lineStation, name, transitTime, stationsForTransit);
    }
}
