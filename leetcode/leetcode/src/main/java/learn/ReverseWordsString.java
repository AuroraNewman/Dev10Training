package learn;
//#151
//from https://leetcode.com/problems/reverse-words-in-a-string/
public class ReverseWordsString {
    public String reverseWords(String s) {
        String result = "";
        s = s.trim();
        while (s.contains("  ")){
            s=s.replace("  ", " ");
        }
        String[] split = s.split(" ");
        String delimiter = "";
        for (int i = split.length - 1; i >= 0; i--){
            result += delimiter;
            result += split[i];
            delimiter = " ";
        }

        return result;
    }
}
