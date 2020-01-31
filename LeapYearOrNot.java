import java.util.Scanner;

public class LeapYearOrNot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year: ");
		year=sc.nextInt();
		if(year%4==0){
			if(year%100==0){
				if (year%400==0){
					System.out.println("It is a Leap Year: "+year);
				}
				else{
					System.out.println("Not a Leap Year:"+year);
				}
					
			
			}
		}
		else{
			System.out.println("Not a Leap Year:"+year);
		}

	}

}
