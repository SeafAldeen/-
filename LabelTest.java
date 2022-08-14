import java.awt.*;
import javax.swing.*;
public class LabelTest extends JFrame {
public LabelTest( ) {
super ("Label Test");
Container container = getContentPane ( );
container.setLayout(new FlowLayout( ));
JLabel label1 = new JLabel ("This is a label");
container.add(label1);
Icon image = new ImageIcon ("image.gif");
JLabel label2 = new JLabel (image);
container.add (label2);
JLabel label3 = new JLabel ( );
Label3.setText ("This is another label");
container.add (label3);
setSize (200, 100);
setVisible (true); 
}
public static void main ( String args[ ] ) {
new LabelTest ( );
}
}
