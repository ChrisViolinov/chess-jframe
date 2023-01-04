package panels;

import javax.swing.*;
import java.awt.*;

public class ChatPanel extends SidePanel {

    public ChatPanel(){
        //this.setBounds(550,300,300,240);
        icon = new ImageIcon("src/images/chat.jpg");
        label = new JLabel("Chat");
        label.setForeground(Color.WHITE);
        label.setIcon(icon);
        this.add(label);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
    }
}
