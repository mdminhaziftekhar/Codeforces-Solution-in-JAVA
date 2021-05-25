import java.util.*;

public class restoring_Three_Numbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> v = new ArrayList<Integer>();
		
		for(int i = 0; i<4; i++) {
			int a = scan.nextInt();
			v.add(a);
		}
		
		Collections.sort(v);
		
		int a = v.get(3) - v.get(2);
		int b = v.get(3) - v.get(1);
		int c = v.get(3) - v.get(0);
		
		System.out.println(a+" "+b+" "+c);
		
	}
}
