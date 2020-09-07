
public class CarInfo {

	static int Maxspeed = 300;
	static int wind(int x) {
		return Maxspeed / x;
	}

	int year;
	String brand;


	public static void main(String[] args) {
		
		double result = CarInfo.wind(10);
		
		System.out.println(result);

	}

}


