package com.example.metro;

import com.example.metro.station.StationName;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MetroApplication {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext("metro");

//		Metro metro = context.getBean(Metro.class);
////		metro.addNewLine(Color.BLUE);
//		List<Line> lines;
//		Metro metro1 = new Metro(City.MOSCOW);
//		metro1.addLine(Color.BLUE);
//		metro1.addLine(Color.BLUE);

		//1.8 Создать Runner и в нем создать метро для Перми, описанное выше. Ожидаемый вывод для метро:
		//   //Metro{city='Пермь', lines=[Line{color='Красная', stations=[Station{name='Спортивная', changeLines=null'}, Station{name='Медведковская',
		//    // changeLines=null'}, Station{name='Молодежная', changeLines=null'}, Station{name='Пермь 1', changeLines=Синяя'}, Station{name='Пермь 2',
		//    // changeLines=null'}, Station{name='Дворец Культуры', changeLines=null'}]}, Line{color='Синяя', stations=[Station{name='Пацанская', changeLines=null'},
		//    // Station{name='Улица Кирова', changeLines=null'}, Station{name='Тяжмаш', changeLines=Красная'}, Station{name='Нижнекамская', changeLines=null'},
		//    // Station{name='Соборная', changeLines=null'}]}]}
		Metro metro = new Metro(City.PERM);
		metro.addLine(Color.RED);
		metro.addStation(StationName.SPORTIVNAYA, )

	}

}
