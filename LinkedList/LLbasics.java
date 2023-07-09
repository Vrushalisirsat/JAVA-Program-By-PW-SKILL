class LLbasics
{
    public static class Node 
    {
        int data;       //value / data of node
        Node next;      //address of next node

        Node(int data)
        {
            this.data = data;
        }

    }

    public static int LLlength(Node head)
    {
        int count = 0;
        while(head != null)
        {
            count++;
            head=head.next;
        }
        return count;
    }

    public static void main(String args[])
    {
        Node x = new Node(14);
        System.out.println(x.data);       // 5
        System.out.println(x.next);      // null


    // Displaying a Linked List
       Node a = new Node(54);
       Node b = new Node(6);
       Node c = new Node(7);
       Node d = new Node(8);
       Node e = new Node(9);

       a.next = b;
       b.next = c;
       c.next = d;
       d.next = e;
/*
       Node temp = a;
// 1) method-1
       for(int i=1;i<=5;i++)
       {
        System.out.print(temp.data + " ");
        temp = temp.next;
       }
    
    System.out.println();
// 2) method-2 :-
*/
     Node tem = a;
    while(tem != null)
    {
        System.out.print(tem.data + " -> ");
        tem = tem.next;
    }
    System.out.println("null");


// 2) method-3 :- Recursive

    // public static void displayReverse(Node head)
    // {
    //     if(head == null)
    //     return;
    //     displayReverse(head.next);
    //     System.out.print(head.data + "->");
    // }
       

   //---------------------------------------------------------------------------------------------------------------------------------

   // Length Method :- Implement a method to find out the length of a Linked list (Iterative and Recursive)

     //Method-1 :- Iterative method

     System.out.println(LLlength(a));
     //System.out.println(LLlengthRecursive(a));

    }
}