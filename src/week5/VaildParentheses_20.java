package week5;

import java.util.Stack;

public class VaildParentheses_20 {

    public static void main(String[] args) {
        VaildParentheses_20 a = new VaildParentheses_20();
        String s = "()]";
        System.out.println(a.isValid(s));
    }

    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String ss = s.substring(i, i + 1);
            if (ss.equals("(") || ss.equals("{") || ss.equals("[")) {
                stack.push(ss);
            }else {
                if(stack.empty()){
                    return false;
                }
                if (ss.equals("]")) {

                    String pop = stack.pop();
                    if (!pop.equals("[")) {
                        return false;
                    }
                }
                if (ss.equals("}")) {
                    String pop = stack.pop();
                    if (!pop.equals("{")) {
                        return false;
                    }
                }
                if (ss.equals(")")) {
                    String pop = stack.pop();
                    if (!pop.equals("(")) {
                        return false;
                    }
                }
            }

        }
        return stack.empty();
    }
}
