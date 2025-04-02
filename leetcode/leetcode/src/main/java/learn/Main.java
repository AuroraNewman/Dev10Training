package learn;

public class Main {
    public static void main(String[] args) {
        ReversePolishNotation rpn = new ReversePolishNotation();
        String[] tokens1 = {"2","1","+","3","*"};
        String[] tokens2 = {"4","13","5","/","+"};
        String[] tokens3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(rpn.evalRPN(tokens1));
        System.out.println(rpn.evalRPN(tokens2));
        System.out.println(rpn.evalRPN(tokens3));
    }
}