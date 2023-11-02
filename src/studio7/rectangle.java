package studio7;

public class rectangle {

	private double length;
	private double width;
	
	public rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return length * width;
	}
	
	public double perimeter() {
		return (2 * length) + (2 * width);
	}
	
	public boolean comparison(rectangle areaR) {

		if (area() >= areaR.area()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean square() {
		if (this.length == this.width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		rectangle R = new rectangle(5, 6);
		System.out.println(R.area());
		System.out.println(R.perimeter());
		rectangle N = new rectangle(8, 9);
		System.out.println(N.comparison(R));
		System.out.println(R.square());
	}
	
	
	
//	public static double rectangle(double length, double width, double areaR) {
//		double areaOg = length * width;
//		double perimeter = (2 * length) + (2 * width);
//		
//		if(areaOg >= areaR) {
//			return 1;
//		}
//		else {
//			return -1;
//		}
//	}

}
