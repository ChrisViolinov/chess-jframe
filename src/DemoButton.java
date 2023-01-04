import javax.swing.*;
import java.awt.*;

public class DemoButton extends JButton {
    JButton button = new JButton(); // creates new button
    DemoButton(){
        this.setBounds(50, 550, 100, 50); // set bounds of the button
        this.addActionListener(e -> this.setEnabled(false)); // makes the button do an action -> Printing/ Disabling / anything
        this.setText("yourText"); // adding text to the button
        this.setForeground(new Color(235,235,250)); // set button text color
        this.setFocusable(false); // text no longer gets focused after clicking
        this.setBackground(new Color(50,50,80)); //set button background color
        this.setFont(new Font("Comic Sans", Font.ITALIC, 16)); // set button font
        //this.setBorder(BorderFactory.createEtchedBorder()); // creates a border, kinda like 3d effect
        //this.setEnabled(false); // disable the button
        //this.setLayout(new BorderLayout()); // in case we want to edit the button arrangement
        //ImageIcon buttonImage = new ImageIcon("src/images/resign.jpg"); // create image
        //this.setIcon(buttonImage); // add image to the button
    }
}
