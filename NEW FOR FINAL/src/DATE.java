public class DATE

{

	public static void main(String[] args) {

		java.util.Date date = new java.util.Date();
		System.out
				.println("the dates and times for the elapsedtimes 1,100,1000,10000,100000,1000000,10000000,100000000");

		for (long i = 10000; i <= 1e11; i *= 20) {
			date.setTime(i);

			System.out.println(date.toString());
			System.out.println("date elapsedtimes");
		}
	}
}
