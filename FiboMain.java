import java.util.Scanner;

class Fibonacci {

	/**
	 * @param args
	 */
	
		int firstNumber, secondNumber, thirdNumber,n;
		Fibonacci(int limit){
			n=limit;
			firstNumber=0;
			secondNumber=1;
			
		}
		void calculateFibonacci(){
			System.out.println(firstNumber+" ");
			System.out.println(secondNumber+" ");
			for(int i=0;i<n-2;i++){
				thirdNumber=firstNumber+secondNumber;
				System.out.println(thirdNumber+" ");
				firstNumber=secondNumber;
				secondNumber=thirdNumber;
			}
				
		}
	}



public class FiboMain{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of Fibonacci series");
		limit=sc.nextInt();
		sc.close();
		Fibonacci fibo=new Fibonacci (limit);
		fibo.calculateFibonacci();
		
	}

}

