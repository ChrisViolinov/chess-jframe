import panels.BotPanel;
import panels.ChessBoardPanel;
import panels.SidePanel;
import panels.TopPanel;

public class Main {
    public static void main(String[] args) {

        ChessFrame mainFrame = new ChessFrame(); // create frame (Screen)
        ChessBoardPanel mainPanel = new ChessBoardPanel(); // create new panel (Container)
        SidePanel topPanel = new TopPanel();
        SidePanel botPanel = new BotPanel();

        //FirstLabel label = new FirstLabel(); // create label (Element)
        //sideTopPanel.add(label); // add label to the panel ( Container )

        mainFrame.add(mainPanel);
        mainFrame.add(topPanel);
        mainFrame.add(botPanel);

    }
}