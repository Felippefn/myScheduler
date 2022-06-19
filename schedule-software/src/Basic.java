import javax.swing.*;
import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

public class Basic {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My First GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 300); // size of screen
		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("FILE");
		JMenu m2 = new JMenu("Help");
		mb.add(m1);
		mb.add(m2);
		JMenuItem m11 = new JMenuItem("Open");
		JMenuItem m22 = new JMenuItem("Save as");
		m1.add(m11);
		m2.add(m22);

		// Creating the panel at bottom and adding components
		JPanel panel = new JPanel();
		JLabel subject = new JLabel("Enter the subject:");
		JLabel timeStudied = new JLabel("Enter the time:");
		JTextField tf = new JTextField(10); // accepts upto 10 charc
		JTextField tf2 = new JTextField(10);
		JButton send = new JButton("Send");
		JButton reset = new JButton("Reset");
		panel.add(subject);
		panel.add(tf);
		panel.add(timeStudied);
		panel.add(tf2);
		panel.add(send);
		panel.add(reset);

		// send.addActionListener(new ActionListener() {
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// JOptionPane.showInputDialog(this, tf.getText());
		// }
		// });

		send.addActionListener(e -> {
			System.out.println(TimeLogFunctions.getCurrentData());
			System.out.println(TimeLogFunctions.getWeekDayString());
			System.out.println(CreatePayload.returnCorrectPayload(TimeLogFunctions.getCurrentData(), TimeLogFunctions.getWeekDayString()
			, tf.getText(), tf2.getText()));
		});
		// Text Area at the center
		// JTextArea ta = new JTextArea();

		frame.getContentPane().add(BorderLayout.SOUTH, panel);
		frame.getContentPane().add(BorderLayout.NORTH, mb); // Adds button to content pane of frame
		// frame.getContentPane().add(BorderLayout.CENTER, ta);
		frame.setVisible(true);
	}

}
