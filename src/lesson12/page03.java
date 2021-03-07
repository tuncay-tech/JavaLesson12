package lesson12;

import java.util.HashMap;
import java.util.Map;

public class page03 {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "pazartesi");
        myMap.put(2, "salı");
        myMap.put(3, "çarşamba");
        myMap.put(4, "perşembe");
        myMap.put(5, "cuma");
        myMap.put(6, "cumartesi");
        myMap.put(7, "pazar");
        boolean ikiiçeriyormu = myMap.containsKey(1);
        boolean sekiziçeriyormu = myMap.containsKey(8);
        System.out.println("ikiiçeriyormu: " + ikiiçeriyormu);
        System.out.println("sekiziçeriyormu: " + sekiziçeriyormu);
    }
}
