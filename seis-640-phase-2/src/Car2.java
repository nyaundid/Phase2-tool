
public class Car2 {

	public static void main(String[] args) {
		{
			Car2 car2 = new Car2();
			car2.setSpeed(Car1.SLOW);
			car2.setsize(5);
			car2.setColor("red");

			System.out.println(car2.toString());
		}

	}

	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;

	private int speed = SLOW;

	private double size = 5;
	private String color = "white";

	public Car2() {

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
		return "speed" + speed + "\n" + "color" + color + "\n" + "size" + size + "n\"";

	}
}
