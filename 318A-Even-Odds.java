import java.util.Scanner;

public class 318A-Even-Odds{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Long n , k;
		
		n = scan.nextLong();
		k=scan.nextLong();
		
		if(k <= (n+1)/2) {
			System.out.println((2*k)-1);
		}
		else {
			k -= (n+1)/2;
			System.out.println(2*k);
		}
		 
	}

}
