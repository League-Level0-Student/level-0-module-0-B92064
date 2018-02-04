import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String date = "2/3/18";
		String cow = JOptionPane.showInputDialog("What is your birthday?");
		if (date.equals(cow)) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!!!");
		} else {
			JOptionPane.showMessageDialog(null, "Merry Unbirthday!!!");
		}
	}
}
