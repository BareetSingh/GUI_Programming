package swingDemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame{
	
	//private static final long serialVersionUID = 1L;
	 JLabel l1,l2,l3,l4;
	 JTextField t1,t2;
	 JButton b1,b2,b3,b4;
	
	public Calculator() {}
	public Calculator(String s) {
		super(s);
	}
	
	
	public void setComponents() {
		l1=new JLabel("1st Number");
		l2=new JLabel("2nd Number");
		t1=new JTextField();
		t2=new JTextField();
		b1=new JButton("Add");
		b2=new JButton("Substract");
		b3=new JButton("Multiply");
		b4=new JButton("Division");
		l3=new JLabel();
		
		setLayout(null);
		l1.setBounds(20, 20, 70, 10);
		t1.setBounds(120, 20, 50, 15);
		l2.setBounds(20, 40, 70, 10);
		t2.setBounds(120, 40, 50, 15);
		
		b1.setBounds(70, 60, 80, 15);
		b2.setBounds(70, 80, 80, 15);
		b3.setBounds(70, 100, 80, 15);
		b4.setBounds(70, 120, 80, 15);
		
		l3.setBounds(20, 160, 100, 15);
		

		b1.addActionListener(new Handler());
		b2.addActionListener(new Handler());
		b3.addActionListener(new Handler());
		b4.addActionListener(new Handler());
		
		
		add(l1); add(t1);
		add(l2); add(t2);
		add(b1); add(b2); add(b3); add(b4);
		add(l3);
		//setVisible(true);
	    // ((JComponent) getContentPane()).revalidate();
	    repaint();
		
	}
	
	class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			
			if(e.getSource()==b1) {
				int result=a+b;
				l3.setText("Result is: "+result);
			}
			else if(e.getSource()==b2) {
				int result=a-b;
				l3.setText("Result is: "+result);
			}
			else if(e.getSource()==b3) {
				int result=a*b;
				l3.setText("Result is: "+result);
			}
			else { 
				float result=(float)a/(float)b;
			l3.setText("Result is: "+result);
			}
			
		}
		
	}
	public static void main(String[] args) {
		Calculator obj1=new Calculator();
		obj1.setSize(300,300);
		obj1.setVisible(true);
		obj1.setComponents();
		obj1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
