import javax.swing.JOptionPane;

public class SecretMessageBox {
	public static void main(String[] args) {
String password = "cow";
String message = JOptionPane.showInputDialog("What's your secret message?");
String altpassword = JOptionPane.showInputDialog("Whats the password?");
if (altpassword.equals(password)) {
	JOptionPane.showMessageDialog(null, message);
} else {
	JOptionPane.showMessageDialog(null, "INTRUDER!!!");
}
	}
}
