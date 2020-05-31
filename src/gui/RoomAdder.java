package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class RoomAdder extends JFrame {
	
	public RoomAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelNUM =new JLabel("Room Number: ",JLabel.TRAILING);
		JTextField fieldNUM = new JTextField(10);
		labelNUM.setLabelFor(fieldNUM);
		panel.add(labelNUM);
		panel.add(fieldNUM);
		
		JLabel labelMoney =new JLabel("Money: ",JLabel.TRAILING);
		JTextField fieldMoney = new JTextField(10);
		labelMoney.setLabelFor(fieldMoney);
		panel.add(labelMoney);
		panel.add(fieldMoney);
		
		JLabel labelPayMethod =new JLabel("Pay Method: ",JLabel.TRAILING);
		JTextField fieldPayMethod = new JTextField(10);
		labelPayMethod.setLabelFor(fieldPayMethod);
		panel.add(labelPayMethod);
		panel.add(fieldPayMethod);
		
		JLabel labelRequirements =new JLabel("Requirements: ",JLabel.TRAILING);
		JTextField fieldRequirements = new JTextField(10);
		labelRequirements.setLabelFor(fieldRequirements);
		panel.add(labelRequirements);
		panel.add(fieldRequirements);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
