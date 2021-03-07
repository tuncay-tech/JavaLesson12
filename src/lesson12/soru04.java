package lesson12;

public class soru04 {
    public static void main(String[] args) {

        String isim ="cemalettin";
        String[] harfler= isim.split("");
        for (String harf : harfler){
            System.out.println(harf);
        }
    }
}
