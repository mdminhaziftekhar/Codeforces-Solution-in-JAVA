import java.util.*;
import java.lang.Math;

public class candies {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		while(t > 0) {
			t--;
			int n = scan.nextInt();
			int i = 2, ans;
			
			while(1==1) {
				int a = (int) Math.pow((double)2, (double)i);
				a = a - 1;
//				System.out.println("A : "+a);
				if(n % a == 0) {
					ans = n /a;
					break;
				}
				else {
					i++;
				}
			}
			
			System.out.println(ans);
		}

	}

}
