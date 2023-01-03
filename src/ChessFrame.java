import javax.swing.*;
import java.awt.*;

public class ChessFrame extends JFrame {

     ChessFrame(){
         this.setTitle("Chess Game by Nockreg"); // set the title of the frame
         this.setVisible(true); // make frame visible
         this.setSize(950, 650); // set x-dimensions (width) and y-dimensions (height) of the frame
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes the app when clicking X button
         this.getContentPane().setBackground(new Color(0,160,250)); // change background color by custom color
         //this.pack(); // set frame size to fit all the label elements
         this.setLayout(null); // allow you to use labels as separate elements
         //this.setResizable(false); // prevent frame from being resized

         ImageIcon icon = new ImageIcon("src/images/chess-logo.png"); // create an image icon
         this.setIconImage(icon.getImage()); // set image as logo
    }

}
