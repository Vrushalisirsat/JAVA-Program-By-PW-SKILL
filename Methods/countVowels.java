/* Q2 - Write a Java method to count all vowels in a string.

Input : coding
Output : 2
*/


import java.util.*;
class countVowels
{
    static int countVowels(String str)
    {
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
        char ch = str.charAt(i);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            count++;
        }
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println("count : " + countVowels(s));
    }
}