import java.util.Scanner;

class Notes {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		// while loop

		int num;
		// num = 5;

		// while (num < 5) {
		// 	System.out.println(num);
		// 	num = num + 1;
		// }

		// System.out.println("Rest of our code");
		
		//Do while loop

		// num = 5;

		// do {
		// 	System.out.println(num);
		// 	num = num + 1;
		// } while(num < 5);

		// System.out.println("Rest of our code");
		
		//checking input

		// int in;
		// System.out.print("Input a number between 1 and 10: ");
		// in = input.nextInt();

		// while (in < 1 || in > 10) { //this condition will be what is considered INVALID

		// 	//Ask again - prompt
		// 	System.out.print("Error: You input an incorrect value, please input a number between 1 to 10:");
		// 	//replace the variable that is being checked
		// 	in = input.nextInt();
			
		// }

		// System.out.println(in);

		//checking input with a do while loop

		int in;
		in = 5; //starts as valid
		do { 
			if (in < 1 || in > 10) {
				System.out.print("Error invalid input - ");
			}
			System.out.print("Input a number between 1 and 10: ");
			in = input.nextInt();
		} while  (in < 1 || in > 10);//this condition will be what is considered INVALID

		System.out.println(in);

		
	}
}