import java.util.Scanner;

class Car {

	int num = 5;
	int speed = 110;

	void velUp() {
		speed += 10;
	}

	void velDown() {
		speed -= 5;
	}

}

public class Test1 {

	public static void main(String[] args) {

		Car tico = new Car();

		System.out.println(tico.speed);
		tico.velUp();
		tico.velUp();
		System.out.println(tico.speed);
		tico.velDown();
		System.out.println(tico.speed);

	}

}
