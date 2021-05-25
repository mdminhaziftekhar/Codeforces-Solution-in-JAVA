import java.util.Scanner;

public class drinks{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		double x = 0.00, ans = 0.00;
		
		for(int i = 0; i<n; i++) {
			x = (double)arr[i] + x;
		}
		
		x = x / 100.00;
		
		ans = (x / (double)n) * 100.00;
		
		System.out.println(ans);

	}

}
