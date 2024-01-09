package Quiz.App;
import javax.swing.*; 				// importing this for JFrame class
import java.awt.*;				//importing this for colors
import java.awt.event.*;			//importing this for onclick events


public class login extends JFrame implements ActionListener
{
	JButton rules, back;		// Declaring Globally
	JTextField tfname;
	
	login()
    	{
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
	

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
		JLabel image =  new JLabel(i1);
		image.setBounds(0, 0, 600, 500);
		add(image);
		

		JLabel heading = new JLabel("Mind Game");
		heading.setBounds(750, 60, 300, 45);
		heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
		heading.setForeground(new Color(30, 144, 254));
		add(heading);

		JLabel name = new JLabel("Enter your name");
		name.setBounds(810, 150, 300, 20);
		name.setFont(new Font("Mangolian Baiti", Font.BOLD, 18));
		name.setForeground(new Color(30, 144, 254));
		add(name);


		tfname = new JTextField();
		tfname.setBounds(735, 200, 300, 25);
		tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
		add(tfname);		
		
		rules = new JButton("Rules");
		rules.setBounds(735, 270, 120, 25);
		rules.setBackground(new Color(30, 144, 254));
		rules.setForeground(Color.WHITE);
		rules.addActionListener(this);
		add(rules);

		back = new JButton("Back");
		back.setBounds(915, 270, 120, 25);
		back.setBackground(new Color(30, 144, 254));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);



		setSize(1200,500);
		setLocation(200,150);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == rules)
		{
			String name = tfname.getText();
			setVisible(false);
			new rules(name);
		}
		else if (ae. getSource() == back)
		{
			setVisible(false);
		}
	}


	public static void main (String[] args)
	{
		new login();
	}
}