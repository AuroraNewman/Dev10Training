package learn;

import java.util.*;

/*
#49
https://leetcode.com/problems/group-anagrams/description/
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();
        for (String s : strs){
            char[] asChars = s.toCharArray();
            Arrays.sort(asChars);
            anagrams.putIfAbsent(String.valueOf(asChars), new ArrayList<String>());
            anagrams.get(String.valueOf(asChars)).add(s);
            }

        return anagrams.values().stream().toList();
    }

    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        ga.groupAnagrams(strs);
    }
}
