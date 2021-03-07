package lesson12;

import java.util.ArrayList;

public class soru02 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int toplam = 0;
        for (Integer sayi : list) {
            int sayınınkaresi = sayi * sayi;
            toplam += sayınınkaresi;
        }
        System.out.println("sonuç: " + toplam);
    }
}
