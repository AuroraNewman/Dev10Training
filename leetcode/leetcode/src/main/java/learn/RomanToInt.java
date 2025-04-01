package learn;

import java.util.Arrays;

public class RomanToInt {
    public int romanToInt(String s) {
        int[] values = new int[s.length()];
        for (int i = 0; i < s.length(); i++){
            char character = s.charAt(i);
            switch (character){
                case 'M':
                    values[i] = 1000;
                    break;
                case 'D':
                    values[i] = 500;
                    break;
                case 'C':
                    values[i] = 100;
                    break;
                case 'L':
                    values[i] = 50;
                    break;
                case 'X':
                    values[i] = 10;
                    break;
                case 'V':
                    values[i] = 5;
                    break;
                case 'I':
                    values[i] = 1;
                    break;
            }
        }
        int index;
        int sum = 0;
        for (int i = 0; i < values.length; i++){
            index = i + 1;
            if (index!= values.length && values[index] > values[i]){
                sum+=values[i] * -1;
            } else {
                sum+=values[i];
            }
        }

        return sum;
    }
}
