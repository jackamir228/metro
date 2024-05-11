package com.example.metro;

import com.example.metro.line.Line;
import com.example.metro.line.LineImpl;
import com.example.metro.line.RedLine;
import com.example.metro.station.EndStation;
import com.example.metro.station.FirstStation;
import com.example.metro.station.Station;
import com.example.metro.station.StationName;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Component

public class Metro {
    City city;
    List<Line> lines;

    public Metro(City city) {
        this.city = city;
    }

    //В классе метро должна быть функция "Создать новую линию" (добавляется в список линий метро).
    // Передается цвет линии. Проверка на то, что не существует линии с таким же цветом.

    public Line addLine(Color color) {
        Line addedLine = new LineImpl(color);

        if (this.lines == null) {
            this.lines = new ArrayList<>();
        }
        if (this.lines.stream()
                .anyMatch(line -> line.getColor().equals(addedLine.getColor()))) {
            throw new RuntimeException("Линия с таким цветом уже существует");
            if (color == Color.RED) {
                this.lines.add(new RedLine(color));
                System.out.println("Красная линия была успешно добавлена");
                return addedLine;
            }
            if (color == Color.BLUE) {
                this.lines.add(new RedLine(color));
                System.out.println("Синия линия была успешно добавлена");
                return addedLine;
            }
        }
        // В классе метро должна быть функция "Создать конечную станцию". Передается цвет линии, новое имя станции,
        // время перегона до данной станции для предыдущей станции, список станций на пересадку.
        // Время перегона добавляется в предыдущую станцию.
        // Должны быть проверки:
        // -Линия с таким цветом существует
        // -Проверка на существование предыдущей станции.
        // -Предыдущая станция должна не иметь следующей станции.
        // -Время перегона больше 0
        // -Станции с таким именем не существует во всех линиях.


        //линия не должна быть пустой
        //время перевозки не должно быть 0

//
//TODO сделать класс first station
        //TODO сделать класс
        public FirstStation addStation (StationName name, Station nextStation, Duration transitTime,
                Line lineStation, Station transitStation, Metro metro, Color color){
            if (this.lines == null) {
                throw new RuntimeException("Линия не может быть пустой");
            }
            if (transitTime.isZero()) {
                throw new RuntimeException("Время перегона не может быть равным нулю");
            }
            return new FirstStation(name, nextStation, transitTime,
                    lineStation, transitStation, metro, color);

        }

        public Station addEndStation (Line line, StationName name, Duration transitTimeForPrevievStation,
                List < Station > stationsForTransfer){
            if (line != null) {
                if (this.lines.stream()
                        .anyMatch(line1 -> line1.getColor().equals(line.getColor()))) {
                    throw new RuntimeException("Линия с таким цветом уже существует");
                }
                if (this.lines.stream()
                        .anyMatch(line1 -> line1.getStations()
                                .stream()
                                .anyMatch(station -> station.getPreviousStation() == null))) {
                    throw new RuntimeException("Предыдущая станция отсутствует");
                }

                if (this.lines.stream()
                        .anyMatch(line1 -> line1.getStations()
                                .stream()
                                .anyMatch(station1 -> station1.getNextStation() != null))) {
                    throw new RuntimeException("Предыдущая станция должна не иметь следующей станции");
                }
                if (transitTimeForPrevievStation.isZero()) {
                    throw new RuntimeException("Время перегона не может быть 0");
                }
                if (this.lines.stream()
                        .anyMatch(line1 -> line.getStations()
                                .stream()
                                .anyMatch(station -> station.getName().equals(name)))) {
                    throw new RuntimeException("Станции с таким именем не существует во всех линиях.");
                }
            }
            return new EndStation(line, name, transitTimeForPrevievStation, stationsForTransfer);
        }

//    1.7 Переопределить вывод в строку для Метро: имя города, список линий.
//    Переопределить вывод в строку для Линии: цвет линии, список станций.
//    Переопределить вывод в строку для Станции: имя станции, переходы на линии (цветы линии) (нет, не ошибка, именно цвет линий, а не станции пересадки).


        //Metro{city='Пермь', lines=[Line{color='Красная', stations=[Station{name='Спортивная', changeLines=null'}, Station{name='Медведковская',
        // changeLines=null'}, Station{name='Молодежная', changeLines=null'}, Station{name='Пермь 1', changeLines=Синяя'}, Station{name='Пермь 2',
        // changeLines=null'}, Station{name='Дворец Культуры', changeLines=null'}]}, Line{color='Синяя', stations=[Station{name='Пацанская', changeLines=null'},
        // Station{name='Улица Кирова', changeLines=null'}, Station{name='Тяжмаш', changeLines=Красная'}, Station{name='Нижнекамская', changeLines=null'},
        // Station{name='Соборная', changeLines=null'}]}]}
        @Override
        public String toString () {
            return "Metro{" +
                    "city=" + city +
                    ", lines=" + lines.stream().map(Line::getColor) +
                    '}';
        }
    }

