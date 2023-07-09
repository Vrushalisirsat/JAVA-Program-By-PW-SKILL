// Q.1 the string should be compressed such that consecutive duplicate of chracter are replaced with the chracter and followed by the numberof consecutive duplicate
//Input :- aaabbbbccddde
//Output :- a3b4c2d3e1

class stringCompressed
{
    public static void main(String args[])
    {
       String  str = "aaabbbbccdee";
       String ans = "" + str.charAt(0);
       int count=1;
       for(int i=1;i<str.length();i++)
       {
        char curr = str.charAt(i);
        char prev = str.charAt(i-1);
        if(curr == prev)
        count++;
        else{
            if(count>1) ans += count;
            count=1;
            ans += curr;
        }
       } 
      if(count>1) ans += count;
       System.out.println(ans);
    }
}