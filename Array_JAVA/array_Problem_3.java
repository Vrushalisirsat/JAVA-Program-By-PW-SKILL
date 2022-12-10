// PATTERN :-  TARGET SUM : Problems..

// Q.1 find the total number of pairs in the array whose sum is equal to the given value x/target.  target=7,arr[]={4,6,3,5,8,2};
/*
import java.util.Arrays;
import java.util.*;
class array_Problem_3
{
    static int pairSum(int arr[],int target)
    {
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
               if(arr[i] + arr[j] == target)
               {
                ans++;
                System.out.println( "Pairs = " + "( " + arr[i] + " , " + arr[j] + " )");
               }
               
            }
        }
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
        
        System.out.println("Enter target value : ");
        int target = sc.nextInt();

    

        System.out.println("pairsum : " +pairSum(arr,target));

     }
}


// Q.2 counts the number of triplets whose sum is equal to the given value x/target.

import java.util.Arrays;
import java.util.*;
class array_Problem_3
{
    static int pairSum(int arr[],int target)
    {
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
               for(int k=j+1;k<n;k++)
               {
                 if(arr[i] + arr[j] + arr[k] == target)
                 {
                    ans++;
                    System.out.println( "Pairs = " + "( " + arr[i] + " , " + arr[j] + " , " + arr[k] + " )");
                 }
               }  
            }
        }
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
        
        System.out.println("Enter target value : ");
        int target = sc.nextInt();

    

        System.out.println("pairsum : " +pairSum(arr,target));

     }
}



// Patterns :- Array Manipulation

// Q.3 find the unique number in a given array where all the elements are being repeated twice with one value being unique.

import java.util.*;
class array_Problem_3
{
    static int uniqueNo(int arr[])
    {
        int n=arr.length;
        int ans=-1;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
               if(arr[i] == arr[j])
               {
                arr[i]=-1;
                arr[j]=-1;
               }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i] > 0)
            {
                ans=arr[i];
            }
        }
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
        

        System.out.println("Unique Number : " +uniqueNo(arr));

     }
}



// Q.4 find the second largest element in the given array.


import java.util.*;
class array_Problem_3
{
    static int findMax(int arr[])
    {
        int mx=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
               if(arr[i] > mx)
               {
                mx=arr[i];
               }
            }
        }
         return mx;
    }

        static int findSecondMax(int[] arr)
        {
            int mx = findMax(arr);
            int n=arr.length;
            for(int i=0;i<n;i++)
            {
                if(arr[i] == mx)
                {
                    arr[i] = Integer.MIN_VALUE;
                }
            }
            int secondMax = findMax(arr);
            return secondMax;
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
        

        System.out.println("Second Largest Element : " +findSecondMax(arr));

     }
}


// Q.5 find the second smallest element in the given array.


import java.util.*;
class array_Problem_3
{
    static int findMin(int arr[])
    {
        int min=Integer.MAX_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
               if(arr[i] < min)
               {
                min=arr[i];
               }
            }
        }
         return min;
    }

        static int findSecondMin(int[] arr)
        {
            int min = findMin(arr);
            int n=arr.length;
            for(int i=0;i<n;i++)
            {
                if(arr[i] == min)
                {
                    arr[i] = Integer.MAX_VALUE;
                }
            }
            int secondMin = findMin(arr);
            return secondMin;
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
        

        System.out.println("Second Largest Element : " +findSecondMin(arr));

     }
}



//Q.6 Given an array 'a' consisting of integers. Return the first value that is repeating in this array.If no value is being repeated,return -1.

import java.util.*;
class array_Problem_3
{
    static int find1stRepeatNo(int a[])
    {
       int ans=-1;

       for(int i=0;i<a.length;i++)
       {
          for(int j=i+1;j<a.length;j++)
          {
            if(a[i] == a[j])
            {
                return a[i];
               
            }
          }
       }
       return -1;
    }

    

    public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n=sc.nextInt();

        int[] a=new int[n];
   
        System.out.println("Enter "+ n + " array element :");
        for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
        

        System.out.println("Second Largest Element : " +find1stRepeatNo(a));

     }
}



//Q.7 Given an array 'a' consisting of integers. Return the last value that is repeating in this array.If no value is being repeated,return -1.

import java.util.*;
class array_Problem_3
{
    static int find1stRepeatNo(int a[])
    {
       int ans=-1;

       for(int i=0;i<a.length;i++)
       {
          for(int j=i+1;j<a.length;j++)
          {
            if(a[i] == a[j])
            {
                ans=a[i];
               
            }
          }
       }
       return ans;
    }

    

    public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n=sc.nextInt();

        int[] a=new int[n];
   
        System.out.println("Enter "+ n + " array element :");
        for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
        

        System.out.println("Second Largest Element : " +find1stRepeatNo(a));

     }
}

*/

