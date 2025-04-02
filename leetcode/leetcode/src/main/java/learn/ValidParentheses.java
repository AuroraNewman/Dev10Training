package learn;

import java.util.Stack;

//from https://leetcode.com/problems/valid-parentheses/description/
public class ValidParentheses {
    public boolean isValid(String s){
        Stack<Character> myStack = new Stack<>();
//        go through the string adding open parentheses etc to the stack
//        if the close parentheses remove from the stack
//        check that the stack is empty

        for (int i = 0; i < s.length(); i++){
            Character check = s.charAt(i);
            if (check == '(' || check == '{' || check == '['){
                myStack.push(check);
            } else {
                if (myStack.isEmpty()){
                    return false;
                } else if (check == ')' && myStack.pop() != '(') {
                    return false;
                } else if (check == '}' && myStack.pop() != '{') {
                    return false;
                } else if (check == ']' && myStack.pop() != '[') {
                    return false;
                }
            }
        }
        return myStack.isEmpty();
    }
}
