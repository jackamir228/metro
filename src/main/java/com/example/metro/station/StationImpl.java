package com.example.metro.station;

import com.example.metro.Color;
import com.example.metro.line.Line;
import com.example.metro.Metro;

import java.time.Duration;

public class StationImpl extends Station {
    public StationImpl(StationName name, Station previousStation, Station nextStation, Duration transitTime,
                       Line lineStation, Station transitStation, Metro metro, Color color) {
        super(name, previousStation, nextStation, transitTime, lineStation, transitStation, metro, color);
    }
}
