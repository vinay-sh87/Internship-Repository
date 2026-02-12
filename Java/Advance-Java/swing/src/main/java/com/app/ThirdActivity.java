package com.app;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ThirdActivity extends JFrame{
	JLabel label1,label2;
	JComboBox cmb1;
	public void initComponents() {
		label1 = new JLabel("Biggest Democratic");
		label2 = new JLabel("");
		cmb1 = new JComboBox(new String[] {"-selected country-","srilanka","china","india","america","australia","russia"});
		cmb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(cmb1.getSelectedItem().equals(e.getItem()+"")) {
					// JOptionPane.showMessageDialog(null, "The selected item:: "+cmb1.getSelectedItem());
					if(cmb1.getSelectedItem().equals("india")) {
						label1.setText("Right Answer");
					}else {
						label2.setText("Wrong Answer");
					}
				}
			}
		});
		
	JPanel p1 = new JPanel(new GridLayout(1,3,5,5));
	p1.setBorder(BorderFactory.createTitledBorder("Selection Panel"));
	p1.add(label1);
	p1.add(cmb1);
	p1.add(label2);
	this.getContentPane().add(p1);
	}
	public ThirdActivity() {
		this.initComponents();
		this.setTitle("Drop down demo");
		this.setLocation(200,200);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
	}
	public static void main(String args[]) {
		ThirdActivity obj = new ThirdActivity();
	}
}
