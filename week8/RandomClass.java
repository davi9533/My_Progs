package week8;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		int numTest=20,randomInt;
		Random rnd =  new Random();
		for(int i=0;i<=numTest;i++) {
			randomInt=rnd.nextInt(100);
			System.out.println(randomInt);
		}
			
	}
}
