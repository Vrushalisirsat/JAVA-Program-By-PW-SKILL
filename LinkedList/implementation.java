class implementation
{
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }

    public static class linkedList
    {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int data)
        {
            Node temp = new Node(data);
            if(head == null)                //empty list
            {
              head = temp;
              tail=temp;
            }
            else{                             //non-empty list
            tail.next = temp;
            tail = temp; 
           }
        }

        void displayLL()
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
           System.out.println("null");
        }

        void insertAtHead(int data)
        {
            Node temp = new Node(data);
            if(head == null)        //empty list
            {
                head = temp;
                tail = temp;
            }
            else{                   //non-empty list
                 temp.next = head;
                 head = temp;
            }
        }

        void insertAt(int idx,int data)
        {
            Node t = new Node(data);   //create new inserted node
            Node temp = head;
            
            if(idx == 0)
            {
                insertAtHead(data);
                return;
            }
            else if(idx == size())
            {
                insertAtEnd(data);
                return;
            }
            else if(idx < 0 || idx > size())
            {
                System.out.println("Wrong index");
                return;
            }
            for(int i=0;i<=idx-1;i++)
            {
             temp = temp.next;
            } 
            t.next = temp.next;
            temp.next = t;
        }

        int getEleAt(int index)
        { 
            Node temp = head;
            if(index < 0 || index > size())
            {
                System.out.println("Wrong index");
                return -1;
            }
           
            for(int i=0;i<index;i++)
            {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteEle(int ind)
        {
            if(ind == 0)
            {
                head = head.next;
             
                return;
            }
            Node temp = head;
            for(int i=0;i<ind;i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail=temp;
          
        }

        int size()
        {
           Node temp = head;
           int count=0;
           while(temp != null)
            {
                count++;
                temp = temp.next;
            }   
            return count;
        }

    }


    public static void main(String args[])
    {
        linkedList ll = new linkedList();
        
        //InsertATbEGINING :=  TC :- O(1)
        ll.insertAtHead(12);  //12
        //InsertATEND :=  TC :- O(1) <- if tail is given  & O(n) <- if only head is given
        ll.insertAtEnd(4);   // 12 -> 4
        ll.insertAtEnd(7);   // 12 -> 4 -> 7
        ll.insertAtEnd(3);  // 12 -> 4 -> 7 -> 3
        ll.displayLL();     // 12 -> 4 -> 7 -> 3 -> null

        // length of LL := O(n)  <- if only head is given
        System.out.println(ll.size());      

        ll.insertAtHead(8);    // 8 -> 12 -> 4 -> 7 -> 3 
        ll.displayLL();        // 8 -> 12 -> 4 -> 7 -> 3 -> null

        // Insert Method :- Implement a method to insert a node at any given index.
        // TC := O(n)  , SC := O(1)
        ll.insertAt(1,10);
        ll.insertAt(0,100);      //insert 100 at index 0
        ll.displayLL();
          
        // getElement method := TC :- O(n) -> traverse 0 to idx-1;
        System.out.println(ll.getEleAt(3));     //get value at index 3 = 10

       ll.deleteEle(0);
       ll.displayLL();
    }
}