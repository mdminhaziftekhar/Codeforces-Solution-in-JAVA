import java.util.Scanner;
public class yet_Another_Two_Integers_Problem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long t = scan.nextLong();
		
		while(t > 0) {
			t--;
			long ans = 0;
			long a = scan.nextLong();
			long b = scan.nextLong();
			
			if(a == b) {
				ans = 0;
			}
			else if(b > a) {
				a = b - a;
				if(a > 10) {
					ans = a / 10;
					if(a%10!=0) {
						ans = ans + 1;
					}
				}
				else{
					ans = 1;
				}
			}
			else if(a > b) {
				a = a - b;
				if(a > 10) {
					ans = a / 10;
					if(a%10!=0) {
						ans = ans + 1;
					}
					
				}
				else {
					ans = 1;
				}
			}
			
			System.out.println(ans);
		}

	}

}
