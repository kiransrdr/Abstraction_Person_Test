import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		SwapNumbers obj=new SwapNumbers();
		EvenOdd  obj1=new EvenOdd();
		System.out.printf("Enter num1");
		int num1=input.nextInt();
		System.out.printf("Enter num2");
		int num2=input.nextInt();
		System.out.printf("Before Swapping \n First number is %d and Second number is %d\n",num1,num2);
		obj.swapTwoNum(num1,num2);


		//num1 and num2 are sent to swapTwoNum function. which recieve these two number in local variables
		//so the function swap two numbers and return values to method call. after method call num1 num2 remains
		//same because scope of local variables was limited to method. it doesnot change the var num1 and num2. 
		

		System.out.printf(" Swapping without using 3rd variable, \n First number is %d and Second number is %d\n",num1,num2);
		obj.swapwithtwovar(num1,num2);

		System.out.printf("After Executing Method \n First Number is %d and Second number is %d \n",num1,num2);
		obj1.evenOd(num1,num2); 
		}

}
