import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		String cow = JOptionPane.showInputDialog("What is your name, little boy?");
		JOptionPane.showMessageDialog(null, "Hi, " + cow);
	}
}
