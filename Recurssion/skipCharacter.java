public class Solution
  {
    public static void main(String[] args)
    {
      skip(" ",baccdah);
    }

static void skip(String op, String ip)
    {
          if(p.isEmpty())
          {
            System.out.println(op);
            return;
          }
      char ch = ip.charAt(0);
      if(ch=='a')
      {
        skip(op, ip.substring(1));
      }
        skip(op+ch, ip.substring(1));
    }
  }
