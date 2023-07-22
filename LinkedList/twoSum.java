// check the sum of any 2 node in an list is equal to target or not.
//solve by using 2 sum :-

class twoSum
{
    public static class Node
    {
        int val;
        Node next;
        Node prev;
        Node(int val)
        {
            this.val = val;
        }
    }
    
   public static void twoSumDLL(Node head,int target)
   {
    Node temp=head;
    while(temp.next!=null)
    {
        temp=temp.next;
    }
    

    Node h = head;
    
    while(h != temp)
    {
     if(h.val + temp.val == target)
     {
     System.out.print("[" + h.val + "," + temp.val + "]");
     break;
     }
     else if(h.val+temp.val > target)
     temp=temp.prev;
     else
     h=h.next;
    }
    System.out.print("[-1" + "," + "-1]");
   }

    public static void main(String args[])
    {
        //4 2 99 13 10
        Node a = new Node(37);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(13);
        Node e = new Node(100);

        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        

        int target=16;
        twoSumDLL(a,target);

    }
}