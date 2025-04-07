package learn;

public class BinaryConversion {
    public String intToBinary(int num){
        String result = "";
        boolean negative = false;
        if (num == 0){
            return "0";
        } else if (num < 0){
            negative = true;
            num*=-1;
        }
        while (num > 0){
            int ones = num % 2;
            char onesC = (char) ('0' + ones);
            result = insertCharAtFront(result, onesC);
            num-=ones;
            num/=2;
        }
        if (negative){
            result = insertCharAtFront(result, '-');
        }
        return result;
    }
    public int binaryToInt(String number){
        int result = 0;
        boolean negative = false;
        if (number.charAt(0) == '-'){
            negative = true;
            number = deleteCharAtFront(number);
        }

        while (!number.isEmpty()){
            int digit = Integer.parseInt(String.valueOf(number.charAt(0)));
            int power = number.length() - 1;
            result += digit * (int) Math.pow(2, power);
            number = deleteCharAtFront(number);
        }

        if (negative){
            result*=-1;
        }

        return result;
    }
    private String insertCharAtFront(String original, char toInsert){
        StringBuilder stringBuilder = new StringBuilder(original);
        stringBuilder.insert(0, toInsert);
        return stringBuilder.toString();
    }
    private String deleteCharAtFront(String number){
        StringBuilder stringBuilder = new StringBuilder(number);
        return stringBuilder.deleteCharAt(0).toString();
    }
}