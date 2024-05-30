package recapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = { 1.2, 1.3, 4.3, 5.6 };
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			total = total + number;
			if (max < number) {
				max = number;
			}
			System.out.println(number);
		}
		System.out.println("Toplam = " + total);
		System.out.println("En Büyük = " + max);
	}

}
