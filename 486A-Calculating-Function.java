import java.util.*;

public class 486A-Calculating-Function{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Long n;
		
		n = scan.nextLong();
		
		if(n % 2 == 0) {
			System.out.println((n/2));
		}
		else {
			System.out.println((-1 * (n/2)) - 1);
		}
		
	}

}
