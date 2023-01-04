package panels;

import javax.swing.*;
import java.awt.*;

public class AvatarPanel extends SidePanel {

    public AvatarPanel(){
        //this.setBounds(550,40,300,250);
        icon = new ImageIcon("src/images/avatars.jpg");
        label = new JLabel("Avatars");
        label.setForeground(Color.WHITE);
        label.setIcon(icon);
        this.add(label);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);
    }
}
