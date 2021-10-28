
package Javaprogram;
public class Armstrong
{
 public static void main(String args[])
 {
  int a=567;
  int b,c,d,e,f,g,h;
  int total=0;
      b=a/100;
      e=a%100;
      c=e/10;
      d=e%10;
      f=b*b*b;
      g=c*c*c;
      h=d*d*d;
      total=f+g+h;
      System.out.println(total);
  }
}