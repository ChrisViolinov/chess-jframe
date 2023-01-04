package panels;

import javax.swing.*;
import java.awt.*;

public class ChessBoardPanel extends JPanel {

    public ChessBoardPanel(){
        this.setBounds(10,40,500,500);
        this.setBackground(Color.blue);
        this.setLayout(new BorderLayout());
        ImageIcon icon = new ImageIcon("src/images/board.jpg");
        JLabel label = new JLabel();
        label.setIcon(icon);
        this.add(label);
    }
}
