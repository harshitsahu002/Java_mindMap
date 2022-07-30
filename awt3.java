/*Write a program to create	a frame using AWT.Implement mouseClicked(),mouseEntered() and mouseExited()	events such	that:
a) Size	of	the	frame	should	be	tripled	when	mouse	enters it.
b) Frame	should	reduce	to	its	original	size	when	mouse	is	clicked	in	it.
c) Close	the	frame	when	mouse	exits it. */
import java.awt.*;
import java.awt.event.*;
class Main extends Frame implements MouseListener {
Label l;
Main() {
    super("MOUSE LISTENER");
    l = new Label();
    l.setBounds(25, 60, 250, 30);
    l.setAlignment(Label.CENTER);
    add(l);
    setSize(300, 300);
    setLayout(null);
    setVisible(true);
    addMouseListener(this);
    addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e) {
        dispose();
    }
    });
}
public static void main(String[] args) {
    new Main();
}
@Override
public void mouseClicked(MouseEvent e) {
    l.setText("Mouse Clicked");
    this.setSize(300, 300);
}
@Override
public void mousePressed(MouseEvent e) {
}
@Override
public void mouseReleased(MouseEvent e) {
}
@Override
public void mouseEntered(MouseEvent e) {
    l.setText("Mouse Entered");
    this.setSize(900, 900);
}
@Override
public void mouseExited(MouseEvent e) {
    l.setText("Mouse Exited");
    System.exit(0);
}
}