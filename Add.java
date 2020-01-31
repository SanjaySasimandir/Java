import java.util.Scanner;


public class Add {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2,sum;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number1: ");
		number1=sc.nextInt();
		System.out.println("Enter number2: ");
		number2=sc.nextInt();
		sc.close();
		sum=number1+number2;
		System.out.println("Sum of number1 & number2 "+sum);
		
	}

}
