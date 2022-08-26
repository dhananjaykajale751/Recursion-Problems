public class Gcd {
	static int n;
public static int gcd(int a ,int b) {
	if (a<0 || b<0) {
		return -1;
	}
	if (b==0) {
		return a;
	}
	return gcd(a,a%b);

}
	public static void main(String[] args) {
		var result = gcd (100,175);
		System.out.println(result);
	}
}
