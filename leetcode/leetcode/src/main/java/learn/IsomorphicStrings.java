package learn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
problem 205
https://leetcode.com/problems/isomorphic-strings/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> characterMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            if (characterMap.containsKey(s.charAt(i))){
                if (characterMap.get(s.charAt(i)) == t.charAt(i)){
                    //pass
                } else {
                    return false;
                }
            } else if (characterMap.values().contains(t.charAt(i))){
                return false;
            } else {
                characterMap.put(s.charAt(i), t.charAt(i));
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsomorphicStrings().isIsomorphic("egg", "add"));
        System.out.println(new IsomorphicStrings().isIsomorphic("foo", "bar"));
        System.out.println(new IsomorphicStrings().isIsomorphic("paper", "title"));
        System.out.println(new IsomorphicStrings().isIsomorphic("bbbaaaba", "aaabbbba"));
        System.out.println(new IsomorphicStrings().isIsomorphic("badc", "baba"));
    }
}
