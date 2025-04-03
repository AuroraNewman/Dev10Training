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
        double result = x;
        if (n < 0){
            result = 1/x;
            n++;
        }
        while (n > 1 || n < 0){
            if (n > 1) {
                result *= x;
                n--;
            } else if (n < 0){
                result /= x;
                n++;
            }
        }
        return result;
    }
}
