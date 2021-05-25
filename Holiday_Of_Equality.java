import java.util.*;

public class Holiday_Of_Equality {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    ArrayList<Integer> arr = new ArrayList<>();

	    int n = scan.nextInt();

	    for(int i = 0; i<n; i++){
	        int a = scan.nextInt();
	        arr.add(a);
        }
        Collections.sort(arr);

	    int h = arr.get(arr.size()-1), ans = 0;

	    for(int i = 0; i<arr.size(); i++){
	        ans = ans + (h - arr.get(i));
        }
        System.out.printf("%d\n",ans);
    }
}
