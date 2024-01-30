package JavaMark;

import java.util.Arrays;
import java.util.Date;

public class JavaPractice{
	public static void main(String[] args) {
		System.out.println("Testing to see whether it works");
		Date now = new Date();
		System.out.println(now);

		// Arrays
		int[] numbers = new int[6];
		numbers[0] = 4;
		numbers[1] = 4;
		numbers[2] = 4;
		numbers[3] = 4;
		numbers[4] = 4;
		numbers[5] = 4;
		System.out.println(Arrays.toString(numbers));

		int temprature = 12;
		boolean isWarm = temprature > 20 && temprature < 30;
		System.out.println(isWarm);
	}
}
