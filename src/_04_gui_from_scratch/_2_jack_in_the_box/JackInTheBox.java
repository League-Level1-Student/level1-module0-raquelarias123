package _04_gui_from_scratch._2_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JackInTheBox {
	JFrame frame = new JFrame();
	JButton button = new JButton("Suprise!");
	
	public void showButton() {
		System.out.println("Button clicked");
		frame.setVisible(true);
		frame.add(button);
		frame.pack();
	}

	
}
