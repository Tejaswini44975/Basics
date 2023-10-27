// Approach 2

public class Solution
  {
    public static void main(String[] args)
    {
          System.out.println(skip(baccdah));
    }

 static String skip(String ip)
    {
      if(ip.isEmpty())
      {
        return;
      }
      char ch=ip.charAt(0);
      if(ch=='a')
      {
        return skip(ip.substring(1));
      }
        return ch + skip(ip.substring(1));
    }
  }
