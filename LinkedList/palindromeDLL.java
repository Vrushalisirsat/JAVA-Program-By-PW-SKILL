class palindromeDLL
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
    
   public static boolean isPalindrome(Node head)
   {
    Node temp=head;
    while(temp!=null)
    {
        temp=temp.next;
    }

    Node h = head;
    

    while(h!=temp && h.prev!=temp)
    {
        if(h.val != temp.val)
        return false;

        h = h.next;
        temp = temp.prev;
    }
    return true;
   }

    public static void main(String args[])
    {
        //4 2 99 13 10
        Node a = new Node(4);
        Node b = new Node(2);
        Node c = new Node(9);
        Node d = new Node(2);
        Node e = new Node(4);

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
        
        if(isPalindrome(a))
        {
            System.out.println("Linked List is pallindrome");
        }
        else{
            System.out.println("Linked List is not pallindrome");
        }

    }
}