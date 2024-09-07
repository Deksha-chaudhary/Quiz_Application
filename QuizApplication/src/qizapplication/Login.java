package qizapplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	JButton rules,back;
	JTextField tfname;
	Login(){
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/login.jpeg"));
		JLabel image=new JLabel(i1);
		image.setBounds(0,0,600,500);
		add(image);
		
		JLabel heading=new JLabel("simple minds");
		heading.setBounds(720,60,300,45);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
		heading.setForeground(new Color(30,144,254));
		add(heading);
		
		JLabel name=new JLabel("Enter Your Name");
		name.setBounds(750,150,300,20);
		name.setFont(new Font("mogolion Baiti",Font.BOLD,18));
		name.setForeground(new Color(30,144,254));
		add(name);
		
		tfname=new JTextField();
		tfname.setBounds(700,200,280,30);
		tfname.setFont(new Font("times new romen",Font.BOLD,18));
		add(tfname);
		
		 rules=new JButton("Rules");
		rules.setBounds(720,270,90,25);
		rules.setFont(new Font("mogolion Baiti",Font.BOLD,13));
		rules.setForeground(Color.white);
		rules.setBackground(new Color(30,144,254));
		rules.addActionListener(this);
		add(rules);
		
		back=new JButton("Back");
		back.setBounds(870,270,90,25);
		back.setFont(new Font("mogolion Baiti",Font.BOLD,13));
		back.setForeground(Color.white);
		back.setBackground(new Color(30,144,254));
		back.addActionListener(this);
		add(back);
		
		setSize(1000,500);
		setLocation(200,150);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new Login();

	}


	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==rules) {
			setVisible(false);
	String name=tfname.getText();
	new Rules(name);
		}
		else if(ae.getSource()==back) {
			setVisible(false);
		}
		
	}

}
