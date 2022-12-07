// Q1.Given an array of integers {2,6,-5,-1,0,4,-9},print only the positive values present in the array.

/*
class array1
{
    public static void main(String args[])
    {
      int arr[]={2,6,-5,-1,0,4,-9};

      for(int i=0;i<arr.length;i++)
      {
        if(arr[i] >= 0)
        {
            System.out.println(arr[i]);
        }
      }
    }
}



// Q2.Convert the list of strings {"ab","bc","cd","de","ef","fg","gh"} into an array of strings and print all strings stored an odd indices of the array.
class array1
{
    public static void main(String args[])
    {
      String[] arr={"ab","bc","cd","de","ef","fg","gh"};
    
      for(int i=0;i<arr.length;i++)
      {
         if(i%2 != 0)
         {
            System.out.println(arr[i]);
         }
      }
      
    }
}


//Q.3 Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even elements.
class array1
{
    public static void main(String args[])
    {
      int[] arr={1,2,3,4,5,6,7,8};
    
      // method-1
      for(int i=0;i<arr.length;i++)
      {
         if(arr[i]%2 == 0)
         {
            System.out.println(arr[i]);
         }
      }

      //or  method-2
      for(int val : arr)
      {
        if(val%2 == 0)
         {
            System.out.println(val);
         }
      }
      
    }
}


//Q.4 calculate the minimum element in the array {2,-3,5,8,1,0,-4} using standard library method for calculating the minimum element.
class array1
{
    public static void main(String args[])
    {
      int[] arr={2,-3,5,8,1,0,-4};
      int min=arr[0];
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i] < min)
        {
            min = arr[i];
        }
      }
       System.out.println(min);
    }
}
*/

//Q.5 find the first peak element in the array {1,1,3,4,2,3,5,7,0} .
// Peak element is the one which is greater than its immediate left neighbor and its immediate right neighbor.Leftmost and rightmost element can not be a peak element.
class array1
{
    public static void main(String args[])
    {
      int[] arr={1,1,3,4,2,3,5,7,0};
      int peak=arr[0];
      for(int i=1;i<arr.length;i++)
      {
        if(arr[i-1] < arr[i] && arr[i] > arr[i+1])
        {
            System.out.println(arr[i]);
        }
      }
       
    }
}
