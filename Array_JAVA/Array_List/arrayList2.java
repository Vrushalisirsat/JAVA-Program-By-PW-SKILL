// Q1. Write a Java program to insert an element into given array list of size n at the first position.

/*
import java.util.*;
import java.util.ArrayList;
class arrayList2
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter ArrayList Element : ");
        for(int i=0;i<n;i++)
        {
             list.add(sc.nextInt());
        }
        System.out.println("Enter value to be inserted in ArrayList : ");
        int x = sc.nextInt();
        list.add(0,x);
        for(int k = 0; k < list.size(); k++){
              System.out.print(list.get(k) + " ");
           }
    }
}


// Q2. Write a Java program to remove the third element from given arraylist of size n.

import java.util.*;
import java.util.ArrayList;
class arrayList2
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter ArrayList Element : ");
        for(int i=0;i<n;i++)
        {
             list.add(sc.nextInt());
        }
       
        list.remove(2);
        for(int k = 0; k < list.size(); k++){
              System.out.print(list.get(k) + " ");
           }
    }
}



// Q3. Write a Java program to swap two elements in an array list of size n.

import java.util.*;
import java.util.ArrayList;
class arrayList2
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter ArrayList Element : ");
        for(int i=0;i<n;i++)
        {
             list.add(sc.nextInt());
        }
        System.out.println("Enter index of swap element : ");
        int I1 = sc.nextInt();
        int I2 = sc.nextInt();

        Collections.swap(list, I1, I2);
       
        for(int k = 0; k < list.size(); k++){
              System.out.print(list.get(k) + " ");
           }
    }
}



// Q4. Given an input of some integers, sort the integers.

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
class arrayList2
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter ArrayList Element : ");
        for(int i=0;i<n;i++)
        {
             list.add(sc.nextInt());
        }
        
        Collections.sort(list);
       
        for(int k = 0; k < list.size(); k++){
              System.out.print(list.get(k) + " ");
           }
    }
}

*/

// Q5.Given an array of integers, print an arraylist containing only all positive integers present in the array.If no positive integers found, print 'NA'.

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
class arrayList2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < n; i++){
           arr[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
       
        for(int k = 0; k < n; k++){
            if(arr[k] >= 0)
            { 
               list.add(arr[k]);
            }
        }

        if(list.size() == 0){
           System.out.println("NA");
          return;
        }
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

    }
}