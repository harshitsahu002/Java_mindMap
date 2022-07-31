/*Using	AWT,write a program to create two buttons named	“Red” and “Blue”.When a	button is
pressed	the	background color should	be set to the color named by the button’s label.*/	

import java.awt.*;
import java.awt.event.*;
class awt4 extends Frame implements ActionListener {
Button B1, B2;
awt4() {
    super("Buttons");
    B1 = new Button("Red");
    B1.setBounds(25, 50, 250, 30);
    B1.addActionListener(this);
    this.add(B1);
    B2 = new Button("Blue");
    B2.setBounds(25, 100, 250, 30);
    B2.addActionListener(this);
    this.add(B2);
    this.setSize(300, 160);
    this.setLayout(null);
    this.setVisible(true);
    this.addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e) {
        dispose();
    }
    });
}
public static void main(String[] args) {
    new awt4();
}
@Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == B1) {
        this.setBackground(Color.RED);
}   else if (e.getSource() == B2) {
        this.setBackground(Color.BLUE);
}
}
}