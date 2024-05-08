package com.example.metro;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

//Станция - содержит имя станции, предыдущую и следующую станцию, время перегона только до следующей станции(java.time.Duration),
//линию к которой принадлежит, станции на которые можно пересесть, ссылку на метро в которой находится.
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class Station {
}
