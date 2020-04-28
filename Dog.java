public class Dog {
	//instance variables
	private String name;
	private int age;
	
	//defining parameterized constructor to accept & initialize instance variables
	public Dog(int age, String name) {
		this.age = age;
		this.name = name;
	}
	//Getter & Setters for name and age of the dog
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int computeAge() {
		this.age = age * 7;
		return age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}

	
}