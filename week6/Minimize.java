package week6;

public class Minimize {
	public static void main(String[] args) {
		float sum = 0;
		for (float i = 0.01f; i <= 1.0f; i += 0.01f) {
			sum += i;
			
		}
		System.out.println("Sum: " + sum);
	}
}
