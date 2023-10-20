package week5;

public class ValidPalindrome_125 {

    public static void main(String[] args) {
        ValidPalindrome_125 a = new ValidPalindrome_125();
        String s = "9P";
        System.out.println(a.isPalindrome(s));
    }

    public boolean isPalindrome(String s) {
        String ss = s.trim().toLowerCase();
        String newString = "";

        for (int i = 0; i < ss.length(); i++) {
            char word = ss.charAt(i);
            if((word>= 97 && word<=122) || (word>=48 && word<=57)){
                newString += ss.substring(i, i+1);
            }
        }
        int left = 0;
        int right = newString.length()-1;
        while(left <= right) {
            String leftWord = newString.substring(left, left+1);
            String rightWord = newString.substring(right, right+1);
            if(!leftWord.equals(rightWord)){
                return false;
            }
            right -=1;
            left +=1;
        }
        return true;
    }
}
