import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Calc implements ActionListener {
        JFrame f = new JFrame();
        JTextField t; // not initialized rn since we initialize it for each btn field
        int i = 0, x = 30, y = 50;
        JButton bclr;
        String names[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", "+", "*", "-", "/", "=" };
        JButton[] buttons = new JButton[names.length];
        static double a = 0, b = 0, res = 0;
        static int op = 0;

        public void Display() {
                // To set - 1.Title, 2.Size, 3.Layout, 4. BG color, 5. Window Resizing, 6.Window
                // Visibilty 7. Exit_ON_CLOSE
                f.setTitle("My Calculator");
                f.setSize(250, 300);
                f.setLayout(null);
                f.setBackground(Color.BLACK);
                f.setResizable(true);
                f.setVisible(true);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exits prg on closing the app window
                t = new JTextField();
                t.setBounds(30, 10, 165, 35);
                f.add(t); // Adding text field to the window
                bclr = new JButton("CLR");
                bclr.setBounds(30, 230, 180, 35);
                f.add(bclr); // Adding clear button to the window
                bclr.addActionListener(this);
                while (i < 16) {
                        x = 30; // x-axis of the btn
                        for (int j = 0; j < 4; j++) {
                                buttons[i] = new JButton(names[i]); // setting the buttons of the calculator using the
                                                                    // names and buttons array
                                buttons[i].setBounds(x, y, 45, 45); // height remains same for these
                                f.add(buttons[i]); // adding the buttons to the window
                                buttons[i].addActionListener(this); // Setting the buttons as action Listeners
                                // optional
                                buttons[i].setForeground(Color.blue);
                                buttons[i].setOpaque(true);
                                // optional
                                x += 40; // jumping to the next column to enter next btn
                                i++; // jumping to next btn
                        }
                        y += 40; // jumping to the next row to enter next 4 btns
                }
        }

        public void actionPerformed(ActionEvent e) { // code to be executed when an action is performed by any of the
                                                     // btns
                // e.getSource() -> returns the btn that performed the action
                if (e.getSource() == bclr) {
                        t.setText("");
                }
                for (i = 0; i < 11; i++) { // for numbers(10) + '.' = 11 btnss
                        if (e.getSource() == buttons[i]) {
                                t.setText(t.getText().concat(names[i])); // concat the number with the previous number
                                                                         // ->> (prev) = 3, inp = 2, -> 32
                        }
                }
                int z = -3; // for choosing optn of switch for +,-,*,/
                for (i = 11; i < 15; i++) {
                        if (e.getSource() == buttons[i]) {
                                a = Double.parseDouble(t.getText()); // first operand
                                op = i - 10; // choice for switch
                                t.setText("");
                        }
                }
                if (e.getSource() == buttons[15]) { // equals button
                        b = Double.parseDouble(t.getText()); // Convert string to double - 2nd operand
                        switch (op) {
                                case 1:
                                        res = a + b;
                                        break;
                                case 2:
                                        res = a * b;
                                        break;
                                case 3:
                                        res = a - b;
                                        break;
                                case 4:
                                        res = a / b;
                                        break;
                        }
                        t.setText("Result: " + res); // Print result
                }
        }
}

class Calculator {
        public static void main(String[] args) {
                Calc ob = new Calc(); // Create object
                ob.Display(); // Display the window
        }
}
