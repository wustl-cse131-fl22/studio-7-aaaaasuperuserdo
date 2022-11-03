package studio7;
import java.util.Scanner;
public class Fraction {

	public static String addition(int n1, int n2, int d1, int d2) {
		
		int nsum = n1 + n2;
		int dsum = d1 + d2;
		
		String addedsum= (nsum +"/" + dsum);
		return addedsum;
	}
	
	public static String product(int n1, int n2, int d1, int d2) {
		
		int nsum = n1 * n2;
		int dsum = d1 * d2;
		
		String addedprod= (nsum +"/" + dsum);
		return addedprod;
		
	}
	
	public static String reciprocal(int n1, int d1) {
		

		String recip= (d1 +"/" + n1);
		return recip;
		
	}
	
	public static void simple(int n1, int d1) {
		int max = 7;
		
		int bla = 0;
		int ble = 0;
		
		for (int i = 1; i < max; i++)
		{
			if (n1%i == 0 && d1%i == 0)
			{
				bla = n1/i; 
				ble = d1/i;
				//return (n1/i + "/" + d1/i);
				
			}
			//System.out.println(n1/i + "/" + d1/i);
		}
		System.out.println("Meth 4: " + bla + "/" + ble);
		
		
	}
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("1st fraction numerator");
		int n1 = in.nextInt();
		System.out.println("1st fraction denominator");
		int n2 = in.nextInt();
		System.out.println("2nd fraction numerator");
		int d1 = in.nextInt();
		System.out.println("2nd fraction denominator");
		int d2 = in.nextInt();
		
		System.out.println("Meth 1: " + addition(n1, n2, d1, d2));
		System.out.println("Meth 2: " + product(n1, n2, d1, d2));
		System.out.println("Meth 3: " + reciprocal(n1, d1));
		simple(n1, d1);
	}

}
