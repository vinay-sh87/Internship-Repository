package com.app;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ProjectActivity extends JFrame {

	JLabel label1, label2, label3, label4;
	JTextField text1, text2, text3, text4;
	JTable table1;
	JButton button1, button2, button3, button4;
	DefaultTableModel model;

	Connection cn;

	public void initComponents() {
		label1 = new JLabel("CODE");
		label1.setHorizontalAlignment(JLabel.CENTER);
		label2 = new JLabel("NAME");
		label2.setHorizontalAlignment(JLabel.CENTER);  
		label3 = new JLabel("SALARY");
		label3.setHorizontalAlignment(JLabel.CENTER);

		label4 = new JLabel("Search By Name");

		model = new DefaultTableModel();
		model.addColumn("Code");
		model.addColumn("Name");
		model.addColumn("Salary");

		table1 = new JTable(model);
		table1.setPreferredScrollableViewportSize(new Dimension(450, 250));

		button1 = new JButton("Insert");
		button2 = new JButton("Update");
		button3 = new JButton("Delete");
		button4 = new JButton("Report");

		text1 = new JTextField(20);
		text1.setEditable(false);
		text2 = new JTextField(20);
		text3 = new JTextField(20);
		text4 = new JTextField(20);

		JPanel p1 = new JPanel(new GridLayout(3, 3, 5, 5));
		p1.setBorder(BorderFactory.createTitledBorder("Operation Panel"));
		p1.add(label1);
		p1.add(label2);
		p1.add(label3);

		p1.add(text1);
		p1.add(text2);
		p1.add(text3);

		p1.add(button1);
		p1.add(button2);
		p1.add(button3);

		JPanel p2 = new JPanel(new GridLayout(1, 1, 5, 5));
		p2.setBorder(BorderFactory.createTitledBorder("Display Panel"));
		p2.add(new JScrollPane(table1));

		JPanel p3 = new JPanel(new GridLayout(1, 3, 5, 5));
		p3.setBorder(BorderFactory.createTitledBorder("Report Panel"));
		p3.add(label4);
		p3.add(text4);
		p3.add(button4);

		this.getContentPane().add(BorderLayout.NORTH, p1);
		this.getContentPane().add(BorderLayout.CENTER, p2);
		this.getContentPane().add(BorderLayout.SOUTH, p3);
	}

	public void initEvent() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				openConnection();
				showRecords("select * from employee");
			}

			@Override
			public void windowClosing(WindowEvent e) {
				closeConnection();
			}
		});
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				insertEmmployee();
			}
		});
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				updateEmployee();
			}
		});
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteEmployee();
				
			}
		});
		table1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table1.getSelectedRow();
				String code = table1.getValueAt(row, 0).toString();
				String name = table1.getValueAt(row, 1).toString();
				String salary = table1.getValueAt(row, 2).toString();
				text1.setText(code);
				text2.setText(name);
				text3.setText(salary);
				
			}
		});
		text4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String name = text4.getText().trim();
				String sql = "select * from employee where name like '%"+name+"%'";
				showRecords(sql);
			}
		});
		button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				reportGeneration("select * from employee");
				
			}
		});
	}

	public void showRecords(String sql) {
		try {
			PreparedStatement ps = cn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			Vector colnames = new Vector();
			Vector records = new Vector();
			for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
				colnames.add(rs.getMetaData().getColumnLabel(i));
			}
			while (rs.next()) {
				Vector temp = new Vector();
				for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
					temp.add(rs.getString(i));
				}
				records.add(temp);
			}
			model.setDataVector(records, colnames);
			table1.setModel(model);
			table1.setRowHeight(20);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Failed to retrieve records");
		}
	}
	public void insertEmmployee() {
		try {
			String name = text2.getText();
			double salary = Double.parseDouble(text3.getText());
			
			PreparedStatement ps = cn.prepareStatement("insert into employee(name,salary) values(?,?)");
			ps.setString(1, name);
			ps.setDouble(2, salary);
			int a = ps.executeUpdate();
			if(a>0) {
				showRecords("select * from employee");
				text2.setText("");
				text2.setText("");
			}
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Reason of the error : "+e.getMessage());
		}
	}
	public void updateEmployee() {
		try {
			int code = Integer.parseInt(text1.getText());
			String name = text2.getText();
			double salary = Double.parseDouble(text3.getText());
			PreparedStatement ps = cn.prepareStatement("update employee set name = ?, salary = ? where code = ?");
			ps.setString(1,name);
			ps.setDouble(2, salary);
			ps.setInt(3, code);
			int a = ps.executeUpdate();
			if(a>0) {
				showRecords("select * from employee");
			}
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Reason of the error: "+e.getMessage());
		}
	}
	public void deleteEmployee() {
		try {
			int code = Integer.parseInt(text1.getText());
			PreparedStatement ps = cn.prepareStatement("delete from employee where code = ?");
			ps.setInt(1, code);
			int a = ps.executeUpdate();
			if(a>0) {
				showRecords("select * from employee");
			}
	
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Reason of the error: "+e.getMessage());
		}
	}
	public void reportGeneration(String sql) {
		try {
			PreparedStatement ps = cn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			String str = "";
			str+="<html>";
				str+="<body>";
					str+="<table cellpaddig=10 width=70%  align=center>";
						str+="<tr bgcolor=black>";
							for(int i=1;i<=rs.getMetaData().getColumnCount();i++) {
								str+="<th><font color=white >"+rs.getMetaData().getColumnName(i)+"<font></th>";
							}
						str+="</tr>";
					while(rs.next()) {
						str+="<tr>";
							for(int i=1;i<=rs.getMetaData().getColumnCount();i++) {
								str+="<td>"+rs.getString(i)+"</td>";
							}
						str+="</tr>";
					}
					str+="</table>";
				str+="</body>";
			str+="</html>";
			
		File file = new File("report.html");
		file.createNewFile();
		
		OutputStream ous = new FileOutputStream(file);
		ous.write(str.getBytes());
		ous.close();
		file.deleteOnExit();
		
		Runtime r = Runtime.getRuntime();
		
		Process p = r.exec("C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe "+file.getAbsolutePath());
		
					
		}catch (Exception e) {
			JOptionPane.showInternalMessageDialog(null, "Reason of the error: "+e.getMessage());
		}
	}

	public void openConnection() {
		try {
			cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mlk?autoReconnect=true&useSSL=false", "root",
					"vinay@0011");
			if (!cn.isClosed()) {
				System.out.println("Database Connected");
			}
		} catch (SQLException e) {
			throw new RuntimeException("error occured", e);
		}
	}

	public void closeConnection() {
		try {

			if (!cn.isClosed()) {
				cn.close();
			}
		} catch (SQLException e) {
			throw new RuntimeException("error occured", e);
		}
	}

	public ProjectActivity() {
		this.initComponents();
		this.initEvent();
		this.setTitle("Table Project");
		this.setResizable(false);
		this.setLocation(200, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
	}

	public static void main(String args[]) {
		ProjectActivity obj = new ProjectActivity();
	}
}
