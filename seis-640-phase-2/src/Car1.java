public class Car1 {
	public static void main(String[] args) {

		Car1 car1 = new Car1();
		car1.setSpeed(Car1.FAST);
		car1.setsize(10);
		car1.setColor("RED11");

		System.out.println(car1.toString());

	}

	{

	}
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;

	private int speed = SLOW;
	private double size = 5;
	private String color = "white";

	public Car1() {

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getsize() {
		return size;
	}

	public void setsize(double size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "SpEed" + "-------" + speed + "\n" + "Color" + "-------" + color + "\n" + "Size" + "-------" + size
				+ "n\"";

	}
}
