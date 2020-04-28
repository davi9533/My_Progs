
public class Kennel {
	public static void main(String[] args) {
		Dog d1 = new Dog(5, "Buzzo"); //creating first object
		Dog d2 = new Dog(7, "Rambo"); //creating second object
		Dog d3 = new Dog(3, "Simbba"); //creating third object

		//setting name of the dog
		d2.setName("Tuffy");
		System.out.println(d2);
		
		//setting age of the dog
		d1.setAge(9);
		System.out.println(d1);
				
		System.out.println(d3);

		System.out.println("Dog's age in person years: ");
		System.out.println(d1.getName()+": "+d1.computeAge());
		System.out.println(d2.getName()+": "+d2.computeAge());
		System.out.println(d3.getName()+": "+d3.computeAge());
	}
}
