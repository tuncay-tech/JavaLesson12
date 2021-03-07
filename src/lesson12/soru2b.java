package lesson12;

import java.util.ArrayList;

public class soru2b {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int toplam = 0;
        for (Integer sayi : list) {
            double sayınınkaresi = Math.pow(sayi, 2);  // 2. kuvvet alır 4 yazarsak 4üncü kuvvet alır.
            toplam += sayınınkaresi;
        }
        System.out.println("sonuç: " + toplam);
    }
}
