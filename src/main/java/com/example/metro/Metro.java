package com.example.metro;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
public class Metro {
    City city;
    List<Line> lines;

    public Metro(City city, List<Line> lines) {
        this.city = city;
        this.lines = lines;
    }

    //В классе метро должна быть функция "Создать новую линию" (добавляется в список линий метро).
    // Передается цвет линии. Проверка на то, что не существует линии с таким же цветом.

    public Line addNewLine(Color color) {
        Line addedLine = new Line(color);
        if (lines.stream()
                .anyMatch(line -> line.getColor().equals(addedLine.getColor()))) {
            throw new RuntimeException("Линия с таким цветом уже существует");
        }
        lines.add(addedLine);
        return addedLine;
    }

}
