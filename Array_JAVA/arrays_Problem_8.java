//Problems on Array - 3  (Assignment Solutions)
/*
// Q1. Given an integer m, n, and n integers, return true if the number of unique integers among the n integers is greater than or equal to m, else return false.(Integers appearing multiple times are all considered as 1 unique integer).

import java.util.Scanner;
import java.util.Arrays;
class arrays_Problem_8
{
   public static void main(String[] args) {
   Scanner scn = new Scanner(System.in);
   int m = scn.nextInt();
   int n = scn.nextInt();
   int[] arr = new int[n]; //store the n integers in an array
   for(int i = 0; i < n; i++){
   arr[i] = scn.nextInt();
   }

   Arrays.sort(arr); //on sorting, same integers will get aligned in consecutive indices
   int i=0;
   int count++;
   while(i < n)
   {
    count++;
    while(i < n-1 && arr[i+1] == arr[i])   //skip duplicates of element
    {
      i++;  
    }
    i++;   //increment 1 more as i was still pointing to the last duplicate of previous element
   }
   if(count >= m){
   System.out.print(true);
   } else{
   System.out.print(false);
}
}

}



// Q2. Given an integer array arr, return the number of consecutive sequences(subarrays) with odd sum.



// Q3. You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]). Find two lines that together with the x-axis form a container, such that the container contains the most water. Return the maximum amount of water a container can store.

// Q4. Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Return the indices of the two numbers added by one. Return -1 if pair does not exist.


//  Q.2 , Q.3 , Q.4 , these 3 question is not understood mam,please make video on it and explain these questions


// Q5. Given an array sorted in increasing order, return an array of squares of each number sorted in increasing order.

*/


import java.util.*;
class arrays_Problem_8
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
                    ans[k++] = arr[right] * arr[right];
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