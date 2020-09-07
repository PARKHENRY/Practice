import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		long lightspeed;
		long distance;
		
		lightspeed = 300000;
		distance = lightspeed * 365l * 24 * 60 * 60;
		
		System.out.println("빛이 1년 동안 가는 거리 : "+distance+"km.");
		

	}
}
