package studio7;

public class die {
	
	private int sides;
	public die() {
		sides =6;
	}
	
	public die(int sides) {
		this.sides=sides;
	}
	
	public int Roll(){
		return (int)(Math.random()*sides)+1;
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	@Override
	public String toString() {
		return "die [sides=" + sides + ", Roll()=" + Roll() + "]";
	}
	
	public static void main(String[] args) {
		die NEWDIE = new die(12);
		System.out.println(NEWDIE.Roll());
		System.out.println(NEWDIE.getSides());
		System.out.println(NEWDIE.toString());
	}
}


