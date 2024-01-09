package Quiz.App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Politics extends JFrame implements ActionListener {
    
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;
    
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    String name;
    
    Politics(String name) {
        this.name = name;
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1440, 392);
        add(image);
        
        qno = new JLabel();
        qno.setBounds(100, 450, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);
        
        question = new JLabel();
        question.setBounds(150, 450, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);
        
        questions[0][0] = "By whom is the budget passed first??";
        questions[0][1] = "Rajyasabha";
        questions[0][2] = "Loksabha";
        questions[0][3] = "Both A&B";
        questions[0][4] = "None of these";

        questions[1][0] = "Central Goverment Uses ?";
        questions[1][1] = "Rajyasabha";
        questions[1][2] = "Loksabha";
        questions[1][3] = "President";
        questions[1][4] = "Both A&B";

        questions[2][0] = "Who appoints the provisional Speaker of Lok Sabha?";
        questions[2][1] = "Chief Minister";
        questions[2][2] = "Prime Minister";
        questions[2][3] = "President";
        questions[2][4] = "Home Minister";

        questions[3][0] = "In which house the no-confidence motion is brought?";
        questions[3][1] = "Rajyasabha";
        questions[3][2] = "Loksabha";
        questions[3][3] = "Assembly";
        questions[3][4] = "None of these";

        questions[4][0] = " How many times the same person can be made the President of India?";
        questions[4][1] = "many times";
        questions[4][2] = "twice";
        questions[4][3] = "three times";
        questions[4][4] = "None of the above";

        questions[5][0] = "Which veto power does the President of India have?";
        questions[5][1] = "Suspended Prohibition";
        questions[5][2] = " Complete prohibition";
        questions[5][3] = "Pocket";
        questions[5][4] = "All these";

        questions[6][0] = " Parliament is not included in?";
        questions[6][1] = "Rajyasabha";
        questions[6][2] = "Loksabha";
        questions[6][3] = "Chief Election Commisioner";
        questions[6][4] = "President";

        questions[7][0] = "Total number of High Courts in India is?";
        questions[7][1] = "24";
        questions[7][2] = "34";
        questions[7][3] = "20";
        questions[7][4] = "35";

        questions[8][0] = "Where is the Election Commission located?";
        questions[8][1] = "Mumbai";
        questions[8][2] = "Kashmir";
        questions[8][3] = "New Delhi";
        questions[8][4] = "Pune";

        questions[9][0] = "Who is the first Woman Chief Minister in India?";
        questions[9][1] = "Draupadi Murmu";
        questions[9][2] = "Nirmala Sitaraman";
        questions[9][3] = "Sucheta Kriplani";
        questions[9][4] = "Sushma Swaraj";
        
        answers[0][1] = "Loksabha";
        answers[1][1] = "Both A&B";
        answers[2][1] = "President";
        answers[3][1] = "Loksabha";
        answers[4][1] = "many times";
        answers[5][1] = "All these";
        answers[6][1] = "Chief Election Commisioner";
        answers[7][1] = "24";
        answers[8][1] = "New Delhi";
        answers[9][1] = "Sucheta Kriplani";
        
        opt1 = new JRadioButton();
        opt1.setBounds(170, 520, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(170, 560, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(170, 600, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(170, 640, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(1100, 490, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
//        lifeline = new JButton("50-50 Lifeline");
//        lifeline.setBounds(1100, 630, 200, 40);
//        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
//        lifeline.setBackground(new Color(30, 144, 255));
//        lifeline.setForeground(Color.WHITE);
//        lifeline.addActionListener(this);
//        add(lifeline);
        
        submit = new JButton("Submit");
        submit.setBounds(1100, 550, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new score(name, score);
        }
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if (timer > 0) { 
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Times up!!", 1100, 500);
        }
        
        timer--; // 14
        
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                
                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new score(name, score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }
        
    }
    
    public void start(int count) {
        
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupoptions.clearSelection();
    }
    
    public static void main(String[] args) {
        new quiz("User");
    }
}
