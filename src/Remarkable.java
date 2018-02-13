import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
String cow = JOptionPane.showInputDialog("Whats your name?");
if (cow.equalsIgnoreCase("Max"))
{
	JOptionPane.showMessageDialog(null, "Cool!");
} else if (cow.equalsIgnoreCase("Chloe")) {
	JOptionPane.showMessageDialog(null, "Nice Name!!");
} else if (cow.equalsIgnoreCase("Maira")) {
	JOptionPane.showMessageDialog(null, "Awesome!!");
}

	}
}
