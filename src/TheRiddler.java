import javax.swing.JOptionPane;

public class TheRiddler {
	public static void main(String[] args) {
String score = "0";
String theiranswer = JOptionPane.showInputDialog("I am taken from a mine, and shut up in a wooden case, from which I am never released, and yet I am used by almost everybody. What am I?");
if (theiranswer.equalsIgnoreCase("Pencil Lead")) {
	JOptionPane.showMessageDialog(null, "Correct!!");
	score+=1;
} else {
	JOptionPane.showMessageDialog(null, "WRONG");
	JOptionPane.showMessageDialog(null, "The correct answer was... pencil lead");
}
String theiranswer2 = JOptionPane.showInputDialog("A prisoner is told 'If you tell a lie we will hang you; if you tell the truth we will shoot you.' What can he say to save himself?");
if (theiranswer2.equalsIgnoreCase("You will hang me")) {
	JOptionPane.showMessageDialog(null, "Correct!!");
	score+=1;
} else {
	JOptionPane.showMessageDialog(null, "WRONG");
	JOptionPane.showMessageDialog(null, "The correct answer was... You will hang me.");
}
String theiranswer3 = JOptionPane.showInputDialog("What 8 letter word can have a letter taken away and it still makes a word. Take another letter away and it still makes a word. Keep on doing that until you have one letter left. What is the word?");
if (theiranswer3.equalsIgnoreCase("Starting")) {
	JOptionPane.showMessageDialog(null, "Correct!!");
	score+=1;
} else {
	JOptionPane.showMessageDialog(null, "WRONG");
	JOptionPane.showMessageDialog(null, "The correct answer was... starting");
}
JOptionPane.showMessageDialog(null, "Your score was "+ score);
	}
	
}
