class Postpre
{
 public static void main(String args[])
 {
  int a=3,b=5;
  System.out.println(a>b && (a++>b));
  System.out.println(a<b || (a<b++));
  System.out.println(a);
  System.out.println(b);
 }
}
