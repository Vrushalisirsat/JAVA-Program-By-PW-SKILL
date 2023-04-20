/*
Q4 - Write a Java method to check whether a year (integer) entered by the user is a leap year
or not.

Input1 : 2017
Output1 : false

Input2 : 2024
Output2 : true
*/

import java.util.*;
class leapYear
{
    static void leapYear(int year)
    {
       if(year%400 == 0 && year%100 == 0 || year%4 ==0 && year%100 != 0)
       {
        System.out.println("Leap year");
       }
       else{
        System.out.println("Not Leap year");
       }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter leap year : ");
        int year = sc.nextInt();
        
        leapYear(year);
    }
}