//2D Arrays - Assignment Questions

//Q.1 Check if an element x exists in the given matrix or not. If it does not exist, return -1, else return it row and column index.
/*
import java.util.*;
class Array2D_2
{
    static void elementExists(int[][] arr ,int r,int c, int X)
    {
        int count=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j] == X)
                {
                    count++;
                    System.out.println("Rows = " + i);
                    System.out.println("Column = " + j);
                    return;
                }
            }
        }
        if(count == 0)
        {
            System.out.println("-1");
        }
    }

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

        System.out.println("Enter the value of X : ");
        int X = sc.nextInt();

        elementExists(arr,r,c,X);
    }
}


// Q2. Convert a 1D sorted array of length n*m to a 2D array of n rows and m columns. The matrix should also be sorted.

import java.util.*;
class Array2D_2
{
    static void oneDconvert2DArray(int[] arr, int[][] mat, int n,int m)
    {
        int idx=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat[i][j] = arr[idx];
                idx++;
                System.out.print(mat[i][j] + " ");
            }
                System.out.println();
        }
       
    }

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

        System.out.println("Enter the Value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter the Value of m : ");
        int m = sc.nextInt();


        int[] arr = new int[n*m];
        int[][] mat = new int[n][m];

        System.out.println("Enter the Elements in the 1-D array : ");
        for(int i=0;i<m*n;i++)
        {
             arr[i]=sc.nextInt();
        }

       
        oneDconvert2DArray(arr,mat,n,m);
    }
}


//Q3. Given a 2D array of n rows and m columns, return the sum of elements along the range of row and column specified.

import java.util.*;
class Array2D_2
{
    static void sumOfElementsAlongRowCol(int[][] mat, int n,int m,int srow,int scol,int erow,int ecol)
    {
        int sum=0;
        
        while(srow <= erow)
        {
            int j = scol;
            while(j <= ecol)
            {
                sum += mat[srow][j];
                j++;
            }
            srow++;
        }
       System.out.println(sum);
    }

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

        System.out.println("Enter the Value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter the Value of m : ");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

         System.out.println("Enter the Elements in an array : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the Range of rows : ");
        int srow = sc.nextInt();
        int erow = sc.nextInt();
        System.out.println("Enter the Range of columns : ");
        int scol = sc.nextInt();
        int ecol = sc.nextInt();

       
        sumOfElementsAlongRowCol(mat,n,m,srow,scol,erow,ecol);
    }
}

*/

//Q4. Given a 2D array for n rows and m columns, reverse each row.

import java.util.*;
class Array2D_2
{
    static void reverseRow(int[][] mat, int n,int m)
    {
       for(int i=0;i<n;i++)
       {
        int a=0;
        int b=m-1;
        while(a < b)
        {
            int temp = mat[i][a];
            mat[i][a]=mat[i][b];
            mat[i][b]=temp;
            a++;
            b--;
        }
       }
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<m;j++)
        {
            System.out.print(mat[i][j] + " ");
        }
        System.out.println();
       }
       
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter the Value of m : ");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

         System.out.println("Enter the Elements in an array : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }

       

       
        reverseRow(mat,n,m);
    }
}

// Q5. Check if an element x exists in the given sorted matrix or not. Each row and column is sorted in itself. If it does not exist, return -1, else return its row and column index.

//These Question is same as Q.1 , So
//Refer Question Number 1.
