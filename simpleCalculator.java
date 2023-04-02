
import java.util.Scanner;
class SimpleCalculator
{
   public static void main(String args[])
	{
         Scanner sc=new Scanner(System.in);
		 int x,y;
		 char op;
		 x=sc.nextInt();
		 y=sc.nextInt();
	     sc.nextLine();
	     System.out.println("+ - Addition\n- - Subtraction\n/ - Division\n* - Multiplication\n% - Modulous\n");
		 System.out.println("Enter your choice");
		 op=sc.nextLine().charAt(0);
		 switch(op)
		 {
           case '+':
			   		System.out.println(x+y);
		   			break;
		   case '-':
			   		System.out.println(x-y);
		   			break;
		   case '*':
			   		System.out.println(x*y);
		   			break;
		   case '/':
			   		System.out.println(x/y);
		   			break;
		   case '%':
			   		System.out.println(x%y);
		   			break;
		   default:
			   		System.out.println("-1");
		   			break;
		   }
	}
}

