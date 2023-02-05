// 2D-Array Practice Questions -------(Lecture 22)

// Q.1 Given an n*m matrix 'a' , return all elements of the matrix in spiral order.
/*
import java.util.*;
class Array2D_5
{
    static void printSpiralOrder(int[][] matrix , int r,int c)
    {
       int topRow=0, bottomRow=r-1, leftCol=0, rightCol=c-1;
       int totalElements=0;

       while(totalElements < r*c)
       {
          // topRow = leftCol to rightCol
          for(int i=leftCol; i<=rightCol && totalElements < r*c; i++)
          {
            System.out.print(matrix[topRow][i] + " ");
            totalElements++;
          }
          topRow++;

          // rigthCol = topRow to bottomRow
          for(int j=topRow; j<=bottomRow && totalElements < r*c; j++)
          {
            System.out.print(matrix[j][rightCol] + " ");
            totalElements++;
          }
          rightCol--;

          // bottomRow = rightCol to leftCol
          for(int i=rightCol; i>=leftCol && totalElements < r*c; i--)
          {
            System.out.print(matrix[bottomRow][i] + " ");
            totalElements++;
          }
          bottomRow--;

          // leftCol = bottomRow to topRow
          for(int j=bottomRow; j>=topRow && totalElements < r*c; j--)
          {
            System.out.print(matrix[j][leftCol] + " ");
            totalElements++;
          }
          leftCol++;

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
        int r=sc.nextInt();
        System.out.println("Enter m : ");
        int c=sc.nextInt();

        int[][] matrix = new int[r][c];

        int totalElements = r*c;
        System.out.println("Enter " + totalElements + " Values");

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }


        printSpiralOrder(matrix,r,c);
        
    }
}

*/

// Q.2 Given a positive integer n,generate an n*m matrix filled with elements from 1 to n^2 in spiral order.

import java.util.*;
class Array2D_5
{
    static int[][] generateSpiralMatrix(int n)
    {
      int[][] matrix = new int[n][n];
      int current=1;
       int topRow=0, bottomRow=n-1, leftCol=0, rightCol=n-1;
      
       while(current <= n*n)
       {
          // topRow = leftCol to rightCol
          for(int i=leftCol; i<=rightCol && current <= n*n; i++)
          {
            matrix[topRow][i] = current;
            current++;
          }
          topRow++;

          // rigthCol = topRow to bottomRow
          for(int j=topRow; j<=bottomRow && current <= n*n; j++)
          {
            matrix[j][rightCol] = current;
            current++;
          }
          rightCol--;

          // bottomRow = rightCol to leftCol
          for(int i=rightCol; i>=leftCol && current <= n*n; i--)
          {
            matrix[bottomRow][i] = current;
            current++;
          }
          bottomRow--;

          // leftCol = bottomRow to topRow
          for(int j=bottomRow; j>=topRow && current <= n*n; j--)
          {
            matrix[j][leftCol] = current;
            current++;
          }
          leftCol++;

       }
       return matrix;
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
       
       int[][] matrix = generateSpiralMatrix(n);
        printMatrix(matrix);
        
    }
}