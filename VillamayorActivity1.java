/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//Archilles Villamayor
//BSIT3B
//Activity 1=
public class Main
{
	public static void main(String[] args) {
		
		int num1 = 56;
        int num2 = 55;
        int choice = 4;
        int result;

        System.out.println("1st number: " + num1);
        System.out.println("2nd number: " + num2);
        System.out.println("arithmeticprocess: " + choice);

if (choice == 1) {
            result = num1 + num2;
            System.out.println("Result (Addition): " + result);
        } else if (choice == 2) {
            result = num1 - num2;
            System.out.println("Result (Subtraction): " + result);
        } else if (choice == 3) {
            result = num1 * num2;
            System.out.println("Result (Multiplication): " + result);
        } else if (choice == 4) {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result (Division): " + result);
            } else {
                System.out.println("Error: Division by zero will kill us you fool");
            }
        } else {
            System.out.println("Invalid choice! Please select 1-4.");
        }		
		
	}
}
