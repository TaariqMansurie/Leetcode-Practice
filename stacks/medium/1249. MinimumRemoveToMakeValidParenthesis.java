package stacks.medium;

public class MinimumRemoveToMakeValidParenthesis {
    // public String minRemoveToMakeValid(String s) {
    //     //initializing the counter for left and right parenthesis each
    //     int leftP =  0;
    //     int rightP = 0;

    //     // Use a stack to keep track of valid parenthesis
    //     Stack<Character> stack = new Stack<>();

    //     for(int i=0; i<s.length(); i++){
    //         char currChar = s.charAt(i);;

    //         if( currChar == '(') {
    //             leftP ++;
    //         }
    //         if( currChar == ')'){
    //             rightP ++;
    //         }

    //         if(rightP > leftP){
    //             rightP --;
    //             continue;
    //         } else {
    //             stack.push(currChar);
    //         }
    //     }

    //     StringBuilder res = new StringBuilder();
    //     while(!stack.isEmpty()){
    //         if(leftP > rightP && currChar == '('){
    //             leftP --;
    //         } else {
    //             res.append(currChar);
    //         }
    //     }

    //     return res.reverse().toString();
    // }
    public static String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> toRemove = new HashSet<>();

        // Step 1: Find unmatched parentheses
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();  // matched pair
                } else {
                    toRemove.add(i);  // unmatched ')'
                }
            }
        }

        // Step 2: Mark leftover '(' in stack
        while (!stack.isEmpty()) {
            toRemove.add(stack.pop());
        }

        // Step 3: Build final valid string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!toRemove.contains(i)) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}
