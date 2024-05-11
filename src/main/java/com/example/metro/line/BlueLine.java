package com.example.metro.line;

import com.example.metro.Color;
import com.example.metro.Metro;
import com.example.metro.line.Line;
import com.example.metro.station.Station;

import java.util.List;

import static com.example.metro.Color.BLUE;

public class BlueLine extends Line {
    public BlueLine(Color color, List<Station> stations, Metro metro) {
        super(BLUE, stations, metro);
    }

    public BlueLine(Color color) {
        super(color);
    }
}
