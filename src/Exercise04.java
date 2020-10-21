import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.BorderLayout.*;


public class Exercise04 implements ActionListener {



    // Declare the components

    JPanel windowContent;
    JTextField displayField;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonPoint;
    JButton buttonEqual ;
    JButton buttonNegate;
    JButton buttonClear;
    JButton buttonX;
    JButton buttonSquare;
    JButton buttonAdd;
    JButton buttonMultip;
    JButton buttonDivide;
    JPanel p1;
    JButton buttonMS;
    JButton buttonMR;
    JButton buttonMplus;
    JButton buttonMC;
    static double a=0,b=0,result=0;
    static int operator=0;
    double new_value, mem_value;


    Exercise04() {

        windowContent = new JPanel();

        // Set the layout manager for this panel
        BoxLayout b1 = new BoxLayout(windowContent,BoxLayout.Y_AXIS);


        windowContent.setLayout(b1);


        // Create the display field and place it in the North area of the window
        displayField = new JTextField(30);
        windowContent.add(NORTH,displayField);
        windowContent.add(Box.createRigidArea(new Dimension(0,10)));
        windowContent.setBorder(new EmptyBorder(new Insets(10,0,0,0)));



        // Create buttons using constructor of the class JButton that takes
        // the label of the button as a parameter

        p1 = new JPanel();
        GridLayout g1 = new GridLayout(6,4);
        p1.setLayout(g1);

        buttonX = new JButton("del");
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");
        buttonNegate = new JButton("-");
        buttonAdd = new JButton("+");
        buttonMultip = new JButton("x");
        buttonDivide = new JButton("/");
        buttonClear = new JButton("Clear");
        buttonSquare = new JButton("sqrt");
        buttonMS = new JButton("MS");
        buttonMR = new JButton("MR");
        buttonMplus = new JButton("M+");
        buttonMC = new JButton("MC");



        // Create the panel with the GridLayout with required buttons



        // Add window controls to the panel p1
        p1.add(buttonMS);
        p1.add(buttonMR);
        p1.add(buttonMplus);
        p1.add(buttonMC);
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(buttonAdd);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(buttonNegate);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(buttonMultip);
        p1.add(button0);
        p1.add(buttonX);
        p1.add(buttonPoint);
        p1.add(buttonDivide);
        p1.add(buttonClear);
        p1.add(buttonEqual);


        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonNegate.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonMultip.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonPoint.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonX.addActionListener(this);
        buttonMS.addActionListener(this);
        buttonMR.addActionListener(this);
        buttonMplus.addActionListener(this);
        buttonMC.addActionListener(this);



        // Add the panel p1 to the center of the window
        windowContent.add("Center",p1);

        // Create the frame and set its content pane
        JFrame frame = new JFrame("Exercise04");
        //frame.setSize(400,600);
        frame.setContentPane(windowContent);

        // Set the size of the window big enough to accomodate all controls
        frame.pack();
        // Display the window
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1)
            displayField.setText(displayField.getText().concat("1"));

        if(e.getSource()==button2)
            displayField.setText(displayField.getText().concat("2"));

        if(e.getSource()==button3)
            displayField.setText(displayField.getText().concat("3"));

        if(e.getSource()==button4)
            displayField.setText(displayField.getText().concat("4"));

        if(e.getSource()==button5)
            displayField.setText(displayField.getText().concat("5"));

        if(e.getSource()==button6)
            displayField.setText(displayField.getText().concat("6"));

        if(e.getSource()==button7)
            displayField.setText(displayField.getText().concat("7"));

        if(e.getSource()==button8)
            displayField.setText(displayField.getText().concat("8"));

        if(e.getSource()==button9)
            displayField.setText(displayField.getText().concat("9"));

        if(e.getSource()==button0)
            displayField.setText(displayField.getText().concat("0"));

        if(e.getSource()==buttonPoint)
            displayField.setText(displayField.getText().concat("."));
        if(e.getSource()==buttonAdd)
        {
            a=Double.parseDouble(displayField.getText());
            operator=1;
            displayField.setText("");
        }
        if(e.getSource()==buttonNegate)
        {
            a=Double.parseDouble(displayField.getText());
            operator=2;
            displayField.setText("");
        }

        if(e.getSource()==buttonMultip)
        {
            a=Double.parseDouble(displayField.getText());
            operator=3;
            displayField.setText("");
        }

        if(e.getSource()==buttonDivide)
        {
            a=Double.parseDouble(displayField.getText());
            operator=4;
            displayField.setText("");
        }
        if (e.getSource()==("MS"))
            mem_value=new_value;
        if (e.getSource()==("MR")) // memory retreive button clicked
            new_value=mem_value;
        if (e.getSource()==("M+")) // memory addition button clicked
            mem_value=mem_value+new_value;
        if (e.getSource()==("MC")) // memory clear button clicked
            mem_value=0.0;

        if(e.getSource()==buttonEqual)
        {
            b=Double.parseDouble(displayField.getText());

            switch(operator)
            {
                case 1: result=a+b;
                    break;

                case 2: result=a-b;
                    break;

                case 3: result=a*b;
                    break;

                case 4: result=a/b;
                    break;

                default: result=0;
            }

            displayField.setText(""+result);
        }
        if(e.getSource()==buttonClear)
            displayField.setText("");

        if(e.getSource()==buttonX)
        {
            String s=displayField.getText();
            displayField.setText("");
            for(int i=0;i<s.length()-1;i++)
                displayField.setText(displayField.getText()+s.charAt(i));
        }

    }

    public static void main(String[] args) {
         new Exercise04();
    }




}
