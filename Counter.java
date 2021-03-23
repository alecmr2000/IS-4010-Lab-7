/*
IS 4010: Lab 7
Partners: Alec Rezelj, Kiley Hardcorn
Date: March 23, 2021
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter implements ActionListener {
    JLabel leftLabel;
    JLabel rightLabel;
    //Above is declaring labels.

    int leftCount;
    int rightCount;
    //Above is decaling variables.

    Counter() {
        JFrame frame = new JFrame("Let's Count");
        frame.setLayout(new FlowLayout());
        frame.setSize(200, 110);
        //Above is creating frame and frame layout.

        JButton left = new JButton("Left");
        JButton right = new JButton("Right");
        JButton reset = new JButton("Reset");
        //Above is creating three user interface buntons.

        leftCount = 0;
        rightCount = 0;
        //Above is initalizing variables to zero.

        left.addActionListener(this);
        right.addActionListener(this);
        //Above is creating action listeners.

        frame.add(left);
        frame.add(right);
        //Above is adding buntons to the frame.

        leftLabel = new JLabel("Count: " + leftCount);
        rightLabel = new JLabel("Count: " + rightCount);
        //Above is initalizing labels and displaying counts.

        frame.add(leftLabel);
        frame.add(rightLabel);
        //Above is adding lables to the frame.

        reset.addActionListener(this);
        frame.add(reset);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Left")) {
            leftCount++;
            leftLabel.setText(String.valueOf("Count: " + leftCount));
        }
        if (ae.getActionCommand().equals("Right")) {
            rightCount++;
            rightLabel.setText(String.valueOf("Count: " + rightCount));
        }
        if (ae.getActionCommand().equals("Reset")) {
            leftCount = 0;
            rightCount = 0;
            leftLabel.setText(String.valueOf("Count: " + leftCount));
            rightLabel.setText(String.valueOf("Count: " + rightCount));
        }
    }
}