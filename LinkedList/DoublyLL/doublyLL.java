class doublyLL
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
    public static void display(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
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

    //displayRandom LinkedList
    public static void displayRandom(Node random)
    {
        Node temp = random;
        //move this temp backwards to the head
        while(temp.prev!=null)
        {
            temp = temp.prev;
        }
        //print the list
         while(temp!=null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    //insert node at head
    public static Node insertAtHead(Node head,int x)
    {
        Node t = new Node(x);
        t.next=head;
        head.prev=t;
        head=t;

        return head;
    }
     
     
    //insert node at tail
    public static void insertAtTail(Node tail,int x)
    {
        Node temp = tail;
        //traverse temp to tail
        while(temp.next != null)
        {
            temp = temp.next;
        }

        Node t = new Node(x);
        temp.next = t;
        t.prev=temp;

    }

    public static void insertAtIndex(Node head,int ind,int n)
    {
        Node s = head;
        for(int i=1;i<ind;i++)
        {
            s=s.next;
        }
        //s is at ind position;
        Node r = s.next;  //ind
        Node t = new Node(n);
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;

    }
   
    //delete head
    public static Node deleteHead(Node head)
    {
        head = head.next;
        head.prev = null;
        return head;
    }

    //delete tail
    public static Node deleteTail(Node head)
    {
        Node tail=head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
       return head;
    }
    
    //delete node at index
    public static Node deleteAtIndex(Node head,int ind)
    {
        Node temp=head;
        for(int i=1;i<ind;i++) {
            temp = temp.next;
        }

       temp.next = temp.next.next;
       temp.next.prev = temp;
       return head;
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
        e.next=null;
        
        display(a);
        displayRev(e);
        displayRandom(c);

        Node newHead = insertAtHead(a,35);
        display(newHead);

        insertAtTail(e,89);
        display(a);

        insertAtIndex(a,3,74);
        display(a);

        Node nNode = deleteHead(a);
        display(nNode);
        Node dNode = deleteTail(a);
        display(dNode);

        Node dn = deleteAtIndex(a,4);
        display(dn);
    }
}