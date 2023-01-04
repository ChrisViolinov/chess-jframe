package panels;

import javax.swing.*;
import java.awt.*;

public class SidePanel extends JPanel {
    JLabel label;
    ImageIcon icon;
    SidePanel() {
        //this.setBounds(550,0,300,250); // where to place it in Null Layout
        this.setBackground(new Color(50,50,80)); // setting the panel color
        this.setLayout(new BorderLayout());  // setting layout for the panel > starting from center-left
    }
}
