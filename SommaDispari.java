
public class SommaDispari {

	public static boolean isOdd(int number) {

		if (number < 0) {
			return false;
		}

		if ((number % 2) != 0) {
			return true;

		}

		return false;
	}

	public static int sumOdd(int start, int end) {

		int i = 0, sum = 0;

		if (start > 0 && end > 0) {

			for (i = start; i <= end; i++) {

				if (isOdd(i)) {
					sum = sum + i;
				}
			}

			return sum;
		}

		return -1;
	}

}
