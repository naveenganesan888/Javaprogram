class Differentoutput
{
 public static void main(String args[])
 {
  char value='B';
  if(value=='A' || value=='E' || value=='I' || value=='O' || value=='U')
  {
   System.out.print("VOWEL");
  }else if(value=='a' || value=='e' || value=='i' || value=='o' || value=='u')
  {
   System.out.print("vowel");
  }else if(value>=48 && value<=57)
   {
    System.out.print("NUMBER");
   }else if((value>=32 && value<=47)||(value>=58 && value<=64)||(value>=91 && value<=96)||(value>=123 && value<=127))
  {
   System.out.print("SPECIAL CHARACTER");
  }else
   {
    System.out.print("CONSONANT");
   }
  }
}
