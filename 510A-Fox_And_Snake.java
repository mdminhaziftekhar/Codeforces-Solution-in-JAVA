import java.util.Scanner;
import java.util.ArrayList;
public class A_Fox_And_Snake {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int line = scan.nextInt();
		int chars = scan.nextInt();
		int a = line / 2;
		
		ArrayList<String> v = new ArrayList<String>();
		
		for(int i = 0; i<a; i++) {
			String s;
			if(i % 2 == 0) {
				s = ".";
				for(int j = 0; j<chars-2; j++) {
					s = s + '.';
				}
				s += '#';
			}
			else {
				s = "#";
				for(int j = 0; j<chars-1; j++) {
					s += '.';
				}
			}
			v.add(s);
		}
		
		String s;
		s = "#";
		for(int i = 0; i<chars-1; i++){
	        s += '#';
	    }

	    int j = 0;
	    for(int i = 0; i<line; i++){
	        if(i % 2 == 0){
	            System.out.println(s);
	        }
	        else{
	            System.out.println(v.get(j));
	            j++;
	        }

	}

}
}
