package linkedList.easy;

public class LinkedListCycle2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head ;

    public static Node tail ;

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public static Node detectCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = head.next;
            fast = head.next.next;

            if(slow == fast){
                slow = head;

                while( slow != fast){
                    slow = head.next;
                    fast = head.next;
                }
                return slow;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Node head = new Node(3);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(0);
        head.next.next.next = new Node(-4);
        head.next.next.next.next = temp;
        //3 -> 2 -> 0 -> -4
        //     ^          ^     
        //     |          |
        //     |          |
        //     -- - - - - -
        detectCycle(head);
        printList(head);
    }
}
