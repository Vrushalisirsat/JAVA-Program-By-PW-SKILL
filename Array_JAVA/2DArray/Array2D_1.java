// Miltidimensional Array :-  array of array
// Syntax :- data_Type[1st dimension][2nd dimension][]....[Nth dimension] array_name = new data_Type[size1][size2]...[sizeN];
/*
//  Q.1 WAP to print the multidimensional array.
import java.util.*;
class Array2D_1
{

    static void printArray(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
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

        int[][] arr = new int[r][c];

        System.out.println("Enter the Elements in an array : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("2-D Array is : ");
        printArray(arr);
    }
}


// Q2. WAP to add 2 matrix.

import java.util.*;
class Array2D_1
{

    static void add(int[][] a,int r1,int c1,int[][] b,int r2,int c2)
    {
        if(r1!=r2 || c1!=c2)
        {
            System.out.println("Wrong-Input - Addition Not Posiible");
            return;
        }

        int[][] sum = new int[r1][c1];

        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printMatrix(sum);
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
        System.out.println("Sum Of 2-Matrix is : ");
        add(a,r1,c1,b,r2,c2);
    }
}


//Q.3 WAP to display Multiplication of two matrices entered by the user.


import java.util.*;
class Array2D_1
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


*/

//Q.3 WAP to reverse the each row in 2-D matrix.

import java.util.*;
class Array2D_1
{

    static void reverseMatrix(int[][] matrix, int r,int c)
    {
         int n = matrix.length;
       

       for(int i=0;i<r;i++)
       {
         int start=0;
        int end=n-1;
        while(start < end)
        {
            //swap the element
             int temp = matrix[i][start];
             matrix[i][start] = matrix[i][end];
             matrix[i][end] = temp;
            // Increment start and decrement end for next pair of swapping
            start++;
            end--;
        }
       }

    // Print the arr[][] after reversing every row
       for(int i=0;i<r;i++)
       {
        for(int j=0;j<c;j++)
        {
            System.out.print(matrix[i][j] + " ");
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

        System.out.println("Enter the numbers of rows & columns of matrix-1 : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter matrix-1 values : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix : ");
        printMatrix(matrix);
        System.out.println("Reverse Of Matrix is : ");
        reverseMatrix(matrix,r,c);
    }
}