import java.util.Scanner;


public class PrimeNumberOrNot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,i;
		boolean isPrime=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		number1=sc.nextInt();
		for(i=2;i<number1/2;i++)
			{
			if(number1%i==0){
					System.out.println("The Number is not Prime");
					isPrime=false;
					break;
			}
			}
		if(isPrime){
				System.out.println("The Number is Prime");
		
			}

		}
}

