import java.util.*;
 
 
class Node {
   public int data;
   public Node next, prev;
 
 
   public Node(int data) {
       this.data = data;
       next = prev = null;
   }
}
 
 
class LinkedList {
   public Node head = null, tail = null;
 
 
   public void insert(int val) {
       if (head == null) {
           head = tail = new Node(val);
           return;
       }
       Node newNode = new Node(val);
       tail.next = newNode;
       newNode.prev = tail;
       tail = newNode;
   }
 
 
   public void print() {
       Node curr = head;
       while (curr != null) {
           System.out.print(curr.data + "->");
           curr = curr.next;
       }
       System.out.println("null");
   }
}
 
 
public class criticalPoint {
   public static boolean is_critical_point(Node node) {
       if (node.next.data > node.data && node.prev.data > node.data)
           return true;
       return node.next.data < node.data && node.prev.data < node.data;
   }
 
 
   public static ArrayList<Integer> findMaxMin(Node head) {
       ArrayList<Integer> ans = new ArrayList<Integer>(Arrays.asList(2000000000, 2000000000));
       int first = -1, last = -1;
       Node tail = head;
       while (tail.next != null) {
           tail = tail.next;
       }
       Node curr = tail.prev;
       if (curr == null)
           return new ArrayList<Integer>(Arrays.asList(-1, -1));
       int pos = 0;
       while (curr != head) {
           if (is_critical_point(curr)) {
               if (first != -1) {
                   ans.set(0, Math.min(ans.get(0), pos - last));
                   ans.set(1, pos - first);
                   last = pos;
               } else {
                   first = last = pos;
               }
           }
           pos++;
           curr = curr.prev;
       }
       if (ans.get(0) == 2e9) {
           ans.set(0, -1);
           ans.set(1, -1);
       }
       return ans;
   }
 
 
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       LinkedList ll = new LinkedList();
       for (int i = 0; i < n; i++) {
           ll.insert(sc.nextInt());
       }
       ArrayList<Integer> ans = findMaxMin(ll.head);
       System.out.println(ans);
   }
 
 
}