
public class TemperaturMittelwert {

	public static void main(String[] args) {
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println(getTemperaturWerte(temp[], i));
		}
	}

	public static void getTemperaturWerte(int[] temp, int i) {
		// 0 bis 40
		for (i = 0; i < temp.length; i++) {
			temp[i] = (int) (Math.random() * 40);
			System.out.println(temp[i]);
		}

		// # Temperaturwerte < 10 Grad
		int unter10Grad = 0;
		for (i = 0; i < temp.length; i++) {
			if (i <= 10) {
				unter10Grad++;
			}
		}
		System.out.println(unter10Grad + " Werte < 10 Grad.");

		// # Temperaturwerte >= 10 < 20 Grad
		int zwischen1020 = 0;
		for (i = 0; i < temp.length; i++) {
			if (temp[i] >= 10 && temp[i] < 20) {
				zwischen1020++;
			}
		}
		System.out.println(unter10Grad + " Werte > 10 und < 20 Grad.");

		// # Temperaturwerte >=20 Grad
		int über20 = 0;
		for (i = 0; i < temp.length; i++) {
			if (temp[i] >= 20) {
				über20++;
			}
		}
	}
}
