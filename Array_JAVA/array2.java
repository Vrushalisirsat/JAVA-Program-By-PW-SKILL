
/*

import java.util.*;
class array2
{

    static void printArray(int arr[])
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
        System.out.println("Enter size of array :");
        int n=sc.nextInt();

        int[] arr=new int[n];
   
       System.out.println("Enter "+ n + " array element :");
       for(int i=0;i<n;i++)
       {
         arr[i]=sc.nextInt();
       }
       System.out.println("Original array arr : ");
       printArray(arr);


       //1)* SHALLOW COPY :- only reference copied ,not make copy of actual array or not allocated new memory........... (memory is allocated when we use 'new' keyword..)
       //trying to copy arr to arr_2
       int[] arr_2 = arr;
       System.out.println("Copied Array arr_2 : ");
       printArray(arr_2);

       //changing some values of arr_2
       arr_2[0]=0;
       arr_2[1]=0;

       System.out.println("Original array after changing arr_2 : ");
       printArray(arr);

       System.out.println("Copied arr_2 after changing arr_2 : ");
       printArray(arr_2);

        
    }
}

*/

import java.util.Arrays;
import java.util.*;
class array2
{

    static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
           System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    static void changeArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=0;
        }
    }

    static void changeVal(int a)
    {
        a=1004;
    }


    public static void main(String args[])
    {
        int a=45;
        changeVal(a);
        System.out.println(a);

        int arr[]=new int[5];
        arr[0]=5;
        arr[1]=6;
        arr[2]=7;
        arr[3]=9;
        arr[4]=3;

        printArray(arr);

        // changeArray(arr);
        // printArray(arr);

        System.out.println("***********************Method-1**********************************");
        // 2)* Deep Copy :- only copied element is change,original element are not changed.
        //By using :- i) array_name.clone() object  :- Used To create another array with the same element values as the source array.A deep copy of original array is created in this with the new clone array having the same element values.
        System.out.println("Original array arr : ");
        printArray(arr);

        int arr_2[]=arr.clone();
        System.out.println("copied Array arr_2 : ");
        printArray(arr_2);

        //changing some values of arr_2
        arr_2[0]=0;
        arr_2[1]=0;

        System.out.println("Original array after changing arr_2 : ");
        printArray(arr);

        System.out.println("Copied arr_2 after changing arr_2 : ");
        printArray(arr_2);

        System.out.println("***********************Method-2**********************************");
   
        //By using :- ii) int new_array=Arrays.copyOf(original_array_name,array_length); object
        arr_2=Arrays.copyOf(arr,arr.length);
        System.out.println("Copied arr_2 : ");
        printArray(arr_2);

        //changing some values of arr_2
        arr_2[0]=0;
        arr_2[1]=0;

        System.out.println("Original array after changing arr_2 : ");
        printArray(arr);

        System.out.println("Copied arr_2 after changing arr_2 : ");
        printArray(arr_2);
   


      System.out.println("***********************Method-3**********************************");
   
        //By using :- ii) array_name.copyOfRange(array_name,start_index,array_length(end_index)) object
        arr_2=Arrays.copyOfRange(arr,0,3);
        System.out.println("Copied arr_2 : ");
        printArray(arr_2);

        //changing some values of arr_2
        arr_2[0]=0;
        arr_2[1]=0;

        System.out.println("Original array after changing arr_2 : ");
        printArray(arr);

        System.out.println("Copied arr_2 after changing arr_2 : ");
        printArray(arr_2);
   


    }


}
