package TaskOne.One;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Куницин Егор", "+ 791345345345");
        map.put("Куницине Виктор", "+ 79345343452");
        map.put("Рязанве Ким", "+ 791345435345");
        map.put("Генн Егор", "+ 791345354");
        map.put("Алик Чик", "+ 7913453453");
        map.put("Блуд Виктор", "+ 7914564645");
        map.put("Сандро Артем", "+ 79457467472");
        map.put("Градский Павел", "+ 7913156542");
        map.put("Лимон Жиган", "+ 7913576562");
        map.put("Лечин Егор", "+ 79131565642");
        map.put("Куницин Иван", "+ 79131356562");
        map.put("Романов Вечеслав", "+ 7915656042");
        map.put("Хороший Николай", "+ 7913565642");
        map.put("Баранов Даниил", "+ 791313765742");
        map.put("Труш Александр", "+ 79131456342");
        map.put("Никогосян Алексей", "+ 7913578752");
        map.put("Тучин Иван", "+ 791356756");
        map.put("Покин Данил", "+ 79135857042");
        map.put("Тучина Виктория", "+ 7913564564756");
        map.put("Смазнев Даниил", "+ 791354567042");

        for(Map.Entry<String,String> entry: map.entrySet() ){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

}
