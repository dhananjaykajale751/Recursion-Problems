import java.util.Scanner;
public class DecimalToBinary {
	public int demo(int n){
		if (n==0) {
			return 0;
		}
		return n%2+10*demo(n/2);
	}

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be Converted to binary :-");
		a=sc.nextInt();
		DecimalToBinary n1 = new DecimalToBinary();
		var result = n1.demo(a);
		System.out.println("The Binary of the number "+a+" is "+result);

	}

}
