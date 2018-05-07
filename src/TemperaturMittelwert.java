
public class TemperaturMittelwert {

	public static void main(String[] args) {
		int[] temp = new int[1000];
		//0 bis 40
		for(int i = 0; i < temp.length; i++) {
			temp[i] = (int) (Math.random()*40);
			System.out.println(temp[i]);
		}

	}
}
