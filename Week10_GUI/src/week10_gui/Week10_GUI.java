/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week10_gui;

import java.awt.Color;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author michaelkhanda
 */
public class Week10_GUI extends JFrame implements ActionListener {

    JLabel label;
    JTextField text;

    public Week10_GUI() {
        label = new JLabel("Hello world");
        super.add(label);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click");
        button.addActionListener(this);
        button.setActionCommand("blue");
        super.add(button);

        JButton button1 = new JButton("Exit");
        button1.addActionListener(this);
        button1.setActionCommand("red");
        super.add(button1);

        text = new JTextField(15);
        text.addActionListener(this);
        text.setActionCommand("Name");
        super.add(text);

        super.setLayout(new FlowLayout());

    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getActionCommand().equals("blue")) {
            getContentPane().setBackground(Color.blue);
        } else if (evt.getActionCommand().equals("blue")) {
            getContentPane().setBackground(Color.red);
        } else {
            label.setText("Hello" + text.getText());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Week10_GUI frame = new Week10_GUI();
        frame.setSize(200, 100);
        frame.setVisible(true);
        frame.setTitle("My first window");

//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//JLabel label = new JLabel("Hello world");
//frame.add(label);
    }

}
