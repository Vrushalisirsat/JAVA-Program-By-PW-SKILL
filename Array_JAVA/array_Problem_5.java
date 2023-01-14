// Arrays 4 || Basic Problem Solving-2 || Lecture 17 By "PW Skill".

// Q.1 Given 2 integers a and b.Swap the 2 given values using temporary variables.
/*
class array_Problem_5
{
    static void swap(int a,int b)
    {
        System.out.println("Original Values Before swap : ");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Values After swap : ");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }

    public static void main(String args[])
    {
        int a=9;
        int b=3;

        swap(a,b);
    }
}



// Q.2 Given 2 integers a and b.Swap the 2 given values using sum and difference method. (Swap 2 value without using third/temp variable).

class array_Problem_5
{
    static void swap(int a,int b)
    {
        System.out.println("Original Values Before swap : ");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Values After swap : ");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }

    public static void main(String args[])
    {
        int a=9;
        int b=3;

        swap(a,b);
    }
}


// Q.3 Reverse an array consisting of integer values.
//a) (by using new array).

class array_Problem_5
{
    static int[] reverseArray(int arr[])
    {

        int n = arr.length;
         int[] ans = new int[n];
        int j=0;
        // Method-1 : By using for loop
        //traverse the original array in reverse direction.
        for(int i=n-1;i>=0;i--)
        {
            ans[j++] = arr[i];           // or :- ans[j]=arr[i];    j++;
        }

        // Method-2 : By using while loop
        // int i=n-1,j=0;
        // while(i>=0)
        // {
        //     ans[j++]=arr[i--];
        // }


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
        int[] arr = {1,2,3,4,5,9};
        int[] ans = reverseArray(arr);
        printArray(ans);
    }
}


//b) (by using same array).

class array_Problem_5
{

    static void swapInArray(int arr[] , int i ,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void reverseArray(int arr[])
    {
        int n = arr.length;
        int i=0,j=n-1;

        while(i < j)
        {
            swapInArray(arr,i,j);
            i++;
            j--;
        }
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
        int[] arr = {1,2,3,4,5,9};
       
       reverseArray(arr);
       printArray(arr);
    }
}


// Q.4 Rotate the given array 'a' by k steps,where k is non-negative.   NOTE : k can be greater than n as well.

import java.util.*;
class array_Problem_5
{
    static int[] rotateArray(int arr[],int k)
    {
        int n=arr.length;
        k=k%n;
        int[] ans = new int[n];
        int j=0;

        for(int i=n-k; i<n;i++)
        {
            ans[j++] = arr[i];
        }

        for(int i=0;i<n-k;i++)
        {
            ans[j++]=arr[i];
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements in an array : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();

        System.out.println("Original array : ");
        printArray(arr);

        int[] ans = rotateArray(arr,k);
        System.out.println("Array after Rotation : ");
        printArray(ans);

    }
}


//Q.5 Rotate the given array 'a' by k steps,where k is non-negative without using exyra space.   NOTE : k can be greater than n as well.

import java.util.*;
class array_Problem_5
{

    static void swapInArray(int arr[] , int i ,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void reverseArray(int arr[],int i,int j)
    {
        int n = arr.length;
     

        while(i < j)
        {
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }

    static void rotatePlace(int[] arr , int k)
    {
        int n=arr.length;
        k=k%n;
        reverseArray(arr,0,n-k-1);
        reverseArray(arr,n-k,n-1);
        reverseArray(arr,0,n-1);
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements in an array : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();

        System.out.println("Original array : ");
        printArray(arr);
        rotatePlace(arr,k);
        System.out.println("Array after Rotation : ");
        printArray(arr);
    }
}

*/

// Q.6 Given Q queries,check if the given number is present in the array or not.  NOTE : Value of all the elements in an array is less than 10 to the power 5.

import java.util.*;
class array_Problem_5
{
    static int[] makeFreqArray(int[] arr)
    {
        int[] freq = new int[100005];

        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements in an array : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int[] freq = makeFreqArray(arr);

        System.out.print("Enter the number of queries : ");
        int q = sc.nextInt();

        while(q>0)
        {
            System.out.println("Enter no. to be searched : ");
            int x = sc.nextInt();
             
            if(freq[x] > 0)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
             q--;
        }
        
    }
}




