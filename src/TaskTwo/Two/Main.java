package TaskTwo.Two;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Жора",0);
        map.put("Жора1",1);
        map.put("Жора2",2);
        map.put("Жора3",3);
        map.put("Жора4",4);
        map.put("Жора5",5);
        map.put("Жора6",6);
        map.put("Жора7",7);
        map.put("Жора8",8);
        map.put("Жора9",9);

        for (Map.Entry entry: map.entrySet()) {

            System.out.println(entry.getKey()+ ":" + entry.getValue());

        }


    }

}
