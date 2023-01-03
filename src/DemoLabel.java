import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class DemoLabel extends JLabel {
    
    DemoLabel(){
        ImageIcon image = new ImageIcon("src/images/chess.jpg"); // create an image
        Border border = BorderFactory.createLineBorder(Color.darkGray,4); // create a border
       
        this.setText("moves played"); // set text on label
        this.setIcon(image); // add icon
        this.setHorizontalTextPosition(JLabel.CENTER); // text position LEFT, RIGHT, CENTER of image
        this.setVerticalTextPosition(JLabel.TOP); // text position TOP, BOTTOM, CENTER of image
        this.setForeground(Color.WHITE); // change text color
        this.setFont(new Font("MV Boli", Font.BOLD,40)); //  font settings
        this.setIconTextGap(30); // set gap between text and image
        this.setBorder(border); // add the border
        this.setVerticalAlignment(JLabel.CENTER); // set vertical Image CENTER, TOP or BOT
        this.setHorizontalAlignment(JLabel.RIGHT); // set horizontal Image CENTER, LEFT or RIGHT
        this.setBounds(0, 0, 250, 250); // set horizontal, vertical coordinates + the sizes of the label
//        this.setBackground(Color.black); // set background color
//        this.setOpaque(true); // display background color


    }
}
