package exercise;

public class Population {
	public static void main(String[] args) {
		int c_population =312032486;
		int t_year= 31536000;
		int birth=t_year/7;
		int death =t_year/13;
		int immigrant=t_year/45;
		int days=365;
		
		int t_population = birth+immigrant-death;
		System.out.println(t_population);
		for(int i=1;i<=5;i++) {
			c_population = c_population+t_population;
			System.out.println("population for year "+i+"is: "+c_population);
		}
		
		
	}

}
