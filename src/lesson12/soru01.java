package lesson12;

public class soru01 {
    public static void main(String[] args) {
        int[] int_array = {3,4,5,6};
        int carpım = 1;
        for(Integer sayı : int_array){
            carpım *= sayı;

        }
        System.out.println("çarpım: " + carpım);
    }
}
