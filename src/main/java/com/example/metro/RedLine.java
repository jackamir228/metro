package com.example.metro;

import java.util.List;

import static com.example.metro.Color.RED;

public class RedLine extends Line {

    public RedLine(Color color, List<Station> stations, Metro metro) {
        super(RED, stations, metro);
    }
}
