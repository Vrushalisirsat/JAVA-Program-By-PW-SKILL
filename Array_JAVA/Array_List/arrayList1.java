// ArrayList In Java
/*
import java.util.ArrayList;
class arrayList1
{
    public static void main(String args[])
    {
        //wrapper classes  : * a class whose object contains or wrap premitive datatype . , * object of wrapper class contains a field which stores premitive datatype.
        Integer i = Integer.valueOf(4);
        System.out.println(i);
        Float f = Float.valueOf(89.60f);
        System.out.println(f);
        Character c = Character.valueOf('V');
        System.out.println(c);

      // Syntax to create ArrayList :-->    List<AnyClass> list = new ArrayList<AnyClass();
    // Example-:
    //   ArrayList<Boolean> l1 = new ArrayList<Boolean>();
    //   ArrayList<Float> l1 = new ArrayList<Float>();
    //   ArrayList<Character> l1 = new ArrayList<Character>();

         ArrayList<Integer> l1 = new ArrayList<Integer>();

         // add new element
         l1.add(5);
         l1.add(6);
         l1.add(7);
         l1.add(8);

         // get an element at index i
         System.out.println(l1.get(2));

         // print with for loop
         for(int i=0;i<l1.size();i++)
         {
             System.out.println(l1.get(i));
         }

         // printing arraylist directly
          System.out.println(l1);

          // adding element at some index
          l1.add(1,100);
          System.out.println(l1);
        
        // modifying element at index i
        l1.set(3,10);
        System.out.println(l1);

        // removing an element at index i
        l1.remove(1);
        System.out.println(l1);

        // removing an element e
        l1.remove(Integer.valueOf(5));   //element present in arraylist
        System.out.println(l1);

        l1.remove(Integer.valueOf(22));      //element not present in arraylist
        System.out.println(l1);


       // checking if an element exists
       Boolean ans = l1.contains(Integer.valueOf(6));
       System.out.println(ans);

       // If you dont specify class, you can put anything inside
       ArrayList l = new ArrayList();
       l.add("Vrushali");
       l.add(24);
       l.add(75.15);
       l.add(true);
       System.out.println(l);
   
    }
}


 
// Program Question on ArrayList

// Q.1 Write a program to Reverse the given ArrayList.

//Method-1 :

import java.util.ArrayList;
class arrayList1
{
    static void reverseList(ArrayList<Integer> list)
    {
         int i=0, j=list.size()-1;

         while(i < j)
         {
            int temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp); 

            i++;
            j--;
         }
    }

    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println("Original List " + list);
        reverseList(list);
        System.out.println("Reversed List " + list);

    }
}

// Methos - 2 : By using/import Collections class ------No need to write separate code for reverse

import java.util.ArrayList;
import java.util.Collections;
class arrayList1
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(92);
        list.add(36);
        list.add(22);
        list.add(51);
        list.add(63);
        list.add(27);

        System.out.println("Original List " + list);
        Collections.reverse(list);
        System.out.println("Reversed List " + list);

    }
}
*/

// Sorting ArrayList By using------Collections class

import java.util.ArrayList;
import java.util.Collections;
class arrayList1
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(92);
        list.add(36);
        list.add(22);
        list.add(51);
        list.add(63);
        list.add(27);

        System.out.println("Original List : " + list);
        Collections.sort(list);
        System.out.println("Accending Order List : " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Decending Order List : " + list);

       ArrayList<String> l1 = new ArrayList<>();
       l1.add("Welcome");
       l1.add("To");
       l1.add("Physics");
       l1.add("Wallha");
       System.out.println("Original List : " + l1);
       Collections.sort(l1);
       System.out.println("Sorted Order : " + l1);
      // Collections.reverse(l1);                      // OR : Collections.sort(list, Collections.reverseOrder());
       System.out.println("Reversed List " + l1);
    }
}
