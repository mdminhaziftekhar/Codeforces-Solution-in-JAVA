import java.util.*;
public class remove_Smallest {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();

		for(int i = 0; i<t; i++){
            ArrayList<Integer> a = new ArrayList<>();
            int size = scan.nextInt();

            for(int j = 0; j<size; j++){
                int b = scan.nextInt();
                a.add(b);
            }
            Collections.sort(a);

            int count = 1;

            for(int j = 1; j<a.size(); j++){
                int difference = a.get(j) - a.get(j-1);
                if(difference > 1){
                    count = 0;
                    break;
                }
            }

            if(count == 0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }

	}


}
