// 2D Array Problems -1 : (Assignment Questions)

// Q1 - Given two integer matrices, multiply the matrices, if possible, else return “Invalid Input".

/*
import java.util.*;
class Array2d_4
{

    static void multiply(int[][] a,int r1,int c1,int[][] b,int r2,int c2)
    {
        if(c1 != r2)
        {
            System.out.println("Wrong-Dimensions - Multiplication is Not Posiible");
            return;
        }

        int[][] mul = new int[r1][c2];

        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                for(int k=0;k<c1;k++)
                {
                    mul[i][j] = (a[i][k] * b[k][j]);
                }
            }
        }
        printMatrix(mul);
    }

    static void printMatrix(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers of rows & columns of matrix-1 : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];

        System.out.println("Enter matrix-1 values : ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the numbers of rows & columns of matrix-2 : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] b = new int[r2][c2];

        System.out.println("Enter matrix-2 values : ");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix - 1 : ");
        printMatrix(a);
        System.out.println("Matrix - 2 : ");
        printMatrix(b);
        System.out.println("Multiplication Of 2-Matrix is : ");
        multiply(a,r1,c1,b,r2,c2);
    }
}


// Q.2 Given a square matrix, rotate it by 90 degrees in anti clockwise direction.

import java.util.*;
class Array2d_4
{
    static void transposeInPlace(int[][] matrix , int r,int c)
    {
        for(int i=0;i<r;i++)
        {
            for(int j=i;j<c;j++)
            {
              //swap matrix[i][j]=matrix[j][i]
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }

    static void reverseArray(int i,int[][] arr,int n)
    {
    // Initialise start and end index
      int start=0,end=n-1;
      
    // Till start < end, swap the element at start and end index
      while(start < end)
      {
        int temp=arr[i][start];
        arr[i][start]=arr[i][end];
        arr[i][end]=temp;
        start++;
        end--;
      }
    }

    static void rotateMatrix(int[][] matrix , int n)
    {
       //reverse each column of transpose matrix
       for(int i=0;i<n;i++)
       {
        reverseArray(i,matrix,n);
       }

       // transpose of matrix
       transposeInPlace(matrix,n,n);

    }

    static void printMatrix(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        System.out.println("Enter m : ");
        int m=sc.nextInt();

        int[][] matrix = new int[n][m];

        int totalElements = n*m;
        System.out.println("Enter " + totalElements + " Values");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        rotateMatrix(matrix,n);
        System.out.println("Rotaion Of matrix by 90 degree anti-clockwise direction :");
        printMatrix(matrix);
    }
}



// Q3 - Given a n*m matrix, return true if the matrix is a Toeplitz matrix. A matrix is called Toeplitz ,if every diagonal from top-left to bottom-right has the same elements.

import java.util.*;
class Array2d_4
{
    static boolean ToeplitzMatrix(int[][] matrix , int r,int c)
    {
        for(int i=1;i<r;i++)
        {
            for(int j=1;j<c;j++)
            {
               if(matrix[i][j] !=matrix[i-1][j-1])
               {
                return false;
               }
            }
        }
        return true;
    }

    

    static void printMatrix(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        System.out.println("Enter m : ");
        int m=sc.nextInt();

        int[][] matrix = new int[n][m];

        int totalElements = n*m;
        System.out.println("Enter " + totalElements + " Values");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        if(ToeplitzMatrix(matrix,n,m))
        {
        System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}



// Q4 - Given a n*m matrix, return an array of elements containing diagonal traversal of the matrix.

import java.util.*;
class Array2d_4
{
    static void digonalTraversalOfMatrix(int[][] matrix , int r,int c)
    {
        for(int k=0;k<=r-1;k++)
        {
            int i=k;
            int j=0;
            while(i >=0)
            {
                System.out.print(matrix[i][j] + " ");
                i=i-1;
                j=j+1;
            }
        }

        for(int k=1;k<=c-1;k++)
        {
            int i=r-1;
            int j=k;
            while(j <= c-1)
            {
                System.out.print(matrix[i][j] + " ");
                i=i-1;
                j=j+1;
            }
        }
    }

    

    static void printMatrix(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        System.out.println("Enter m : ");
        int m=sc.nextInt();

        int[][] matrix = new int[n][m];

        int totalElements = n*m;
        System.out.println("Enter " + totalElements + " Values");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

      digonalTraversalOfMatrix(matrix,n,m);
    }
}

*/



// Q5 - Given an array of intervals where intervals[i] = [start, end], merge all overlapping intervals,and return the count of the non-overlapping intervals that cover all the intervals in the input.

import java.util.*;
class Array2d_4
{
    static int eraseOverlapIntervals(int[][] intervals)
    {
        Arrays.sort(intervals,(a,b)->(a[1]-b[1]));

        int previous=0;
        int n=intervals.length;
        int ans=0;

        for(int current=1;current<n;current++)
        {
            //Overlapping :- [1 , 5] [3 , 6]-----because '3 is less than 5'

            //Non-Overlapping :- [1 , 5] [8 , 10]----------because '8 is greater than 5'

            if(intervals[current][0] < intervals[previous][1])
            {
                ans++;
               
                 // [1 , 5] [3 , 6] ----> remove 2nd(current) interval
                if(intervals[current][1] > intervals[previous][1])
                {
                    previous=previous;
                }

                // [1 , 5] [2 , 3] ---> remove 1st(previous) interval
                if(intervals[current][1] <= intervals[previous][1])
                {
                    previous = current;
                }
            }
        }
        return ans;
    }

    


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n=sc.nextInt();
        System.out.println("Enter m : ");
        int m=sc.nextInt();

        int[][] intervals = new int[n][m];

        
        System.out.println("Enter intervals Values");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                intervals[i][j] = sc.nextInt();
            }
        }

      int ans = eraseOverlapIntervals(intervals);
      System.out.println(ans);
        
    }
}
