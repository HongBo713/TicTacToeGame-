import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
/**
 * Write a description of class Controller here.
 *
 * @author Hongbo Pang 
 * @version June 10 2017 
 */
public class TicTacController implements ActionListener {
    private TicTacToeModel  game;
    private TicTacToeFrame view;
    
    /**
     * Overloaded constructor. Initializes the game and view, and
     * adds the action listeners to the buttons in view.
     * 
     * @param   an instance of the Game class.
     * @param   an instance of the View class.
     */
    public TicTacController() {
        this.game = new TicTacToeModel ();
        this.view = new TicTacToeFrame();
        addActionListeners();
    }

    /**
     * Adds an action listener to every button.
     */
    private void addActionListeners() {
        for (int i = 1; i < 10; i++) {
            view.getButton(i).addActionListener(this);
        }
    }
    
       @Override
    public void actionPerformed(ActionEvent e) {
        if(!game.isGameOver()){
       
       game.undateBoard((JButton) e.getSource());
       game.playGame(view.getButtonRow((JButton) e.getSource()),
                           view.getButtonCol((JButton) e.getSource()));   
       updateText();

     }
   }
   
   /**
    * Update the current massage in taxt area.
    */
   
   private void updateText(){
     if (!game.isGameOver()){
       view.setTextArea("Game in progess");
       String players = "Player " + game.getPlayer() + "'s trun.";
       view.setTextArea1(players);
       game.isGameOver();

     }else {
       view.setTextArea2(game.getWinner());
       view.setTextArea(null);
       view.setTextArea1("Game Over");

     }
   }
   /**
    * Return true is game is over, false otherwise
    * 
    * @retrun true if game is over, false otherwise
    */
   public boolean isGameOver() {
        return game.isGameOver();
   }
    
    
}

