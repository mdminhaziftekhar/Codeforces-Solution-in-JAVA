import java.util.*;

public class Vasya_The_Hipster {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		int b = scan.nextInt();
		
		int a = 0, ans1 = 0, ans2 = 0;
		
		if(r<b) {
			ans1 = r;
			a = b - r;
			ans2 = a/2;
		}
		else {
			ans1 = b;
			a = r - b;
			ans2 = a/2;
		}
		
		System.out.println(ans1+" "+ans2);

	}

}
