import java.util.Scanner; //scanner to read keyboard

public class AgeAndWeight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age in years: ");
		int age = input.nextInt();//set age = to the next int typed by user
		System.out.println("Enter your weight in pounds: ");
		double weight = input.nextDouble();//set weight = to the next double typed by user
		System.out.println("Your age is " + age + " and your weight is " + weight + " pounds.");//put all info together

	}

}
