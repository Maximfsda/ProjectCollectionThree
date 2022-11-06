package TaskTwo.One;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
        Map<String, Integer> mapOne = new HashMap<String, Integer>();

        Random random = new Random();
        map.put("str1", List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
        System.out.println(map);

        for (Map.Entry<String, List<Integer>> item : map.entrySet()) {
            List<Integer> number = item.getValue();
            String key = map.keySet().toString();
            int sum = 0;
            for (int value : number) {
                sum += value;
            }
            Map<String, Integer> maps = new HashMap<>();
            maps.put(key, sum);
            System.out.println(maps);
        }
    }
}
