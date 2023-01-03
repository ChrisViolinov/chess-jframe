package panels;

import javax.swing.*;
import java.awt.*;

public class SidePanel extends JPanel {

    SidePanel() {
        this.setBounds(550,0,300,250);
        this.setBackground(Color.WHITE); // setting the panel color
        this.setLayout(new BorderLayout());  // setting layout for the panel > starting from center-left

        JLabel label = new JLabel();
        this.add(label);

        label.setText("Text");
        label.setHorizontalAlignment(JLabel.RIGHT); // setting the alignment to the right side
        label.setVerticalTextPosition(JLabel.BOTTOM); // text at the bottom of the image
        label.setHorizontalTextPosition(JLabel.CENTER); // text in the center
    }
}
