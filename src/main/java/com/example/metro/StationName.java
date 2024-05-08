package com.example.metro;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public enum StationName {
   //red line
    SPORTIVNAYA,
    MEDVEKOVSKAYA,
    MOLODEZHNAYA,
    PERM1,
    PERM2,
    DVORETS_KULTURY,
    //blue line
    PATSANSKAYA,
    KIROV_STREET,
    TAZHMASH,
    NIZHNEKAMSKAYA,
    SOBORNAYA


}
