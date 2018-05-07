import javax.swing.JOptionPane;

public class Wörterraten {

	public static void main(String[] args) {
		Woerterraten("");

	}
	public static String Woerterraten(String Wort) {
		Wort = JOptionPane.showInputDialog("Bitte ein Wort eingeben.");
		char[]wortbuchstaben = Wort.toCharArray();
		JOptionPane.showMessageDialog(null, "Das Wort hat "+wortbuchstaben.length+" Buchstaben");
		boolean erraten = false;
		while (erraten == false) {
			String raten = JOptionPane.showInputDialog("Welcher Buchstabe?");
			
		}
		return Wort;
		
	}
}
