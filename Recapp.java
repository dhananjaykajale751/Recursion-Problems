// Applications of Integers
//1.Sum of digits of number
public class Recapp {
  public int sumOfDigits(int n) {
	 
	  if (n==0|| n<0) {
		  return 0;
	  }
	  return n%10+sumOfDigits(n/10);
  }
	public static void main(String[] args) {
		
      Recapp num1 = new Recapp();
      var sum1 =num1.sumOfDigits(25698);
      System.out.println(sum1);
	}

}
