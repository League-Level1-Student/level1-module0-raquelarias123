package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton("Click");

	public void showButton() {
		System.out.println("Button clicked");
		frame.setVisible(true);
		frame.add(button);
		button.addActionListener(this);
		frame.pack();
	}

	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null,"Woohoo");
		
		int rand = new Random().nextInt(5);
		
		if(rand==0) {
			JOptionPane.showMessageDialog(null,"Be patient: in time, even an egg will walk");
		}else if(rand==1) {
			JOptionPane.showMessageDialog(null, "Enjoy Life: This is not a dress rehearsal");
		}else if(rand==2) {
			JOptionPane.showMessageDialog(null, "While you're carrying a grudge others are out dancing");
		}else if(rand==3) {
			JOptionPane.showMessageDialog(null, "Do or do not. There is no try.");
		}else if(rand==4) {
			JOptionPane.showMessageDialog(null, "Trust your intuition. The universe is guiding your life.");
		}

		
	}
	

}