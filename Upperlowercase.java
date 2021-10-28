class Upperlowercase
{
 public static void main(String args[])
 {
  char value='K';
  if(value>=65 && value<=90)
  {
   System.out.print("uppercase");
  }else if(value>=97 && value<=122)
   {
    System.out.print("lowercase");
   }else if((value>=32 && value<=47) || (value>=58 && value<=64) || (value>=91 && value<=96) || (value>=123 && value<=127))
   {
    System.out.print("special character");
   }else
   {
    System.out.print("number");
   }
 }
}