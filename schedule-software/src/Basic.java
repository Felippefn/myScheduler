import javax.swing.*;
import java.awt.*;

public class Basic {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My First GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400); // size of screen
		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("FILE");
		JMenu m2 = new JMenu("Help");
		mb.add(m1);
		mb.add(m2);
		JMenuItem m11= new JMenuItem("Open");
		JMenuItem m22 = new JMenuItem("Save as");
		m1.add(m11);
		m2.add(m22);

		//Creating the panel at bottom and adding components
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Enter Text:");
		JTextField tf = new JTextField(10); //accepts upto 10 charc
		JButton send = new JButton("Send");
		JButton reset = new JButton("Reset");
		panel.add(label);
		panel.add(tf);
		panel.add(send);
		panel.add(reset);
		
		//Text Area at the center
		JTextArea ta = new JTextArea();
		
		frame.getContentPane().add(BorderLayout.SOUTH, panel);
		frame.getContentPane().add(BorderLayout.NORTH, mb); //Adds button to content pane of frame
		frame.getContentPane().add(BorderLayout.CENTER, ta);
		frame.setVisible(true);
	}

}
