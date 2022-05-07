public class Age
{
    public static void main(String[] args)
    {
         try
         {
         int age=15;
          
          if(age>18)
          {
              System.out.println("Candidate eligible for voting");
          }
          }
          catch(ArithmaticException e)
          {
              System.out.println("Please enter your current age");
          }
          
    }
}
