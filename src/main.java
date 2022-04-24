import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main implements ActionListener {
    static JTextField displayResult = new JTextField();

    // JButtons 0 to 9
    static JButton btn9 = new JButton("9");
    static JButton btn8 = new JButton("8");
    static JButton btn7 = new JButton("7");
    static JButton btn6 = new JButton("6");
    static JButton btn5 = new JButton("5");
    static JButton btn4 = new JButton("4");
    static JButton btn3 = new JButton("3");
    static JButton btn2 = new JButton("2");
    static JButton btn1 = new JButton("1");
    static JButton btn0 = new JButton("0");

    // JButtons for operations
    static JButton btnDivision = new JButton("/");
    static JButton btnX = new JButton("x");
    static JButton btnMinus = new JButton("-");
    static JButton btnClear = new JButton("C");
    static JButton btnEqual = new JButton("=");
    static JButton btnPlus = new JButton("+");


    // adding logic for button
    static double num1;
    static double num2;
    static double value;
    static double operator =0;

    main() {
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnDivision.addActionListener(this);
        btnX.addActionListener(this);
        btnMinus.addActionListener(this);
        btnClear.addActionListener(this);
        btnEqual.addActionListener(this);
        btnPlus.addActionListener(this);
    } // end of Main


    public static void main(String[] args) {
        new main();
        GUI();
    } // end of main method

    public static void GUI() {
        JFrame frame = new JFrame("Calculator GUI");
        frame.setSize(335, 380);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        // JTextField setup
        //JTextField displayResult = new JTextField();
        displayResult.setBounds(20, 10, 280, 30);
        frame.add(displayResult);
        frame.setLayout(null);

        // button 9
        // JButton btn9 = new JButton("9");
        btn9.setBounds(20, 50, 60, 60);
        frame.add(btn9);

        // button 8
        // JButton btn8 = new JButton("8");
        btn8.setBounds(90, 50, 60, 60);
        frame.add(btn8);

        // button 7
        // JButton btnThree = new JButton("7");
        btn7.setBounds(160, 50, 60, 60);
        frame.add(btn7);

        // button Division
        //   JButton btnDivision = new JButton("/");
        btnDivision.setBounds(230, 50, 60, 60);
        frame.add(btnDivision);


        // button 4
        // JButton btn4 = new JButton("4");
        btn4.setBounds(20, 120, 60, 60);
        frame.add(btn4);

        // button 5
        //  JButton btn5 = new JButton("5");
        btn5.setBounds(90, 120, 60, 60);
        frame.add(btn5);

        // button 6
        //   JButton btn6 = new JButton("6");
        btn6.setBounds(160, 120, 60, 60);
        frame.add(btn6);

        // button x
        //  JButton btnX = new JButton("x");
        btnX.setBounds(230, 120, 60, 60);
        frame.add(btnX);

        // button 1
        //JButton btn1 = new JButton("1");
        btn1.setBounds(20, 190, 60, 60);
        frame.add(btn1);

        // button 2
        //JButton btn2 = new JButton("2");
        btn2.setBounds(90, 190, 60, 60);
        frame.add(btn2);

        // button 3
        // JButton btn3 = new JButton("3");
        btn3.setBounds(160, 190, 60, 60);
        frame.add(btn3);

        // button minus
        //   JButton btnMinus = new JButton("-");
        btnMinus.setBounds(230, 190, 60, 60);
        frame.add(btnMinus);

        // button 0
        //  JButton btn0 = new JButton("0");
        btn0.setBounds(20, 260, 60, 60);
        frame.add(btn0);


        // button clear
        //  JButton btnClear = new JButton("C");
        btnClear.setBounds(90, 260, 60, 60);
        frame.add(btnClear);

        // button equal
        //  JButton btnEqual = new JButton("=");
        btnEqual.setBounds(160, 260, 60, 60);
        frame.add(btnEqual);

        // button plus
        // JButton btnPlus = new JButton("+");
        btnPlus.setBounds(230, 260, 60, 60);
        frame.add(btnPlus);

        frame.setVisible(true);


    } // end of GUI method

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn1) {
            displayResult.setText(displayResult.getText().concat("1"));
        } else if (e.getSource() == btn2) {
            displayResult.setText(displayResult.getText().concat("2"));
        } else if (e.getSource() == btn3) {
            displayResult.setText(displayResult.getText().concat("3"));
        } else if (e.getSource() == btn4) {
            displayResult.setText(displayResult.getText().concat("4"));
        } else if (e.getSource() == btn5) {
            displayResult.setText(displayResult.getText().concat("5"));
        } else if (e.getSource() == btn6) {
            displayResult.setText(displayResult.getText().concat("6"));
        } else if (e.getSource() == btn7) {
            displayResult.setText(displayResult.getText().concat("7"));
        } else if (e.getSource() == btn8) {
            displayResult.setText(displayResult.getText().concat("8"));
        } else if (e.getSource() == btn9) {
            displayResult.setText(displayResult.getText().concat("9"));
        } else if (e.getSource() == btn0) {
            displayResult.setText(displayResult.getText().concat("0"));
        } else if (e.getSource() == btnClear) {
            displayResult.setText("");
        }


        if(e.getSource()== btnPlus){
            //num1 = Integer.parseInt(displayResult.getText());
            num1 = Double.parseDouble(displayResult.getText());
            operator=1;
            displayResult.setText("");
        } else if(e.getSource()==btnMinus){
            //num1 = Integer.parseInt(displayResult.getText());
            num1 = Double.parseDouble(displayResult.getText());
            operator=2;
            displayResult.setText("");
        } else if(e.getSource()==btnX){
            //  num1 = Integer.parseInt(displayResult.getText());
            num1 = Double.parseDouble(displayResult.getText());
            operator=3;
            displayResult.setText("");
        } else if(e.getSource()==btnDivision){
            // num1 = Integer.parseInt(displayResult.getText());
            num1 = Double.parseDouble(displayResult.getText());
            operator=4;
            displayResult.setText("");
        }

        if(e.getSource()==btnEqual){
            // num2 = Integer.parseInt(displayResult.getText());
            num2 = Double.parseDouble(displayResult.getText());

            if (operator == 1) {
                value = num1 + num2;
            } else if (operator == 2) {
                value = num1 - num2;
            } else if (operator == 3) {
                value = num1 * num2;
            } else if (operator == 4) {
                value = num1 / num2;
            } else {
                value = 0;
            } // switch case
            displayResult.setText(""+ value);
        } // btnEqual if statement
    } // end of actionPerformed

} // end of main class
