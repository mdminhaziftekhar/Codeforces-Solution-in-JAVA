import java.util.Scanner;
public class k_divisible_sum {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t>0) {
			t--;
			int n, k;
			n = scan.nextInt();
			k = scan.nextInt();
			
			if(n == 1) {
				System.out.println(k);
				continue;
			}
			if(n == k) {
				System.out.println(1);
				continue;
			}
			if(n < k) {
				int a = k/n;
				int b = k%n;
				if(b != 0) {
					a++;
				}
				System.out.println(a);
				continue;
			}
			else {
				int c = n/k;
				int d = n%k;
				if(d != 0) {
					c++;
				}
				k = k * c;
				int a = k/n;
				int b = k%n;
				if(b!=0) {
					a++;
				}
				System.out.println(a);
				continue;
			}
		}
	}
	

}
