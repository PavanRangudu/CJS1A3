
public class CJS1A3_swap_without_third_var {
	public static void main (String s[]) {
		int a = 5, b = 7; // Initial values taken (for example)
		// Swaping without third variable
		a = a + b; // a = 12 , b = 7
		b = a - b; // a = 12 , b = 5
		a = a - b; // a = 7 , b = 5
		System.out.println("Swapped values a = "+a+" b = "+b);
	}
}
