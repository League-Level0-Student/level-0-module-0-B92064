import javax.swing.JOptionPane;

public class EverythingIsAwesome {

	public static void main(String[] args) {
		String cow = JOptionPane.showInputDialog("What do you like?");
		JOptionPane.showMessageDialog(null, cow + " is pretty awesome!!!");
	}
}
