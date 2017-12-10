public class DATE

{

	public static void main(String[] args)

	{
		java.util.Date date = new java.util.Date();
		System.out.println(
				" the dates and times for the elapsedtimes10000,100000,1000000,10000000,10000000,1000000000,1000000000,10000000000");
		for (long i = 10000; i <= 1e11; i *= 10) {
			date.setTime(i);
			System.out.println(date.toString());
			System.out.println("test");
		}
	}
}
