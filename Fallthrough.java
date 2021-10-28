class Fallthrough
{
 public static void main(String args[])
 {
  int a=1;
  switch(a)
  {
   case 1:
   case 2:
   case 3:
   case 4:
   case 5:
   System.out.print("weekday");
   break;
   case 6:
   case 7:
   System.out.print("holiday");
   break;
   default:
   System.out.print("invalid");
   break;
  }
 }
} 