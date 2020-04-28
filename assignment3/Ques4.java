package assignment3;

import java.util.Random;

public class Ques4 {

	public static void main(String[] args) {

        Random r = new Random(1000);

        for (int i = 0; i < 50; i++) {

            System.out.printf("%3d ", r.nextInt(101));
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
	
}
