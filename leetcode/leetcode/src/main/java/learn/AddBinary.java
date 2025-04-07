package learn;
//problem 67
//from https://leetcode.com/problems/add-binary/description/
public class AddBinary {


    public String addBinary(String a, String b) {
        String shortString;
        String longString;
        String result = "";

        if (a.length() < b.length()){
            shortString = a;
            longString = b;
        } else {
            shortString = b;
            longString = a;
        }

        while (shortString.length() < longString.length()){
            shortString = insertCharAtFront(shortString, '0');
        }

        int carry = 0;

        for (int i = shortString.length() - 1; i >= 0; i--){
            int sum = carry + Integer.parseInt(String.valueOf(shortString.charAt(i))) + Integer.parseInt(String.valueOf(longString.charAt(i)));
            carry = (int) sum / 2;
            result = insertCharAtFront(result, (char) ('0' + sum % 2));
        }
        if (carry == 1){
            result = insertCharAtFront(result, '1');
        }

        return result;
    }
    private String insertCharAtFront(String original, char toInsert){
        StringBuilder stringBuilder = new StringBuilder(original);
        stringBuilder.insert(0, toInsert);
        return stringBuilder.toString();
    }
}
