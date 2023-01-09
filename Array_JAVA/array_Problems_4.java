// Assignment Question -----(Problems On Arrays-1)

//Q1 - Given an array sorted in increasing order of size n and an integer x, find if there exists a pair in the array whose absolute difference is exactly x.(n>1)
/*
import java.util.*;
class array_Problems_4
{
    static void pairExists(int arr[],int n,int x)
     {
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
            if(arr[j] - arr[i] == x)
            {
               System.out.println("Yes");
               return;
            }
            }
        }
        System.out.println("No");
        
        }
     

    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length of an array : ");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter the Element of an array : ");
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      System.out.println("Enter the value of x : ");
      int x=sc.nextInt();

     
     pairExists(arr,n,x);


    }
}


//Q2 - Given an array of size n, find the total number of occurrences of given number x.

import java.util.*;
class array_Problems_4
{
    static void NoFOccurances(int arr[],int n,int x)
     {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == x)
            {
              count++;
            }
        }
       
        System.out.println(count);
        
        }
     

    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length of an array : ");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter the Element of an array : ");
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      System.out.println("Enter the value of x : ");
      int x=sc.nextInt();

     
     NoFOccurances(arr,n,x);


    }
}

*/


//Q3 - Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers. There are no duplicates in the list.

import java.util.*;
class array_Problems_4
{
    static void missingNo(int arr[],int n)
     {
       for(int i=0;i<n;i++)
       {
        if(Math.abs(arr[i]) -1 == n)
        {
            continue;
        }
        int idx = Math.abs(arr[i])-1;
        arr[idx] *= -1;
       }

       int ans=0;
       for(int i=0;i<n;i++)
       {
        if(arr[i] > 0)
        {
            ans=i+1;
            System.out.println(ans);
            return;
        }
       }
        System.out.println(n+1);
        
    }
     

    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length of an array : ");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter the Element of an array in the range 1 to n : ");
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }

     
     missingNo(arr,n);


    }
}
