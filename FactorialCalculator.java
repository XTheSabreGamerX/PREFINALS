/*Juan Carlos T. Matias
IT101A*/
import java.util.Scanner;
public class FactorialCalculator {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	int n;
	int fact = 1;
	
	System.out.println("<----- Factorial Calculator ----->");
	
	do {
	System.out.print("Enter a positive Integer: ");
	n = s.nextInt();
			
	if (n >= 0) { 
		fact = 1;
		System.out.print(n+"! = "); 
		for (int a = 1; a <= n; a++){ 
			fact = fact*a;	
			if (a == 1){ 
				System.out.print(a); 
			} else {
				 System.out.print(" x "+a); 
				} 
			}
		System.out.println("\nThe factorial of " + n + " is " + fact);	
		}
	else if (n < 0) {
		System.out.println("Invalid input! Program Stopped!");
		}
	} while (n >= 0);
}
}
	


