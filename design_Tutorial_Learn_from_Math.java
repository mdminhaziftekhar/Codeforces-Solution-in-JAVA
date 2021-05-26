import java.util.*;
public class design_Tutorial_Learn_from_Math {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Integer a = scan.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("4 "+(a-4));
		}
		else {
			System.out.println("9 "+(a-9));
		}

	}

}
