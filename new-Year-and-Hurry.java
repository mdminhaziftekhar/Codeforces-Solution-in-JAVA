import java.util.*;
public class new-Year-and-Hurry {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int sum = 0, count = 0;
		
		if(k == 0) {
			System.out.println(n);
		}
		else if(k == 240) {
			System.out.println(0);
		}
		else {
			for(int i = 1; i<=n; i++) {
				sum = sum + (i * 5);
				//System.out.println("Sum : "+sum);
				if(sum+k > 240) {
					break;
				}
				count++;
			}
			System.out.println(count);
		}

	}

}
