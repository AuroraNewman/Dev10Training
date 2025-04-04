package learn;
//from https://leetcode.com/problems/powx-n/
public class Pow {
    public double myPow(double x, int n) {
        if (n == 0){
            return x;
        } else {
            return x * myPow( x, n -1);
        }
    }
    public double myPower(double x, int n){
        if (x == 1){
            return 1;
        }
        double result = 1;
        boolean nNotZero = true;
        while (nNotZero){
            if (n > 0) {
                result *= x;
                n--;
            } else if (n < 0) {
                result /= x;
                n++;
            }
            if (n == 0){
                nNotZero = false;
            }
        }
        return result;
    }
}
