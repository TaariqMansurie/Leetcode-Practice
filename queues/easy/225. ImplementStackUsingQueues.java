package queues.easy;
import java.util.*;


    class ImplementStackUsingQueues{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public ImplementStackUsingQueues() {
        }
        
        public static void push(int x) {
            if(!q1.isEmpty()) q1.add(x);
            else q2.add(x);
        }
        
        public static int pop() {
            if(empty()) return -1;
            int top = -1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    if(q1.isEmpty()) break;
                    q2.add(top);
                }
            } else {
                while(!q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()) break;
                    q1.add(top);
                }
            }
            return top;
        }
        
        public static int top() {
            if(empty()) return -1;
            int top = -1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    // if(q1.empty()) break;
                    q2.add(top);
                }
            } else {
                while(!q2.isEmpty()){
                    top = q2.remove();
                    // if(q2.empty()) break;
                    q1.add(top);
                }
            }
            return top;
        }
        
        public static boolean empty() {
            return q1.isEmpty() && q2.isEmpty();
        }
    
    public static void main(String[] args) {
        ImplementStackUsingQueues s = new ImplementStackUsingQueues();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.empty()){
            System.out.println(s.top());
            s.pop();
        }
        // s.top(); // return 2
        // s.pop(); // return 2
        // s.empty(); // return False
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

