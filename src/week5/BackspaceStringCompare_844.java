package week5;

import java.util.Stack;

public class BackspaceStringCompare_844 {

    public static void main(String[] args) {
        BackspaceStringCompare_844 a = new BackspaceStringCompare_844();
        String s = "y#fo##f";
        String t = "y#f#o##f";
        System.out.println(a.backspaceCompare(s, t));
    }

    public boolean backspaceCompare(String s, String t) {
        Stack<String> sStack = new Stack<>();
        Stack<String> tStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String word = s.substring(i, i + 1);
            if ("#".equals(word) && !sStack.isEmpty()) {
                sStack.pop();
            }
            if(!"#".equals(word)) {
                sStack.push(word);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            String word = t.substring(i, i + 1);
            if ("#".equals(word) && !tStack.isEmpty()) {
                tStack.pop();
            }
            if(!"#".equals(word)) {
                tStack.push(word);
            }
        }
        return sStack.equals(tStack);
    }

}
