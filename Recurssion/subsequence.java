public class Solution
  {
    public static void main(String[] args)
    {
         subSeq(" " , "abc");
    }
    static void subSeq(String ip, String op)
    {
      if(ip.isEmpty())
      {
        System.out.println(ip);
        return;
      }
      char ch=ip.charAt(0);
      subSeq(op+ch , ip.substring(1));
      subSeq(op , ip.substring(1));
    }
  }
