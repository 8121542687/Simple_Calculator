import java.util.Scanner;
class  Simple_Calculator
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("============================================================");
		System.out.println("Welcome To Simple Calculator");
		System.out.println("============================================================");
		System.out.println("	"+(char)4+"Enter 1 for Addition");
		System.out.println("	"+(char)4+"Enter 2 for Subtraction");
		System.out.println("	"+(char)4+"Enter 3 for Multiplication");
		System.out.println("	"+(char)4+"Enter 4 for Division(Quotient)");
		System.out.println("	"+(char)4+"Enter 5 for Division(Remainder)");
		System.out.println("============================================================");
		System.out.println("Enter your choice");
		int choice=scan.nextInt();
		System.out.println("============================================================");
		if(choice==1)
		{
			System.out.println("!!!You have selected ADDITION operation");
		System.out.println("============================================================");
			System.out.println("Enter first number");
			int add1=scan.nextInt();
			System.out.println("Enter second number");
			int add2=scan.nextInt();
			System.out.println("ADDITION of "+add1+" and "+add2+" is " +(add1+add2));
			System.out.println("Thank You");
		}
		else if(choice==2)
		{
			System.out.println("!!!You have selected SUBTRACTION operation");
		System.out.println("============================================================");
			System.out.println("Enter first number");
			int sub1=scan.nextInt();
			System.out.println("Enter second number");
			int sub2=scan.nextInt();
			System.out.println("SUBTRACTION of "+sub1+" and "+sub2+" is " +(sub1-sub2));
			System.out.println("Thank You");
		}
		else if(choice==3)
		{
			System.out.println("!!!You have selected MULTIPLICATION operation");
		System.out.println("============================================================");
			System.out.println("Enter first number");
			int mul1=scan.nextInt();
			System.out.println("Enter second number");
			int mul2=scan.nextInt();
			System.out.println("MULTIPLICATION of "+mul1+" and "+mul2+" is " +(mul1*mul2));
			System.out.println("Thank You");
		}
		else if(choice==4)
		{
			System.out.println("!!!You have selected DIVISION-QUOTIENT operation");
		System.out.println("============================================================");
			System.out.println("Enter first number");
			int div1=scan.nextInt();
			System.out.println("Enter second number");
			int div2=scan.nextInt();
			System.out.println("DIVISION(QUOTIENT) of "+div1+" and "+div2+" is " +(div1/div2));
			System.out.println("Thank You");
		}
		else if(choice==5)
		{
			System.out.println("!!!You have selected DIVISION-REMAINDER operation");
		System.out.println("============================================================");
			System.out.println("Enter first number");
			int rem1=scan.nextInt();
			System.out.println("Enter second number");
			int rem2=scan.nextInt();
			System.out.println("DIVISION(REMAINDER) of "+rem1+" and "+rem2+" is " +(rem1%rem2));
			System.out.println("Thank You");
		}
		else
		{
			System.out.println("Enter correct choice");
		}
		System.out.println("============================================================");
		System.out.println("!!!Thank You Visit again!!!");
		System.out.println("============================================================");
	}
}