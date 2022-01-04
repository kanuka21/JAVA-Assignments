class abc
  {
    public static void main(String args[])
    {
      java.util.Scanner sc = new java.util.Scanner(System.in);
      System.out.println("Enter a = ");
       int a = sc.nextInt();
      System.out.println("Enter b = ");
       int b = sc.nextInt();

     try
       {
         int c = a/b;
         System.out.println("divide = "+c);
         
          }
       catch(ArithmeticException ae)
        {
          System.out.println("Dear, divide by zero is not possible");
           
          }
    
      }
    }