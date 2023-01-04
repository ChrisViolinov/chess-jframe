package panels;

import javax.swing.*;
import java.awt.*;

public class BotPanel extends SidePanel {

    public BotPanel(){
        this.setBounds(550,300,300,240);
        ImageIcon icon = new ImageIcon("src/images/chat.jpg");
        JLabel label = new JLabel("Chat");
        label.setIcon(icon);
        this.add(label);
    }
}
