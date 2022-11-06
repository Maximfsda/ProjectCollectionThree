package TaskOne.Three;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Maps{
    private  Map<String, Integer> map = new HashMap<>();

    public void addInformation(String key, int value){
        if(!map.containsKey(key) || !map.containsValue(value)){
            map.put(key,value);
        }
        else {
            throw new RuntimeException();
        }
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Maps maps = (Maps) o;
        return Objects.equals(map, maps.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }

    @Override
    public String toString() {
        return "Maps{" +
                "map=" + map +
                '}';
    }
}
