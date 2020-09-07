import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		System.out.print("점수를 입력하세요.");

		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();

		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		default:
			System.out.println("C");

		}

	}

}
