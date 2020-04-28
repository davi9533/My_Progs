package lab9;

public class TestMonster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FireMonster fireMonster = new FireMonster();
		fireMonster.setName("Dr.Jean");

		WaterMonster waterMonster = new WaterMonster();
		waterMonster.setName("Aquaman");

		StoneMonster stoneMonster = new StoneMonster();
		stoneMonster.setName("Magneto");

		System.out.println(fireMonster.attack());
		System.out.println(waterMonster.attack());
		System.out.println(stoneMonster.attack());
	}

}
