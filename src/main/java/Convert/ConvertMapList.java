package Convert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertMapList {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "name1");
        map.put(2, "name2");
        map.put(3, "name3");

        //Конвертация Map в List
        List<Integer> keyList = new ArrayList<>(map.keySet()); //key list
        List<String> valueList = new ArrayList<>(map.values()); //value list
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(); //key-value list
        }
    }
