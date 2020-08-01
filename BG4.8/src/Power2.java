import java.util.Scanner;

public class Power2 {
	static double calculate(double a, int b) {
		double ans= Math.pow(a, b);
		return ans;
	}
	
	static int calculate(int a, int b) {
		int ans= (int) Math.pow(a, b);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alt=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Input the base");
		double base= sc.nextDouble();
		if(base%1==0)
			alt= (int) base;
		System.out.println("Input the power");
		int exp= sc.nextInt();
		double ans= calculate(base,exp); 
		if(alt!=0) {
			int an= calculate(alt, exp);
			System.out.println(an);
		}
		else {
			System.out.println(ans);
		}
		sc.close();

	}

}



