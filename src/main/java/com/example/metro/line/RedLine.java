package com.example.metro.line;

import com.example.metro.Color;
import com.example.metro.Metro;
import com.example.metro.line.Line;
import com.example.metro.station.Station;

import java.util.List;

import static com.example.metro.Color.RED;

public class RedLine extends Line {

    public RedLine(Color color, List<Station> stations, Metro metro) {
        super(RED, stations, metro);
    }

    public RedLine(Color color) {
        super(color);
    }
}
