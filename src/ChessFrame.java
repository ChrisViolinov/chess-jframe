import panels.*;

import javax.swing.*;
import java.awt.*;

public class ChessFrame extends JFrame {


     ChessFrame(){

         this.setTitle("Chess Game by Nockreg"); // set the title of the frame
         this.setVisible(true); // make frame visible
         this.setSize(1200, 800); // set x-dimensions (width) and y-dimensions (height) of the frame
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes the app when clicking X button
         this.getContentPane().setBackground(new Color(125,125,225)); // change background color by custom color
         this.setLayout(new BorderLayout()); // allow you to use labels as separate elements
         //this.pack(); // set frame size to fit all the label elements
         //this.setResizable(false); // prevent frame from being resized

         ChessBoardPanel board = new ChessBoardPanel();
         SidePanel chatPanel = new ChatPanel();
         SidePanel avatarPanel = new AvatarPanel();
         BottomPanel bottomPanel = new BottomPanel();
         TopPanel topPanel = new TopPanel();

         this.add(chatPanel, BorderLayout.EAST);
         this.add(avatarPanel, BorderLayout.WEST);
         this.add(board, BorderLayout.CENTER);
         this.add(bottomPanel, BorderLayout.SOUTH);
         this.add(topPanel, BorderLayout.NORTH);

         board.setPreferredSize(new Dimension(500, 500));
         avatarPanel.setPreferredSize(new Dimension(250, 400));
         chatPanel.setPreferredSize(new Dimension(250, 400));
         bottomPanel.setPreferredSize((new Dimension(600, 100)));
         topPanel.setPreferredSize((new Dimension(600, 100)));


    }


    }
