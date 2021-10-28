class Bingbang
{
 public static void main(String args[])
 {
  int a=27;
  if((a%3==0) && (a%5==0))
  {
   System.out.print("bingbang");
  }else if(a%3==0)
  {
   System.out.print("bing");
  }else if(a%5==0)
  {
   System.out.print("bang");
  }
 }
}