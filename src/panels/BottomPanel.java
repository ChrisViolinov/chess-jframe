package panels;

import buttons.ChatButton;
import buttons.DemoButton;
import buttons.DrawButton;
import buttons.ResignButton;

import javax.swing.*;
import java.awt.*;

public class BottomPanel extends JPanel {
   public BottomPanel(){
        this.setBackground(new Color(125,125,225));
        this.setLayout(null);

       ResignButton resignButton = new ResignButton();
       DrawButton drawButton = new DrawButton();
       ChatButton chatButton = new ChatButton();

       this.add(resignButton);
       this.add(drawButton);
       this.add(chatButton);


   }
}
