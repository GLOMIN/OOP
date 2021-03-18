package lab7;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab7_3 implements ActionListener {
    JLabel numberLabel;
    JTextField numberField;
    JButton btnmod, btnCE, btnC, btnDEL,btnX, btnr, btnpr, btndt, btnt, btnp, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnc;
    JFrame window;

    public Lab7_3() {

        window = new JFrame("Calculator");
        Container container = window.getContentPane();
        container.setLayout(new FlowLayout());

        numberLabel = new JLabel();
        container.add(numberLabel);
        numberField = new JTextField(21);
        numberField.setPreferredSize(new Dimension(20,50));

        container.add(numberField);
        btnmod = new JButton(" % ");
        btnmod.addActionListener(this);
        container.add(btnmod);
        btnmod.setPreferredSize(new Dimension(55,30));
        
        btnCE = new JButton(" CE ");
        btnCE.addActionListener(this);
        container.add(btnCE);
        btnCE.setPreferredSize(new Dimension(55,30));

        btnC = new JButton(" C ");
        btnC.addActionListener(this);
        container.add(btnC);
        btnC.setPreferredSize(new Dimension(55,30));

        btnDEL = new JButton(" D ");
        btnDEL.addActionListener(this);
        container.add(btnDEL);
        btnDEL.setPreferredSize(new Dimension(55,30));

        btn7 = new JButton(" 7 ");
        btn7.addActionListener(this);
        container.add(btn7);
        btn7.setPreferredSize(new Dimension(55,30));

        btn8 = new JButton(" 8 ");
        btn8.addActionListener(this);
        container.add(btn8);
        btn8.setPreferredSize(new Dimension(55,30));

        btn9 = new JButton(" 9 ");
        btn9.addActionListener(this);
        container.add(btn9);
        btn9.setPreferredSize(new Dimension(55,30));

        btnX = new JButton(" X ");
        btnX.addActionListener(this);
        container.add(btnX);
        btnX.setPreferredSize(new Dimension(55,30));

        btn4 = new JButton(" 4 ");
        btn4.addActionListener(this);
        container.add(btn4);
        btn4.setPreferredSize(new Dimension(55,30));

        btn5 = new JButton(" 5 ");
        btn5.addActionListener(this);
        container.add(btn5);
        btn5.setPreferredSize(new Dimension(55,30));

        btn6 = new JButton(" 6 ");
        btn6.addActionListener(this);
        container.add(btn6);
        btn6.setPreferredSize(new Dimension(55,30));

        btnr = new JButton(" - ");
        btnr.addActionListener(this);
        container.add(btnr);
        btnr.setPreferredSize(new Dimension(55,30));

        btn1 = new JButton(" 1 ");
        btn1.addActionListener(this);
        container.add(btn1);
        btn1.setPreferredSize(new Dimension(55,30));

        btn2 = new JButton(" 2 ");
        btn2.addActionListener(this);
        container.add(btn2);
        btn2.setPreferredSize(new Dimension(55,30));

        btn3 = new JButton(" 3 ");
        btn3.addActionListener(this);
        container.add(btn3);
        btn3.setPreferredSize(new Dimension(55,30));

        btnp = new JButton(" + ");
        btnp.addActionListener(this);
        container.add(btnp);
        btnp.setPreferredSize(new Dimension(55,30));

        btnpr = new JButton(" +/- ");
        btnpr.addActionListener(this);
        container.add(btnpr);
        btnpr.setPreferredSize(new Dimension(55,30));

        btn0 = new JButton(" 0 ");
        btn0.addActionListener(this);
        container.add(btn0);
        btn0.setPreferredSize(new Dimension(55,30));

        btndt = new JButton(" . ");
        btndt.addActionListener(this);
        container.add(btndt);
        btndt.setPreferredSize(new Dimension(55,30));

        btnt = new JButton(" = ");
        btnt.addActionListener(this);
        container.add(btnt);
        btnt.setPreferredSize(new Dimension(55,30));

        window.setSize(265,325);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }



    public void actionPerformed(ActionEvent event) {
        String str = numberField.getText();
        if (event.getSource() == btn1) {
            str += "1";
            numberField.setText(str);
        } else if (event.getSource() == btn2) {
            str += "2";
            numberField.setText(str);
        } else if (event.getSource() == btn3) {
            str += "3";
            numberField.setText(str);
        } else if (event.getSource() == btn4) {
            str += "4";
            numberField.setText(str);
        } else if (event.getSource() == btn5) {
            str += "5";
            numberField.setText(str);
        } else if (event.getSource() == btn6) {
            str += "6";
            numberField.setText(str);
        } else if (event.getSource() == btn7) {
            str += "7";
            numberField.setText(str);
        } else if (event.getSource() == btn8) {
            str += "8";
            numberField.setText(str);
        } else if (event.getSource() == btn9) {
            str += "9";
            numberField.setText(str);
        } else if (event.getSource() == btn0) {
            str += "0";
            numberField.setText(str);
        }
        if (e.getSource() == btnt) {
			int b = Double.parseDouble(t.getText());

			switch (operator) {
			case 1:
				result = a + b;
				break;

			case 2:
				result = a - b;
				break;

			case 3:
				result = a * b;
				break;

			case 4:
				result = a / b;
				break;

			default:
				result = 0;
			}

			t.setText("" + result);
		}
    }

    

    public static void main(String[] args) {
        Lab7_3 gui = new Lab7_3();
    }
}
