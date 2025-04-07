package learn;

public class Main {
    public static void main(String[] args) {
        BinaryConversion bc = new BinaryConversion();
//        System.out.println(bc.binaryToInt("1000"));

        int num = -1;
        String number;
        for (int i = 0; i < 10; i++){
            number = bc.intToBinary(num);
            System.out.println(number);
            System.out.println(bc.binaryToInt(number));
            num*=2;
        }
    }
}