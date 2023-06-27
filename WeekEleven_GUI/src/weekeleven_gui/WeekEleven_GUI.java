/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package weekeleven_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author michaelkhanda
 */
public class WeekEleven_GUI extends JFrame implements ActionListener {

    /**
     * @param args the command line arguments
     */
    JLabel LabelN1, LabelN2, LabelN3, LabelA;
    JTextField TextN1, TextN2;
    JRadioButton RadioR, RadioB;
    ButtonGroup ColourButtons;
    JPanel Panel1, Panel2, Panel3;
    JCheckBox chk, chk1, chk2;

    WeekEleven_GUI() {
        LabelN1 = new JLabel("First Number");
        LabelN2 = new JLabel("Second Number");

        TextN1 = new JTextField(15);
        TextN2 = new JTextField(15);

        JButton ButtonAdd = new JButton("ADD");
        ButtonAdd.addActionListener(this);
        ButtonAdd.setActionCommand("ADD");

        Panel2 = new JPanel();
        Panel2.setLayout(new BoxLayout(Panel2, BoxLayout.Y_AXIS));
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel2.add(LabelN1);
        Panel2.add(TextN1);

        Panel2.add(LabelN2);
        Panel2.add(TextN2);

        Panel2.add(ButtonAdd);
        super.add(Panel2, BorderLayout.CENTER);

        RadioR = new JRadioButton("Red", false);
        RadioR.addActionListener(this);
        RadioR.setActionCommand("RED");

        RadioB = new JRadioButton("Blue", false);
        RadioB.addActionListener(this);
        RadioB.setActionCommand("BLUE");

        ColourButtons = new ButtonGroup();
        ColourButtons.add(RadioB);
        ColourButtons.add(RadioR);

        Panel1 = new JPanel();
        Panel1.setLayout(new BoxLayout(Panel1, BoxLayout.Y_AXIS));
        //Panel1.add(this);

//top panel
        ImageIcon ImageI = new ImageIcon("Usiu logo.png");
        JLabel LabelI = new JLabel(ImageI);
        Panel1.add(LabelI);
        Panel1.add(new JLabel("Select Background Colour"));
        Panel1.add(RadioR);
        Panel1.add(RadioB);
        super.add(Panel1, BorderLayout.NORTH);

//CheckBox
        chk = new JCheckBox("Italics");
        chk.addActionListener(this);
        chk.setActionCommand("msg1");

        chk1 = new JCheckBox("Bold");
        chk1.addActionListener(this);
        chk1.setActionCommand("msg2");

        Panel1.add(chk);
        Panel1.add(chk1);

        super.add(Panel1, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        WeekEleven_GUI X = new WeekEleven_GUI();
        X.setSize(500, 500);
        X.setVisible(true);
        X.setTitle("My Second App");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String Pass = JOptionPane.showInputDialog("Enter Authorization Code");
        if (!Pass.equals("APT3040")) {

            JOptionPane.showMessageDialog(null, "Incorrect Code", "Access Code", JOptionPane.PLAIN_MESSAGE);
        } else {
            switch (e.getActionCommand()) {
                case "ADD":
                    int N1 = Integer.parseInt(TextN1.getText());
                    int N2 = Integer.parseInt(TextN2.getText());
                    LabelA = new JLabel();
                    LabelA.setText("The sum is: " + (N1 + N2));
                    Panel3 = new JPanel();
                    Panel3.add(LabelA);
                    super.add(Panel3, BorderLayout.SOUTH);
                    break;
                case "RED":
                    Panel1.setBackground(Color.red);
                    Panel2.setBackground(Color.red);
                    Panel3.setBackground(Color.red);
                    break;

                case "BLUE":
                    Panel1.setBackground(Color.blue);
                    Panel2.setBackground(Color.blue);
                    Panel3.setBackground(Color.blue);
                    break;

                case "msg1":
                    if (!chk1.isSelected()) {
                        Font f = new Font("Serif", Font.ITALIC, 12);
                        LabelA.setFont(f);
                    } else {
                        Font f = new Font("Serif", Font.BOLD + Font.ITALIC, 12);
                        LabelA.setFont(f);
                    }
                case "msg2":
                    if (!chk1.isSelected()) {
                        Font f1 = new Font("Serif", Font.BOLD, 12);
                        LabelA.setFont(f1);
                    } else {
                        Font f1 = new Font("Serif", Font.BOLD + Font.ITALIC, 12);
                        LabelA.setFont(f1);
                    }

            }
        }
    }
}
