package lesson12;

import java.util.HashMap;
import java.util.Map;

public class page10 {
    public static void main(String[] args) {
        // soru pdf den
        Map<String, String> ülkeler = new HashMap<>();
        ülkeler.put("tr", "Turkısh");
        ülkeler.put("en", "English");
        ülkeler.put("de", "German");
        ülkeler.put("ar", "Aarabic");

        boolean tr_varmı = ülkeler.containsValue("tr");
        boolean es_varmı = ülkeler.containsValue("es");

        System.out.println("trvarmı" + tr_varmı);
        System.out.println("esvarmı" + es_varmı);

        for (Map.Entry entry : ülkeler.entrySet()) {
            System.out.print(entry.getKey() + " : ");
            System.out.println(entry.getValue());
        }
        String ülke=ülkeler.get("en");
        System.out.println("ülke: " + ülke);




    }
}
