// Assignment Qustions

//Q.1 Given an unsorted arr[] of size N having both negative and positive integers,place all negative elements at the end of array without changing the order of positive elements and negative elements.
/*
import java.util.*;
class array_Problems_2
{

    static void place_Element(int arr[],int N)
    {
        int[] ans =new int[N];
        int temp=0;
        for(int i=0;i<N;i++)
        {
            if(arr[i] >= 0)
            {
                ans[temp]=arr[i];
                temp++;
            }
        }

        for(int i=0;i<N;i++)
        {
            if(arr[i] < 0)
            {
                ans[temp]=arr[i];
                temp++;
            }
        }


        for(int i=0;i<arr.length;i++)
        {
            System.out.print(ans[i] + " ");
        }


    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array : ");
        int N = sc.nextInt();

        int arr[]=new int[N];
      
        System.out.println("Enter elements of array : ");
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.print("arr[] = ");
        for(int i=0;i<N;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


       place_Element(arr,N);


    }
}



//Q.2 Given two arrays a[] & b[] of size n and m resp. where m>=n.The task is to find union between these two arrays and print the number of elements of the union set.Union of the two array can be defined as the set containing distinct elements from both the arrays.If there are repetations,then only onw occurences of element should be printed.








//Q.3 given an array arr[] and an integer K,where K is smaller than size of array.the task is to find the Kth smallest element in the given array.It is given that all array elements are distinct.

import java.util.Arrays;
import java.util.*;
class array_Problems_2
{

   static int[] KthsmallestAndLargestElement(int[] arr , int k)
   {
    Arrays.sort(arr);
    int[] ans = {arr[k-1] , arr[arr.length-k]};
    return ans;

   }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array : ");
        int N = sc.nextInt();

        int arr[]=new int[N];
      
        System.out.println("Enter elements of array : ");
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.println("arr[] = ");
        for(int i=0;i<N;i++)
        {
            System.out.print(arr[i] + " ");
        }
           
           System.out.println();

        System.out.println("Enter Kth Element : ");
        int k=sc.nextInt();




        int[] ans = KthsmallestAndLargestElement(arr,k);
        System.out.println("Kth Smallest Element = " + ans[0]);
        System.out.println("Kth Largestlest Element = " + ans[1]);



    }
}

*/

//Q.4 Given an unsorted array A of size N that contains only non-negative integers,find a continuous sub-arrays,return the subarray which comes first on moving from left to right.You need to print the start and end index of answer subarray.



//Q.5 Write a java program to test the equality of two arrays.

import java.util.*;
class array_Problems_2
{

    static boolean check_Element(int arr1[],int arr2[],int n,int m)
    {
       
        boolean count=true;
        for(int i=0;i<n;i++)
        {
            if(arr1[i] != arr2[i])
            {
                count=false;
                break;
            }
        }
        return count;


    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array : ");
        int n= sc.nextInt();
        int m = sc.nextInt();

        int arr1[]=new int[n];
        int arr2[]=new int[n];

      
        System.out.println("Enter 1st elements of array : ");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter 2nd elements of array : ");
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }

    


       System.out.println(check_Element(arr1,arr2,n,m));


    }
}