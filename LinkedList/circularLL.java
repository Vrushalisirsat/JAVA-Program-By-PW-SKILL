class circularLL
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
    
    //display whole LinkedList
    public static void displaySinglyCircularLL(Node head)
    {
          Node currNode = head;
    do {
        System.out.print(currNode.val + " "); // process the data in the node
        currNode = currNode.next;
    } while (currNode != head);
        System.out.println();
    }

    public static void displayDoublyCircularLL(Node head)
    {
             Node currNode = head;
    do {
        System.out.print(currNode.val + " " );   // process the data in the node
        currNode = currNode.next;
    } while (currNode != head);
    }

    //display reverse LinkedList
    public static void displayRev(Node tail)
    {
        Node temp = tail;
        while(temp!=null)
        {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        //4 2 99 13 10
        Node a = new Node(4);
        Node b = new Node(2);
        Node c = new Node(99);
        Node d = new Node(13);
        Node e = new Node(10);

        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=a;
        
        displaySinglyCircularLL(a);
        displayDoublyCircularLL(a);

    }
}