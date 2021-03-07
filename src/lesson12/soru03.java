package lesson12;

public class soru03 {
    public static void main(String[] args) {
        String[] array1 = {"a", "b", "c"};
        String[] array2 = {"a", "b", "d"};
        for (String eleman1 : array1) {
            for (String eleman2 : array2) {
                if (eleman1.equals(eleman2)) {
                System.out.println(eleman2);
            }
        }

        }
    }
}
