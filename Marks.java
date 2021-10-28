import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		
		int Maths , Chemistry , Physics;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Maths Marks");
		Maths=sc.nextInt();
		System.out.println("Enter the Chemistry Marks");
		Chemistry=sc.nextInt();
		System.out.println("Enter the Physics Marks");
		Physics=sc.nextInt();
		if(Maths>60 && Chemistry>60 && Physics>60)
		{
			System.out.println("Passed");
		}
		else if ((Maths>60 && Chemistry>60)||(Maths>60 && Physics>60)|| Chemistry>60 && Physics>60) 
		{
			System.out.println("Promoted");
		}
		else if((Maths>60 || Chemistry >60 || Physics>60) || (Maths<60 && Chemistry<60 && Physics<60))
		{
			System.out.println("Failed");
		}
		else 
		{
			System.out.println("Enter Valid Choice");
		}
		
		

	}

}