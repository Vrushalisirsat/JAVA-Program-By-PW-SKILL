// 2D-Array Practice Questions -------(Lecture 21)
/*
// Q.1 Write a program to display transpose of matrix entered by the user. (by using another/extra array).

import java.util.*;
class Array2D_3
{
    static int[][] matrixTranspose(int[][] matrix ,int r,int c)
    {
        int[][] ans = new int[c][r];
       for(int i=0;i<c;i++)
       {
        for(int j=0;j<r;j++)
        {
            ans[i][j]=matrix[j][i];
        }
       }
       return ans;
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

        System.out.println("Enter the numbers of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter the Elements in an array : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Transpose Of Matrix : ");
        int[][] ans =  matrixTranspose(matrix,r,c);
        printMatrix(ans);
    }
}
 

// Q.2 Write a program to display transpose of matrix entered by the user. (by using same array).
// but these logic -(transpose of matrix by using 'same array') is only applicable for square matrix.----> Not apply on non square matrix


import java.util.*;
class Array2D_3
{
    static void transposeInPlace(int[][] matrix ,int r,int c)
    {
       
       for(int i=0;i<c;i++)
       {
        for(int j=i;j<r;j++)
        {
            //swap matrix[i][j]=matrix[j][i]
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
       }
       printMatrix(matrix);
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

        System.out.println("Enter the numbers of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter the Elements in an array : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Transpose Of Matrix : ");
        transposeInPlace(matrix,r,c);
       
    }
}



// Q.3 Given a square matrix,turn it by 90 degrees in a clockwise direction without using any extra array.
import java.util.*;
class Array2D_3
{
    static void transposeInPlace(int[][] matrix ,int r,int c)
    {
       
       for(int i=0;i<c;i++)
       {
        for(int j=i;j<r;j++)
        {
            //swap matrix[i][j]=matrix[j][i]
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
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

    static void reverseArray(int[] arr)
    {
        int i=0,j=arr.length-1;

        while(i < j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    static void rotateMatrix(int[][] matrix , int n)
    {
        // tanspose
        transposeInPlace(matrix,n,n);

        //reverse each row in transpose of matrix
        for(int i=0;i<n;i++)
        {
        reverseArray(matrix[i]);
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter the Elements in an array : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Transpose Of Matrix : ");
        rotateMatrix(matrix,r);
        printMatrix(matrix);
       
    }
}

*/
// Q.4 Given an integer n,return the first n rows of pascal's triangle. 
//Properties of pascal triangle ->1) In Pascal's triangle,each number is the sum of two numbers directly above it as shown: For n=5.
//                              -> pascal[i][j] = pascle[i-1][j] + pascle[i-1][i-j];
// 2) In every row first and last element is = 1
// 3) Pascal's triangle is a jagged 2d-array : because it has different number of columns in every row.


import java.util.*;
class Array2D_3
{
    static int[][]  pascalTriangle(int n)
    {
       int[][] ans = new int[n][];

       for(int i=0;i<n;i++)
       {
        // i'th row has i+1 columns
        ans[i] = new int[i+1];
        // 1st and last element of every row is 1
        ans[i][0] = ans[i][i] = 1;

        for(int j=1;j < i;j++)
        {
            ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
        }
       }
       return ans;
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

        System.out.println("Enter n : ");
        int n = sc.nextInt();

        System.out.println("Pascal's Triangle : ");
        int[][] ans =  pascalTriangle(n);
        printMatrix(ans);
       
    }
}