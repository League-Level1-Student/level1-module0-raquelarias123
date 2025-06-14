package _04_gui_from_scratch._3_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	
public SoundEffectsMachine() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button1.setText("1");
	button2.setText("2");
	button3.setText("3");
	frame.pack();
}

private void playSound(String soundFile) {
    try {
         AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
         sound.play();
    } catch (Exception e) {
         e.printStackTrace();
    }
}


@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if(arg0.getSource()==button1) {
		playSound("random.wav");
		
	}else if(arg0.getSource()==button2) {
		playSound("random (1).wav");
		
	}else if(arg0.getSource()==button3) {
		playSound("random (2).wav");
	}
	
}

}
