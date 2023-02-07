// 2D-Array Practice Questions (Prefix sum) -------(Lecture 23)

// * Sum of Rectangle using Brute force method.-------------> (Worst Case Time Complexity)
/*
// Q.1 Given a matrix 'a' of dimension n*m and 2 coordinates (l1,r1) and (l2,r2). Return the sum of the rectangle from (l1,r1) to (l2,r2).
// Given :-  1. l2 >= l1 & r2 >= r1
//           2. 0 <= l1,l2 < n
//           3. 0 <= r1,r2 < m

import java.util.*;
class Array2D_6
{
    static int findSum(int[][] matrix, int l1,int r1,int l2,int r2)
    {
        int sum=0;
        for(int i=l1;i<=l2;i++)
        {
            for(int j=r1;j<=r2;j++)
            {
                sum=sum+matrix[i][j];
            }
        }
        return sum;
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

        System.out.println("Enter Rectangle Boundaries l1,r1,l2,r2 : ");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();

        System.out.println("Rectangle Sum " + findSum(matrix,l1,r1,l2,r2));
    }
}


// Method-2 : Pre-Caculating the horizontal sum for each row in the matrix.-------------> (Average Time Complexity)

import java.util.*;
class Array2D_6
{
    static void findPrefixSumMatrix(int[][] matrix)
    {
        int r=matrix.length;
        int c=matrix[0].length;         //if(r>0)

        //traverse horizontally to calculate row-wise prefix sum
        for(int i=0;i<r;i++)
        {
            for(int j=1;j<c;j++)
            {
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }
    
    static int findSum(int[][] matrix, int l1,int r1,int l2,int r2)
    {
        findPrefixSumMatrix(matrix);
        int sum=0;
        for(int i=l1;i<=l2;i++)
        {
            // r1 to r2 sum for row i
            if(r1 >= 1)
            {
                sum += matrix[i][r2] - matrix[i][r1-1];
            }
            else{
                sum += matrix[i][r2];
            }
        }
        return sum;
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

        System.out.println("Enter Rectangle Boundaries l1,r1,l2,r2 : ");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();

        System.out.println("Rectangle Sum " + findSum(matrix,l1,r1,l2,r2));
    }
}

*/

// Prefix Sum Over Columns and Rows Both . ---------------> (Best case time complexity)

import java.util.*;
class Array2D_6
{
    static void findPrefixSumMatrix(int[][] matrix)
    {
        int r=matrix.length;
        int c=matrix[0].length;         //if(r>0)

        //traverse horizontally to calculate row-wise prefix sum
        for(int i=0;i<r;i++)
        {
            for(int j=1;j<c;j++)
            {
                matrix[i][j] += matrix[i][j-1];
            }
        }

        
        //traverse vertically to calculate column-wise prefix sum
        for(int j=0;j<c;j++)
        {
            for(int i=1;i<r;i++)
            {
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }

    static int findSum(int[][] matrix, int l1,int r1,int l2,int r2)
    {
        findPrefixSumMatrix(matrix);
        int ans=0, sum=0, left=0, up=0, leftUp=0;

        sum = matrix[l2][r2];
        if(r1 >= 1)
        {
            left=matrix[l2][r1-1];
        }
        if(l1 >= 1)
        {
            up = matrix[l1-1][r2];
        }
        if(l1 >=1 && r1 >= 1)
        {
            leftUp=matrix[l1-1][r1-1];
        }

        ans = sum - left - up + leftUp;
        return ans;
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

        System.out.println("Enter Rectangle Boundaries l1,r1,l2,r2 : ");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();

        System.out.println("Rectangle Sum " + findSum(matrix,l1,r1,l2,r2));
    }
}