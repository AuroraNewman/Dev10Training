package learn;

import java.util.HashMap;

//problem 383
//from https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()){
            return false;
        }
        HashMap<Character, Integer> letterCount = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++){
            Character c = magazine.charAt(i);
            if (letterCount.containsKey(c)){
                int count = letterCount.get(c) +1;
                letterCount.put(c, count);
            } else {
                letterCount.put(c, 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++){
            Character c = ransomNote.charAt(i);
            if (!letterCount.containsKey(c)){
                return false;
            } else {
                int count = letterCount.get(c) - 1;
                if (count < 0){
                    return false;
                } else {
                    letterCount.put(c, count);
                }
            }
        }

        return true;
    }
}
