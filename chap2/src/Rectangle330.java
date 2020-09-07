
public class Rectangle330 extends Shape330 {

	private int width;
	private int height;

	public Rectangle330(int x, int y, int width, int height) {
		super(x, y);
		System.out.println("Rectangle()");
		this.width = width;
		this.height = height;
	}

	double calcArea(){
		return width * height;
	}
}
