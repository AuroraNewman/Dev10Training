package learn;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            } else if (i > s.length() / 2){
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome("abba"));
        System.out.println(vp.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(vp.isPalindrome("race a car"));
        System.out.println(vp.isPalindrome(" "));
        System.out.println(vp.isPalindrome("sdfds"));
        String story = "The next day was Saturday, and Lunchbox Louie didn't have to go to work, so he took Bigfoot the Chipmunk, and King Waffle, and Wuggie Norple, and Freckleface Chilibean, and Papercup Mixmaster and Exploding Poptart, and Laughing Gas Alligator, and a big basket of lunch and they all went to Nosewort Pond for a picnic.";
        for (int i = story.length() - 1; i >= 0; i--){
            story+=story.charAt(i);
        }
        System.out.println(story);
    }
}
