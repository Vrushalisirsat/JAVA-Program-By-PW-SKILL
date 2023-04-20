/* Q1 - Write a Java method to compute the average of three numbers
Input1:+
25
45
65
Output2:
45

*/

import java.util.*;
class average
{
    static double printAverage(int a,int b,int c)
    {
        double avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.println("Average Of 3 numbers : " + printAverage(n1,n2,n3));
    }
}