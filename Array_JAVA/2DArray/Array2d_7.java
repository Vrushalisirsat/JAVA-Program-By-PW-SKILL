// 2D Array Problems  : (Assignment Questions)

// Q1 - Given a matrix arr[][] of integers, print the prefix sum matrix for it.
/*
import java.util.*;
class Array2d_7
{
    static void findPrefixSumMatrix(int[][] matrix)
    {
        int r=matrix.length;
        int c=matrix[0].length;         //if(r>0)

        // vertical prefixsum
    for (int j = 0; j < n; j++) {
      for (int i = 1; i < n; i++) {
        arr[i][j] += arr[i - 1][j];
      }
    }
     
    // horizontal prefixsum
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < n; j++) {
        arr[i][j] += arr[i][j - 1];
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
        System.out.print("Enter the numbers of rows and columns : ");
        int n=sc.nextInt();
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

        
        System.out.println("Prefix Sum Matrix : ");
         findPrefixSumMatrix(matrix);
         printMatrix(matrix);
    }
}


// Q2. A square matrix is said to be an perfect Matrix if both of the following conditions hold:
// a) All the elements in the diagonals of the matrix are non-zero integers.
// b) All other elements except the diagonal elements are 0.
// Given a 2D integer array grid of size n*n representing

import java.util.*;
class Array2d_7
{
    static void isPerfectSquareMatrix(int[][] matrix,int n)
    {
    //     int r = matrix.length;
    //     int c = matrix[0].length;
    //     for(int i=0;i<r;i++)
    //     {
    //        for(int j=c;j>0;j--)
    //        {
    //         if(matrix[i][j] == 0)
    //         {
    //             System.out.println("false");
    //             return;
    //         }
    //        }
    //     }
    //     System.out.println("True");
    // }

       for (int i = 0; i < n; i++) 
       {
          for (int j = 0; j < n; j++) 
          {
            if(i == j || i+j == n-1)
            {
              if(matrix[i][j] == 0)
              {
                System.out.println("false");
                return;
              }
            }
              else{
                if(matrix[i][j] != 0)
                {
                  System.out.println("false");
                  return;
                }
             }
            }
          }
                System.out.println("true");
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
        System.out.print("Enter the numbers of rows and columns : ");
        int n=sc.nextInt();
       

        int[][] matrix = new int[n][n];

        int totalElements = n*n;
        System.out.println("Enter " + totalElements + " Values");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("Prefix Sum Matrix : ");
         isPerfectSquareMatrix(matrix,n);
         
    }
}


// import java.util.*;
// class Array2d_7
// {
//     static void findPrefixSumMatrix(int[][] matrix,int n,int m)
//     {
//         int R = matrix.length;
//         int C = matrix[0].length;

//         int[][] arr = new int[n][m];
//         arr[0][0] = matrix[0][0];
// for (int i = 1; i < n; i++) {
// for (int j = 1; j < m; j++) {
//     arr[i][j] = matrix[i][j] + arr[i-1][j] + arr[i][j-1] - arr[i-1][j-1];



//         // // Filling first row and first column
//         // for ( i = 1; i < C; i++)
//         //     arr[0][i] = arr[0][i - 1] + matrix[0][i];
//         // for ( i = 1; i < R; i++)
//         //     arr[i][0] = arr[i - 1][0] + matrix[i][0];

// }
// }
// printMatrix(arr);
//   }
    
//     static void printMatrix(int[][] matrix)
//     {
//         for(int i=0;i<matrix.length;i++)
//         {
//             for(int j=0;j<matrix[i].length;j++)
//             {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
    
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the numbers of rows and columns : ");
//         int n=sc.nextInt();
//         int m=sc.nextInt();

//         int[][] matrix = new int[n][m];

//         int totalElements = n*m;
//         System.out.println("Enter " + totalElements + " Values");

//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<m;j++)
//             {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

        
//         System.out.println("Prefix Sum Matrix : ");
//          findPrefixSumMatrix(matrix,n,m);
        
//     }
// }


*/

// Q3. Write a user defined function upper() which takes an integer square matrix as an input and its size N and prints the upper half of the matrix.

import java.util.*;
class Array2d_7
{
    static void printUpperTraingularMatrix(int[][] matrix,int n)
    {
        int[][] ans=new int[n][n];
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {
                if(j >= i)
                {
                    System.out.print(matrix[i][j] + " ");
                }
                else{
                    System.out.print(" ");
                }
           }
           System.out.println();
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
        System.out.print("Enter the size of matrix : ");
        int n=sc.nextInt();
       

        int[][] matrix = new int[n][n];

        int totalElements = n*n;
        System.out.println("Enter " + totalElements + " Values");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        
        
         printUpperTraingularMatrix(matrix,n);
         
    }
}


