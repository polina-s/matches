import java.util.Scanner;

public class matches {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double width = Math.floor(Math.sqrt(n));
		double length = Math.ceil(n/width);
		int match = 2*n + (int)width + (int)length;
		System.out.print(match);
	}
}