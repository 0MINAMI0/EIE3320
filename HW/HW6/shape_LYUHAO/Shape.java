import javax.swing.*;        
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public abstract class Shape extends JApplet implements ActionListener
{
    protected float area;
    protected float perimeter;
    JTextField shapeF = new JTextField(8);
    JTextField radiusF = new JTextField(8);
    JTextField lengthF = new JTextField(8);
    JTextField widthF = new JTextField(8);
    JTextField areas = new JTextField(8);
    JTextField peri = new JTextField(8);
    JButton submit = new JButton("Get Results");
    public Shape()
    {
        JPanel content = new JPanel();
        content.setLayout(new GridLayout(7,2,1,1));
        content.add(new JLabel("Choose shape: 's', 'r' or 'c'", JLabel.LEFT));
        content.add(shapeF);
        content.add(new JLabel("Input radius of circle", JLabel.LEFT));
        content.add(radiusF);
        content.add(new JLabel("Input length of square or rectangle", JLabel.LEFT));
        content.add(lengthF);
        content.add(new JLabel("Input width of rectangle", JLabel.LEFT));
        content.add(widthF);
        content.add(new JLabel("Area: ", JLabel.LEFT));
        content.add(areas);
        content.add(new JLabel("Perimeter: ", JLabel.LEFT));
        content.add(peri);
        content.add(submit);
        submit.setActionCommand("s1");
        submit.addActionListener(this);
 
        getContentPane().add(content, BorderLayout.CENTER);
        getContentPane().add(new JLabel("           "),BorderLayout.EAST);
        getContentPane().add(new JLabel("           "),BorderLayout.WEST);
    }
    public static void main(String[] args)
    {

       
       JFrame frame = new JFrame("Applet Viewer: FigureApplet.class");
       GUI applet = new GUI();
       frame.setLayout (new BorderLayout(50,20));
       frame.add(applet,BorderLayout.CENTER);
       frame.setSize(550,250);
       frame.add(new JLabel("Applet", JLabel.LEFT),BorderLayout.NORTH);
       frame.add(new JLabel("Applet started.", JLabel.LEFT),BorderLayout.SOUTH);
       frame.add(new JLabel(" "),BorderLayout.WEST);
       frame.add(new JLabel(" "),BorderLayout.EAST);
       frame.setLocationRelativeTo(null);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        switch(shapeF.getText())
            {
                case "c":
                    areas.setText(Float.toString(Float.parseFloat(radiusF.getText()) *Float.parseFloat(radiusF.getText())*(float)Math.PI));
                    peri.setText(Float.toString(2*Float.parseFloat(radiusF.getText())*(float)Math.PI));
                break;
                case "s":
                    areas.setText(Float.toString(Float.parseFloat(lengthF.getText()) *Float.parseFloat(lengthF.getText())));
                    peri.setText(Float.toString(4*Float.parseFloat(lengthF.getText())));
                break;
                case "r":
                    areas.setText(Float.toString(Float.parseFloat(lengthF.getText()) *Float.parseFloat(widthF.getText())));
                    peri.setText(Float.toString(2*(Float.parseFloat(lengthF.getText())+Float.parseFloat(widthF.getText()))));
                break;
                default:   
                    areas.setText("Invalid command!");
                    peri.setText("Invalid command!");
                break;
            }
        
    }
abstract public void readShape();

// To compute the shape’s area
abstract public void computeArea();
// To computer the shape’s perimeter
 abstract public void computePerimeter();
// To display the area and perimeter of the shape
 abstract public void displayShape();
 
}
