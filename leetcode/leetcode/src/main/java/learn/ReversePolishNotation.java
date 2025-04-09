package learn;
import java.util.Stack;
//https://leetcode.com/problems/evaluate-reverse-polish-notation/
public class ReversePolishNotation {

    public int evalRPN(String[] tokens) {
        if (tokens.length == 1){
            return Integer.parseInt(tokens[0]);
        }
        Stack<Integer> myStack = new Stack<>();
        for (int i = 0; i < tokens.length; i++){
            try {
                myStack.push(Integer.parseInt(tokens[i]));
            } catch (NumberFormatException e) {
                int first = myStack.pop();
                int second = myStack.pop();
                switch(tokens[i]){
                    case "+":
                        second += first;
                        break;
                    case "-":
                        second -= first;
                        break;
                    case "*":
                        second *= first;
                        break;
                    case "/":
                        second /= first;
                        break;
                }
                myStack.push(second);
            }
        }

        return myStack.pop();
    }
    public int evalRPNLeetCodeMethod(String[] tokens){
        Stack<Integer> s = new Stack<>();
        for (int i=0;i<tokens.length;i++) {
            if (tokens[i].equals("+")) {
                int x = s.pop();
                int y = s.pop();
                s.push(x+y);
            } else
            if (tokens[i].equals("-")) {
                int x = s.pop();
                int y = s.pop();
                s.push(y-x);
            } else
            if (tokens[i].equals("/")) {
                int x = s.pop();
                int y = s.pop();
                s.push(y/x);
            } else
            if (tokens[i].equals("*")) {
                int x = s.pop();
                int y = s.pop();
                s.push(x*y);
            } else {
                s.push(Integer.valueOf(tokens[i]));
            }

        }
        return s.pop();
    }

}
