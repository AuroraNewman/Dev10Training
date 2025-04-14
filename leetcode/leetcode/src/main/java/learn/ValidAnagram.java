package learn;

import java.util.HashMap;

/*
problem 242
https://leetcode.com/problems/valid-anagram/description/
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> letterCount = new HashMap<>();
        for (Character c : s.toCharArray()){
            if (letterCount.containsKey(c)){
                letterCount.put(c, letterCount.get(c) + 1);
            } else {
                letterCount.put(c, 1);
            }
        }

        for (Character c : t.toCharArray()){
            if (letterCount.containsKey(c)){
                letterCount.put(c, letterCount.get(c) - 1);
                if (letterCount.get(c) < 0){
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.isAnagram("anagram", "nagaram"));
        System.out.println(va.isAnagram("foo", "fighters"));
        System.out.println(va.isAnagram("rat", "car"));
    }
}
