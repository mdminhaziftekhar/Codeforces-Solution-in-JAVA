import java.util.*;

public class main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int countr = 0, countc = 0, a;
		
		while(n > 0) {
			n--;
			
			a = scan.nextInt();
			
			if(a >= 0) {
				countr += a;
			}
			else if(a < 0) {
				if(countr != 0) {
					countr--;
				}
				else {
					countc++;
				}
			}
		}
		System.out.println(countc);
		
	}
}
