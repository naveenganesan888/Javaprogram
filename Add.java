class Add
{
  public static void main(String rgs[])
  {
   int a=7589;
   int total=0;
   int b=a%10;
       a=a/10;
   int c=a%10;
       a=a/10;
   int d=a%10;
       a=a/10;
   total=a+d+c+b;
   System.out.print(total);
  }
}