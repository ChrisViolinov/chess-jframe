package buttons;

public class DrawButton extends DemoButton{

    public DrawButton(){
        this.setText("Draw");
        this.addActionListener(e-> System.out.println("It's a draw"));
        this.setBounds(150, 10, 100, 50); // set bounds of the button
    }
}
