public class Solution
  {
    public static void main(String[] args)
    {
     System.out.println(skipApp("fasdscappnsapplebcbs"));
    }
      static String skipApp(String ip)
    {
      if(ip.isEmpty())
      {
        return "";
      }
      if(ip.startsWith(App) && !ip.startsWith(Apple))
      {
          return skipApp(ip.substring(3));
      }
      else
      {
        return ip.charAt(0)+skipApp(ip.substring(1));
      }
    }
  }
