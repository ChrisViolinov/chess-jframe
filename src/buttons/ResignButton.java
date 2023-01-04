package buttons;

import java.awt.*;

public class ResignButton extends DemoButton{
    public ResignButton(){
        this.setText("Resign");
        this.addActionListener(e-> System.out.println("You Lose"));
        this.setBounds(30, 10, 100, 50); // set bounds of the button
    }
}
