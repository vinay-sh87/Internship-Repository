package com.app;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioActivity extends JFrame{
	JRadioButton rdb1, rdb2;
	JLabel label1, label2;
	ButtonGroup bgroup;
	public void initComponents() {
		bgroup = new ButtonGroup();
		label1 = new JLabel("Capital of India");
		label2 = new JLabel("");
		rdb1 = new JRadioButton("Lucknow");
		rdb1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(rdb1.isSelected())
					label2.setText("Wrong Answer");
			}
		});
		rdb2 = new JRadioButton("Delhi");
		rdb2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(rdb2.isSelected())
					label2.setText("Right Answer");
			}
		});
		bgroup.add(rdb1);
		bgroup.add(rdb2);
		
		JPanel p1 = new JPanel(new GridLayout(1,4,5,5));
		p1.setBorder(BorderFactory.createTitledBorder("Capital Panel"));
		p1.add(label1);
		p1.add(rdb1);
		p1.add(rdb2);
		p1.add(label2);
		this.getContentPane().add(p1);
	}
	public RadioActivity() {
		this.initComponents();
		this.setTitle("My Window");
		this.setLocation(200,200);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();		
	}
	public static void main(String args[]) {
		RadioActivity obj = new RadioActivity();
	}
}
