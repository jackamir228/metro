package com.example.metro.station;

import com.example.metro.line.Line;
import com.example.metro.Metro;

import java.time.Duration;
import java.util.List;

public class FirstStation extends Station {
    public FirstStation(StationName name, Station nextStation, Duration transitTime, Line lineStation,
                        Station transitStation, Metro metro, List<Station> stationsForTransit) {
        super(name, nextStation, transitTime, lineStation, transitStation, metro, stationsForTransit);
    }
}
