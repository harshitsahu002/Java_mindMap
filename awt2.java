/*Using	AWT,write a program	to display a string in frame window	with pink color as background.	*/

import java.awt.*;
import java.awt.event.*;

public class awt2 extends Frame {
    Label l;
    public awt2(){
        super("Awt Pink");

        l = new Label("This is a label");
        l.setBounds(20, 60, 150, 30);
        l.setAlignment(Label.CENTER);


        add(l);
        setBackground(Color.PINK);
        setSize(500,300);
        setVisible(true);
        setLayout(null);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });

    }
    public static void main(String[] args) {
        new awt2();
    }
}
