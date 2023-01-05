package AppNo1;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class fullCalc {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fullCalc window = new fullCalc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public fullCalc() {
		initialize();
	}
	
	// that all are created by me method 
	
	
	public void textAreaInsert(JTextArea textArea, int val) {
		String s =textArea.getText();
		 if(s.length()>0) {
			 
			 long digit = Long.valueOf(s);
			 long finaldigit = digit*10+(long)val;
			 textArea.setText(Long.toString(finaldigit));
			 
		 }else {
			 textArea.setText(Integer.toString(val));
		 }
	}
	public void insert(JTextArea textArea,JTextArea textArea_1,JTextArea textArea_2,int val) {
		
		
			   
			String op_String =textArea_1.getText() ;
			
			if(op_String.length()>0) {
			
				textAreaInsert(textArea_2,val);
				
			}
			else {
				textAreaInsert(textArea,val);
			}
		
			
		
		
	}
	public void result(JTextArea textArea,JTextArea op,JTextArea textArea_2) {
		int a;
		int b ;
		int result;
		if((textArea_2.getText().length()> 0)) {
				switch(op.getText()) {
				case "+":
					 a = Integer.valueOf(textArea.getText());
					 b = Integer.valueOf(textArea_2.getText());
					 result  = a+b;
					textArea.setText(Integer.toString(result));
					op.setText(null);
					textArea_2.setText(null);
					break;
				case "-":
					 a = Integer.valueOf(textArea.getText());
					 b = Integer.valueOf(textArea_2.getText());
					 result  = a-b;
					textArea.setText(Integer.toString(result));
					op.setText(null);
					textArea_2.setText(null);
					break;
				case "*":
					a = Integer.valueOf(textArea.getText());
					 b = Integer.valueOf(textArea_2.getText());
					 result  = a*b;
					textArea.setText(Integer.toString(result));
					op.setText(null);
					textArea_2.setText(null);
					break;
				case "/":
					a = Integer.valueOf(textArea.getText());
					b = Integer.valueOf(textArea_2.getText());
					 result  = a/b;
					textArea.setText(Integer.toString(result));
					op.setText(null);
					textArea_2.setText(null);
					break;
				case "%":
					a = Integer.valueOf(textArea.getText());
					b = Integer.valueOf(textArea_2.getText());
					 result  = a%b;
					textArea.setText(Integer.toString(result));
					op.setText(null);
					textArea_2.setText(null);
					break;
					
				}
		}
	}
	
	
	
	//till here
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(238, 232, 170));
		frame.setBounds(100, 100, 314, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 10, 280, 32);
		frame.getContentPane().add(textArea);
	
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 39, 280, 32);
		frame.getContentPane().add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(10, 68, 280, 32);
		frame.getContentPane().add(textArea_2);
		
		
		JButton btnNewButton = new JButton("AC");
		btnNewButton.setBackground(new Color(255, 0, 0));
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
				textArea_1.setText(null);
				textArea_2.setText(null);
			}
		});
		btnNewButton.setBounds(21, 112, 63, 54);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnC = new JButton("C");
		btnC.setBackground(new Color(240, 248, 255));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// this pending
				int length1 = textArea.getText().length();
				int length2 = textArea_1.getText().length();
				int length3 = textArea_2.getText().length();
				
				if(length3>0) {
					textArea_2.setText(null);
					
				}else if(length2>0) {
					textArea_1.setText(null);
					
				}else {
					textArea.setText(null);
					
				}
				
			}
		});
		btnC.setBounds(94, 112, 64, 54);
		frame.getContentPane().add(btnC);
		
		JButton btnNewButton_2 = new JButton("%");
		btnNewButton_2.setBackground(new Color(112, 128, 144));
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText("%");
				
				
			}
		});
		btnNewButton_2.setBounds(168, 112, 64, 54);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("/");
		btnNewButton_2_1.setBackground(new Color(112, 128, 144));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText("/");
			}
		});
		btnNewButton_2_1.setBounds(242, 112, 48, 54);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_3 = new JButton("1");
		btnNewButton_3.setBackground(new Color(112, 128, 144));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				insert(textArea,textArea_1,textArea_2,1);
				
				
			}
		});
		
		btnNewButton_3.setBounds(21, 176, 63, 46);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("2");
		btnNewButton_1_1.setBackground(new Color(112, 128, 144));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insert(textArea,textArea_1,textArea_2,2);	
			}
		});
		btnNewButton_1_1.setBounds(94, 176, 64, 46);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2_2 = new JButton("3");
		btnNewButton_2_2.setBackground(new Color(112, 128, 144));
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insert(textArea,textArea_1,textArea_2,3);
			}
		});
		btnNewButton_2_2.setBounds(168, 176, 64, 46);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_2_1_1 = new JButton("X");
		btnNewButton_2_1_1.setBackground(new Color(112, 128, 144));
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText("*");
			}
		});
		btnNewButton_2_1_1.setBounds(242, 176, 48, 46);
		frame.getContentPane().add(btnNewButton_2_1_1);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBackground(new Color(112, 128, 144));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				insert(textArea,textArea_1,textArea_2,4);
			}
		});
		btnNewButton_4.setBounds(21, 232, 63, 41);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_1_2 = new JButton("5");
		btnNewButton_1_2.setBackground(new Color(112, 128, 144));
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				insert(textArea,textArea_1,textArea_2,5);
			}
		});
		btnNewButton_1_2.setBounds(94, 232, 64, 41);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_2_3 = new JButton("6");
		btnNewButton_2_3.setBackground(new Color(112, 128, 144));
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insert(textArea,textArea_1,textArea_2,6);
			}
		});
		btnNewButton_2_3.setBounds(168, 232, 64, 41);
		frame.getContentPane().add(btnNewButton_2_3);
		
		JButton btnNewButton_2_1_2 = new JButton("-");
		btnNewButton_2_1_2.setBackground(new Color(112, 128, 144));
		btnNewButton_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText("-");
			}
		});
		btnNewButton_2_1_2.setBounds(242, 232, 48, 41);
		frame.getContentPane().add(btnNewButton_2_1_2);
		
		JButton btnNewButton_5 = new JButton("7");
		btnNewButton_5.setBackground(new Color(112, 128, 144));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insert(textArea,textArea_1,textArea_2,7);
			}
		});
		btnNewButton_5.setBounds(21, 283, 63, 43);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_1_3 = new JButton("8");
		btnNewButton_1_3.setBackground(new Color(112, 128, 144));
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insert(textArea,textArea_1,textArea_2,8);
			}
		});
		btnNewButton_1_3.setBounds(94, 283, 64, 43);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_2_4 = new JButton("9");
		btnNewButton_2_4.setBackground(new Color(112, 128, 144));
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insert(textArea,textArea_1,textArea_2,9);
			}
		});
		btnNewButton_2_4.setBounds(168, 283, 64, 43);
		frame.getContentPane().add(btnNewButton_2_4);
		
		JButton btnNewButton_2_1_3 = new JButton("+");
		btnNewButton_2_1_3.setBackground(new Color(112, 128, 144));
		btnNewButton_2_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText("+");
			}
		});
		btnNewButton_2_1_3.setBounds(242, 283, 48, 43);
		frame.getContentPane().add(btnNewButton_2_1_3);
		
		JButton btnNewButton_6 = new JButton("00");
		btnNewButton_6.setBackground(new Color(112, 128, 144));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 1 ;i<=2;i++) {
					insert(textArea,textArea_1,textArea_2,0);
				}
			}
		});
		btnNewButton_6.setBounds(21, 336, 63, 36);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_1_4 = new JButton("0");
		btnNewButton_1_4.setBackground(new Color(112, 128, 144));
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insert(textArea,textArea_1,textArea_2,0);
			}
		});
		btnNewButton_1_4.setBounds(94, 336, 64, 36);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_2_5 = new JButton(".");
		btnNewButton_2_5.setBackground(new Color(112, 128, 144));
		btnNewButton_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String op_String =textArea_1.getText() ;
				if(op_String.length()>0) {
					String s =textArea_2.getText();
					 if(s.length()>0) {
						 
						 String finaldigit = s+".";
						 textArea_2.setText(finaldigit);
						 
					 }else {
						 textArea_2.setText(".");
					 }
				}
				else {
					String s =textArea.getText();
					 if(s.length()>0) {
						 
						 String finaldigit = s+".";
						 textArea.setText(finaldigit);
						 
					 }else {
						 textArea.setText(".");
					 }
				}
			}
			
		});
		btnNewButton_2_5.setBounds(168, 336, 64, 36);
		frame.getContentPane().add(btnNewButton_2_5);
		
		JButton btnNewButton_2_1_4 = new JButton("=");
		btnNewButton_2_1_4.setBackground(new Color(34, 139, 34));
		btnNewButton_2_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result(textArea,textArea_1,textArea_2);
				
			}
		});
		btnNewButton_2_1_4.setBounds(242, 336, 48, 36);
		frame.getContentPane().add(btnNewButton_2_1_4);
		
		
	}
}
