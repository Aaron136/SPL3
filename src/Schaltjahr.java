import javax.swing.JOptionPane;

public class Schaltjahr {

	public static void main(String[] args) {
		// Jahreingeben
		int jahr = 0;
		String year = JOptionPane.showInputDialog("Welches Jahr");
		jahr = Integer.parseInt(year);
		if(Schaltjahr(jahr)==true) {
			System.out.println(jahr + " ist ein Schaltjahr.");
		}
		
	}
	public static boolean Schaltjahr(int jahr) {
		if(jahr % 4 == 0) {
			if (jahr % 100 == 0) {
				return true;
			}
	}
		return false;}

}
