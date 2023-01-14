// Two Pointers - Lecture 18 (Advance Problem Solving in arrays)

// Q.1 Sort an array consisitingof only 0s and 1s. (arr[] = {1,0,0,1,0,1,1,0,0} , n=9)
// Method-1 : sort array in 2 traversal(2 loops)
/*

import java.util.*;
class arrays_Problem_7
{
    static void sortZeroesAndOnces(int arr[])
     {
        int n = arr.length;
        int zeroes=0;

        //count the number of zeroes
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 0)
            {
                zeroes++;
            }
        }

        //put 0 to zeroes-1 : 0 and zeroes to n-1 : 1
        for(int i=0;i<n;i++)
        {
            if(i < zeroes)
            {
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }
     }

     static void swap(int[] arr, int i,int j)
     {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
     }

     static void printArray(int[] arr)
     {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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

      System.out.println("Original Array : ");
      printArray(arr);

      sortZeroesAndOnces(arr);
      System.out.println("Sorted Array : ");
      printArray(arr);


    }
}


// Method-2 : sort array in 1 traversals . (1 loops)

import java.util.*;
class arrays_Problem_7
{
    static void sortZeroesAndOnces(int arr[])
     {
        int n = arr.length;
        int left = 0, right = n-1;

        while(left < right)
        {
            if(arr[left] == 1 && arr[right] == 0)
            {
                swap(arr,left,right);
                left++;
                right--;
            }

            if(arr[left] == 0)
            {
                left++;
            }

            if(arr[right] == 1)
            {
                right--;
            }
        }
     }

     static void swap(int[] arr, int i,int j)
     {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
     }

     static void printArray(int[] arr)
     {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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

      System.out.println("Original Array : ");
      printArray(arr);

      sortZeroesAndOnces(arr);
      System.out.println("Sorted Array : ");
      printArray(arr);


    }
}



// Q.2 Given an array of integers 'a',move all the even integers at the beginning of the array followed by all the odd integers.The relative order of odd or even integers does not matter.Return any array that satisfies the condition.

import java.util.*;
class arrays_Problem_7
{
    static void sortByParity(int arr[])
     {
        int n = arr.length;
        int left = 0, right = n-1;

        while(left < right)
        {
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0)
            {
                swap(arr,left,right);
                left++;
                right--;
            }

            if(arr[left] % 2 == 0)
            {
                left++;
            }

            if(arr[right] % 2 == 1)
            {
                right--;
            }
        }
     }

     static void swap(int[] arr, int i,int j)
     {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
     }

     static void printArray(int[] arr)
     {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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

      System.out.println("Original Array : ");
      printArray(arr);

      sortByParity(arr);
      System.out.println("Sorted Array : ");
      printArray(arr);


    }
}



// Q.3 Given an integer array 'a' sorted in non-decresing order,return an array of the squares of each number sorted in non-decreasing order.

// Method-1 : using reverse method
import java.util.*;
class arrays_Problem_7
{
    static int[] sortArraysSquare(int arr[])
     {
        int n = arr.length;
        int left = 0, right = n-1;
        int[] ans = new int[n];
        int k=0;

        while(left <= right)
        {
            if(Math.abs(arr[left]) > Math.abs(arr[right]))
            {
                ans[k++] = arr[left] * arr[left];
                left++;
            }
            else {
                    ans[k++] = arr[right] * arr[right];
                    right--;
            }
        }
        reverse(ans);
        return ans;
     }


     static void reverse(int[] arr)
     {
         int i=0,j=arr.length-1;
         while(i < j)
         {
            swap(arr,i,j);
            i++;
            j--;
         }
     }

     static void swap(int[] arr, int i,int j)
     {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
     }

     static void printArray(int[] arr)
     {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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

      System.out.println("Original Array : ");
      printArray(arr);

      int[] ans = sortArraysSquare(arr);
      System.out.println("Sorted Array : ");
      printArray(ans);


    }
}

*/

// Method-1 : using reverse method
import java.util.*;
class arrays_Problem_7
{
    static int[] sortArraysSquare(int arr[])
     {
        int n = arr.length;
        int left = 0, right = n-1;
        int[] ans = new int[n];
        int k=n-1;

        while(left <= right)
        {
            if(Math.abs(arr[left]) > Math.abs(arr[right]))
            {
                ans[k--] = arr[left] * arr[left];
                left++;
            }
            else {
                    ans[k--] = arr[right] * arr[right];
                    right--;
            }
        }
        return ans;
     }


     static void printArray(int[] arr)
     {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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

      System.out.println("Original Array : ");
      printArray(arr);

      int[] ans = sortArraysSquare(arr);
      System.out.println("Sorted Array : ");
      printArray(ans);


    }
}