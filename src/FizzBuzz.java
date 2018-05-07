
public class FizzBuzz {

	public static void main(String[] args) {
//		for (int i = 1; i <= 100; i++) {
//			FizzerBuzzer(i); // bei 4: fizzer, bei 7: buzzer
//		}
//		
		for (int n = 0; n <= 100; n+=4) {
			FizzerBuzzer(n, false);
		}
		System.out.println("ende!");
	}
	
	public static void FizzerBuzzer(int i, boolean showFizzBuzz) {
		if (i % 4 == 0 && i % 7 == 0 && showFizzBuzz == true) {
			System.out.print("FizzerBuzzer ");
		} else if (i % 4 == 0) {
			System.out.print("Fizzer ("+i+")");
		} else if (i % 7 == 0) {
			System.out.print("Buzzer");
		} else {
			System.out.print(i);

		}
		System.out.println();
	}

}
