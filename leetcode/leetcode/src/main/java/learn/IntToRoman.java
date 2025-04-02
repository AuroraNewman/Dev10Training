package learn;
//from https://leetcode.com/problems/integer-to-roman/description/
public class IntToRoman {
    public String intToRoman(int num) {
        String result = "";
        int thousands = (int) Math.floor(num / 1000);
        while (thousands > 0){
            result += "M";
            num -= 1000;
            thousands--;
        }
        int hundreds = (int) Math.floor(num / 100);
        if (hundreds == 9) {
            result += "CM";
            num -= 900;
            hundreds -= 9;
        } else if (hundreds >= 5) {
            result += "D";
            num -= 500;
            hundreds -= 5;
        } else if (hundreds == 4) {
            result += "CD";
            num -= 400;
            hundreds -= 4;
        }
        while (hundreds > 0){
            result+="C";
            num -= 100;
            hundreds--;
        }

        int tens = (int) Math.floor(num/10);
        if (tens == 9) {
            result += "XC";
            num  -=  90;
            tens -= 9;
        } else if (tens >= 5) {
            result += "L";
            num -= 50;
            tens -= 5;
        } else if (tens == 4) {
            result += "XL";
            num -= 40;
            tens -= 4;
        }
        while (tens > 0){
            result += "X";
            num -= 10;
            tens--;
        }

        int ones = num % 10;
        if (ones == 9) {
            result += "IX";
            num -= 9;
            ones -= 9;
        } else if (ones >= 5) {
            result += "V";
            num -= 5;
            ones -= 5;
        } else if (ones == 4) {
            result += "IV";
            num -= 4;
            ones -= 4;
        }
        while (ones > 0){
            result+="I";
            num -= 1;
            ones--;
        }
        return result;
    }
}
