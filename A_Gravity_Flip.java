import java.util.Scanner;
import java.util.Arrays;

public class A_Gravity_Flip {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}
