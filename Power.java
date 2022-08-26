import java.util.Scanner;
public class Power {
   public static double power(double base , double expo) {
	   if(expo==0) {
		   return 1;
	   }
	   if (expo==-1) {
		   return 1/base;
	   }
	   if (expo<-1) {
		   return 1/power(base,-expo);
	   }
	   return base * power(base,expo-1);
   }
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base");
		a=sc.nextInt();
		System.out.println("Enter Power");
		b=sc.nextInt();
		var result = power(a,b); //Calling Method
		System.out.println("The reult of Base "+a+" and Power "+b+" is "+result);

	}

}
