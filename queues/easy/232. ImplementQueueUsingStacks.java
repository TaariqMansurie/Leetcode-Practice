package queues.easy;
import java.util.*;

class ImplementQueueUsingStacks {
        static Stack<Integer> s1 ;
        static Stack<Integer> s2 ;

    public ImplementQueueUsingStacks() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public static void push(int x) {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    
    public static int pop() {
        if(s1.isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        return s1.pop();
    }
    
    public static int peek() {
        if(s1.isEmpty()){
            System.out.println("queue is empty");
            return -1;
            }
        return s1.peek();
    }
    
    public static boolean empty() {
        return s1.isEmpty();
    }

    public static void main(String[] args) {
        ImplementQueueUsingStacks q = new ImplementQueueUsingStacks();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.peek()); // 1
        System.out.println(q.pop());  // 1
        System.out.println(q.peek()); // 2
        System.out.println(q.empty()); // false
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
