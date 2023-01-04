import panels.BotPanel;
import panels.ChessBoardPanel;
import panels.SidePanel;
import panels.TopPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChessFrame extends JFrame {


     ChessFrame(){

         this.setTitle("Chess Game by Nockreg"); // set the title of the frame
         this.setVisible(true); // make frame visible
         this.setSize(950, 650); // set x-dimensions (width) and y-dimensions (height) of the frame
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes the app when clicking X button
         this.getContentPane().setBackground(new Color(125,125,225)); // change background color by custom color
         this.setLayout(null); // allow you to use labels as separate elements
         //this.pack(); // set frame size to fit all the label elements
         //this.setResizable(false); // prevent frame from being resized

         ChessBoardPanel board = new ChessBoardPanel();
         SidePanel botPanel = new BotPanel();
         SidePanel topPanel = new TopPanel();

         this.add(botPanel);
         this.add(topPanel);
         this.add(board);

         DemoButton resignButton = new DemoButton(); // creates new button
         this.add(resignButton); // add the button to the frame
         resignButton.setText("Resign");
         resignButton.addActionListener(e-> System.out.println("You Lose"));

         DemoButton drawButton = new DemoButton(); // creates new button
         drawButton.setBounds(180, 550, 100, 50); // set bounds of the button
         this.add(drawButton); // add the button to the frame
         drawButton.setText("Draw");
         drawButton.addActionListener(e-> System.out.println("It's a draw"));

         DemoButton messageButton = new DemoButton(); // creates new button
         messageButton.setBounds(550, 550, 100, 50); // set bounds of the button
         this.add(messageButton); // add the button to the frame
         messageButton.setText("Message");
         messageButton.addActionListener(e-> System.out.println("Whats on your mind"));
    }


    }
