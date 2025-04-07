package learn;

public class HammingWeight {
    BinaryConversion binaryConversion = new BinaryConversion();

    public int hammingWeight(int n) {
        int weight = 0;
        while (n > 0) {
            weight += n % 2;
            n = (int) n/2;
        }
        return weight;
    }
}