import java.util.*;
public class I_love_username {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		int n = scan.nextInt();
		a--;
		
		int low = n;
		int high = n;
		
		int count = 0;
		
		while(a>0) {
			a--;
			
			n = scan.nextInt();
			
			if(n < low) {
				count++;
				low = n;
			}
			else if(n > high) {
				count++;
				high = n;
			}
			
		}
		
		System.out.println(count);
		
		
	}

}
