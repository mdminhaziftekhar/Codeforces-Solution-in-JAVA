import java.util.*;

public class 61A-Ultra-Fast-Mathematician{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String a, b, c;
		
		a = scan.nextLine();
		b = scan.nextLine();
		
		c = a;
		
		for(int i = 0; i<a.length(); i++) {
			if(a.charAt(i) == b.charAt(i)) {
				char[] myNameChars = c.toCharArray();
				myNameChars[i] = '0';
				c = String.valueOf(myNameChars);
			}
			else {
				char[] myNameChars = c.toCharArray();
				myNameChars[i] = '1';
				c = String.valueOf(myNameChars);
			}
		}
		
		System.out.println(c);

	}

}
