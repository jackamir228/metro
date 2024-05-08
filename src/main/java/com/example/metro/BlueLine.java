package com.example.metro;

import java.util.List;

import static com.example.metro.Color.BLUE;

public class BlueLine extends Line {
    public BlueLine(Color color, List<Station> stations, Metro metro) {
        super(BLUE, stations, metro);
    }

}
