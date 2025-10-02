package stacks.easy;

import java.util.Stack;

public class validParenthesis {
    public static boolean valParenthesis(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);

            // check for opening condition
            if(ch == '(' || ch =='[' || ch =='{'){
                s.push(ch);
            } 
            // check for closing condition
            else {
                if(s.empty()){
                    return false;
                }
                if((s.peek() == '(' && ch == ')')
                  || (s.peek() == '[' && ch == ']')
                  || (s.peek() == '{' && ch == '}') 
                ){
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        if(s.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "({})[]"; // true
        System.out.println(valParenthesis(str));
    }
}
