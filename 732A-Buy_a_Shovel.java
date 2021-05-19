import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int p = scan.nextInt();
		int r = scan.nextInt();
		
		int count = 2, ans = 0, p2;
		
		if(((p-r)%10==0) || p%10==0) {
			ans = 1;
			//System.out.printf(" p : %d\n",p);
		}
		else {
			while(1==1){
				p2 = p * count;
				//System.out.printf(" p : %d\n",p2);
				if(((p2-r)%10==0) || p2%10==0) {
					ans = count;
					break;
				}
				count = count+1;
				//System.out.printf(" count : %d\n",count);
			}
		}
		
		System.out.println(ans);

	}

}
