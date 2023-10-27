public class Solution
  {
    public static void main(String[] args)
    {
       System.out.println(skipApple("bcadappledavg"));
    }

static String skipApple(String ip)
    {
      if(ip.isEmpty())
      {
              return " ";
      }
      if(ip.startsWith("apple"))
      {
        return skipApple(ip.substring(5));
      }
      else
      {
        return ip.charAt(0) + skipApple(ip.substring(1));
      }
    }
  }
