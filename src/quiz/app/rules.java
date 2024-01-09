package Quiz.App;
import javax.swing.*;				// Importing this for JFrame Class
import java.awt.*;				// Importing this for Color
import java.awt.event.*;			// Importing this for Button Action

public class rules extends JFrame implements ActionListener
{
	String name;	
	JButton javaQuiz, back,GKQuiz,Politics;

	rules(String name)
	{	
		this.name = name;
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);

		JLabel heading = new JLabel("Welcome " + name + " to the World of Mind Games");
		heading.setBounds(50, 20, 700, 30);
		heading.setFont(new Font("Mangolian Baiti", Font.BOLD, 28));
		heading.setForeground(new Color(30, 144, 254));
		add(heading);

		JLabel rules = new JLabel();
		rules.setBounds(20, 90, 700, 350);
		rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rules.setText(
                "<html>"+ 
                "1. Before Starting the Quiz, User must well prepare regarding test." + "<br><br>" +
                "2. Once user will begin the Quiz, he/she may have to provide his/her name." + "<br><br>" +
                "3. After Entering your name, Read the rules & regulatiion properly." + "<br><br>" +
                "4. Once user click on Start button, user must attempt all question." + "<br><br>" +
                "5. If user stuck anywhere, then user have 50-50 lifeline to answer that particular question." + "<br><br>" +
                "6. Only one time user have option for 50-50 lifeline." + "<br><br>" +
                "7. After attempting all question, in the end user will be able to see his/her score." + "<br><br>" +
                "8. Wish you all the very best." + "<br><br>" +
                "<html>"
		);		

		add(rules);

               JLabel type = new JLabel("Chooes the Quiz");
		type.setBounds(290,420, 150, 50);
		type.setFont(new Font("Mangolian Baiti", Font.BOLD, 18));
		type.setForeground(new Color(30, 144, 254));
		add(type);


		back = new JButton("Back");
		back.setBounds(100, 500, 100, 30);
		back.setBackground(new Color(30, 144, 254));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);


		javaQuiz = new JButton("Java Quiz");
		javaQuiz.setBounds(400, 500, 100, 30);
		javaQuiz.setBackground(new Color(30, 144, 254));
		javaQuiz.setForeground(Color.WHITE);
		javaQuiz.addActionListener(this);
		add(javaQuiz);

                GKQuiz = new JButton("GK Quiz");
		GKQuiz.setBounds(550, 500, 100, 30);
		GKQuiz.setBackground(new Color(30, 144, 254));
		GKQuiz.setForeground(Color.WHITE);
		GKQuiz.addActionListener(this);
		add(GKQuiz);

                Politics= new JButton("Poilitics");
		Politics.setBounds(250, 500, 100, 30);
		Politics.setBackground(new Color(30, 144, 254));
		Politics.setForeground(Color.WHITE);
		Politics.addActionListener(this);
		add(Politics);

		setSize(800,650);
		setLocation(350, 100);
		setVisible(true);
	}
		
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == javaQuiz)
		{
			String name = javaQuiz.getText();
			setVisible(false);
			new quiz(name);
		} 
                else if(ae.getSource() == GKQuiz)
		{
			String name = GKQuiz.getText();
			setVisible(false);
			new GKQuiz(name);
		} 
                else if(ae.getSource() == Politics)
		{
			String name = Politics.getText();
			setVisible(false);
			new Politics(name);
		}
		else 
		{
			setVisible(false);
			new login();	
		}
	}

          

	public static void main(String[] args)
	{
		new rules("User");
	}


}