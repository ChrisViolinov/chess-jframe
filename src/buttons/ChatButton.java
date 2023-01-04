package buttons;

public class ChatButton extends DemoButton{

   public ChatButton(){
        this.setText("Send Message");
        this.addActionListener(e-> System.out.println("Hello there"));
        this.setBounds(270, 10, 200, 50); // set bounds of the button
    }
}
