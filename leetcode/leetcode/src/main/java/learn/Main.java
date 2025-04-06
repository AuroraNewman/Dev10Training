package learn;

public class Main {
    public static void main(String[] args) {
        RansomNote rn = new RansomNote();
        String magazine = "fluffyfoofoo";
        String ransomNote = "foofoofoo";
        System.out.println(rn.canConstruct(ransomNote, magazine));
        magazine = "slinkystairs";
        ransomNote = "siksar";
        System.out.println(rn.canConstruct(ransomNote, magazine));
        magazine = "ab";
        ransomNote = "aba";
        System.out.println(rn.canConstruct(ransomNote, magazine));
    }
}