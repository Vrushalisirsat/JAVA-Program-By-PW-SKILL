// Q.1 Count the number of occurances of a particular element x.
/*
import java.util.*;
class array_Problems
{
    static int countOccurances(int[] arr , int x)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
          {
             if(arr[i] == x)
             {
                count++;
             }
          }
          return count;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n=sc.nextInt();

        int[] arr=new int[n];
   
        System.out.println("Enter "+ n + " array element :");
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        System.out.println("Enter x : ");
        int x=sc.nextInt();
        
        System.out.println("Count = " + countOccurances(arr,x));
    }
}


// Q.2 find the last occurances of an element x in a given array.

import java.util.*;
class array_Problems
{
    static int lastOccurances(int[] arr , int x)
    {
        int last_Index=-1;
        for(int i=0;i<arr.length;i++)
          {
             if(arr[i] == x)
             {
                last_Index=i;
             }
          }
          return last_Index;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n=sc.nextInt();

        int[] arr=new int[n];
   
        System.out.println("Enter "+ n + " array element :");
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        System.out.println("Enter x : ");
        int x=sc.nextInt();
        
        System.out.println("last occurances of X = " + lastOccurances(arr,x));
    }
}


// Q.3 count the number of elements that strictly greater than value x.

import java.util.*;
class array_Problems
{

     static int greaterValue(int[] arr , int x)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
          {
             if(arr[i] > x)
             {
                count++;
             }
          }
          return count;
    }


     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n=sc.nextInt();

        int[] arr=new int[n];
   
        System.out.println("Enter "+ n + " array element :");
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        System.out.println("Enter x : ");
        int x=sc.nextInt();
        
        System.out.println("Number Of Element Greater than X = " + greaterValue(arr,x));
     }
}



// Q.4 Check if the given array is sorted or not.
import java.util.*;
class array_Problems
{
    static boolean isSorted(int arr[] )
    {
        boolean check=true;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] < arr[i-1])
            {
                //not sorted
                check=false;
                break;
            }
        }
         return check;
    }

    public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n=sc.nextInt();

        int[] arr=new int[n];
   
        System.out.println("Enter "+ n + " array element :");
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        
        System.out.println("Array is sorted = " + isSorted(arr));

     }
}


// Q.5 find smallest and largest element of an array .
import java.util.Arrays;
import java.util.*;
class array_Problems
{
    static int[] smallestAndLargestElement(int arr[])
    {
        //InBuilt Function To sort array :- Arrays.sort() ,present in java.util.Arrays library package.
        Arrays.sort(arr);
        int[] ans = {arr[0] , arr[arr.length-1]};
         return ans;
    }

    public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n=sc.nextInt();

        int[] arr=new int[n];
   
        System.out.println("Enter "+ n + " array element :");
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        
        int[] ans = smallestAndLargestElement(arr);
        System.out.println("Smallest Element = " + ans[0]);
        System.out.println("Largestlest Element = " + ans[1]);

        System.out.println("Array Of Smallest & Largest Element are : " +"["+ ans[0] +" , " + ans[1]+"] ");

     }
}

*/

// Q.6 find Kth smallest and Kth largest element of an array .
import java.util.Arrays;
import java.util.*;
class array_Problems
{
    static void isSorted(int[] arr)
    {
       Arrays.sort(arr);
       for(int i=0;i<arr.length;i++)
       {
        System.out.print(arr[i] + " ");
       }
       System.out.println();
    }

    static int[] KthsmallestAndLargestElement(int arr[],int k)
    {
        //InBuilt Function To sort array :- Arrays.sort() ,present in java.util.Arrays library package.
         
        
        int[] ans = {arr[k-1] , arr[arr.length-k]};
         return ans;
    }

    public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n=sc.nextInt();

        int[] arr=new int[n];
   
        System.out.println("Enter "+ n + " array element :");
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }

        System.out.println("Enter Kth element: ");
        int k=sc.nextInt();
        
        isSorted(arr);
        int[] ans = KthsmallestAndLargestElement(arr,k);
        System.out.println("Kth Smallest Element = " + ans[0]);
        System.out.println("Kth Largestlest Element = " + ans[1]);

        System.out.println("Array Of Smallest & Largest Element are : " +"["+ ans[0] +" , " + ans[1]+"] ");

     }
}
