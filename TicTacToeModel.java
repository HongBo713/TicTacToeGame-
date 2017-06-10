import java.util.*;
import javax.swing.JButton;

/**
 * A class modelling a tic-tac-toe (noughts and crosses, Xs and Os) game.
 * 
 * @author  Hong bo pang 
 * @version June 10, 2016
 */

public class TicTacToeModel 
{
   public static final String PLAYER_X = "X"; // player using "X"
   public static final String PLAYER_O = "O"; // player using "O"
   public static final String EMPTY = " ";  // empty cell
   public static final String TIE = "It's a TIE "; // game ended in a tie
 
   private String player = PLAYER_X;   // current player (PLAYER_X or PLAYER_O)

   private String winner = EMPTY;   // winner: PLAYER_X, PLAYER_O, TIE, EMPTY = in progress

   private int numFreeSquares  = 9; // number of squares still free
   
   private Board board; // 3x3 array representing the board
   
   private int turns = 0;
   private int row, col;
   
   /** 
    * Constructs a new Tic-Tac-Toe board.
    */
   public TicTacToeModel ()
   {
      board = new Board(); 
   }


   /**
    * Plays one game of Tic Tac Toe after player click on one button 
    * 
    * @param the row and coloum of that button.
    */

   public void playGame(int row, int col)
   {
      // loop until the game ends
       // game still in progress
          
         this.row = row;
         this.col = col;
         board.setString(row,col,player);       // fill in the square with player
         numFreeSquares--;            // decrement number of free squar
         
         
            
         if (haveWinner()){ 
            winner = player; // must be the player who just went
            return;
          }else if (numFreeSquares==0) {
            winner = TIE;
            return ;// board is full so it's a tie
         }
        
         // change to other player (this won't do anything if game has ended)
         if (player==PLAYER_X) 
            player=PLAYER_O;
         else 
            player=PLAYER_X;
  

   } 
   
   /**
    * To check if the game is over
    *
    *@return true if game is over
    *@retrun false if game is not over
    */
   public boolean isGameOver(){
         // see if the game is over
         if (winner != EMPTY){
             return true;
            }
            return false;
    }
   
   /**
    * get the string representation of a player
    * 
    * @return string represents player "X" or "O"
    */
   public String getPlayer(){
    if (player == PLAYER_X){
        return "X ";
    }
        return "O ";
    
    }
   
   /**
    * Get the string of who is winner 
    * 
    * @retrun string represents who is winning 
    */
   public String getWinner(){
       if (winner == TIE){
           return winner;
        }
       String winners = winner+ " Wins ";
       return winners;
    }
    
    
   /**
    * Returns true if filling the given square gives us a winner, and false
    * otherwise.
    * 
    * @return true if we have a winner, false otherwise
    */
   public boolean haveWinner() 
   {
      
       if ( board.getString(0,0).equals(board.getString(0,1)) &&
            board.getString(0,1).equals(board.getString(0,2)) ) return true;
       if ( board.getString(1,0).equals(board.getString(1,1)) &&
            board.getString(1,1).equals(board.getString(1,2)) ) return true;
       if ( board.getString(2,0).equals(board.getString(2,1)) &&
            board.getString(2,1).equals(board.getString(2,2)) ) return true;
            
       if ( board.getString(0,0).equals(board.getString(1,0)) &&
            board.getString(1,0).equals(board.getString(2,0)) ) return true;
       if ( board.getString(0,1).equals(board.getString(1,1)) &&
            board.getString(1,1).equals(board.getString(2,1)) ) return true;
       if ( board.getString(0,2).equals(board.getString(1,2)) &&
            board.getString(1,2).equals(board.getString(2,2)) ) return true;
            
       if ( board.getString(0,0).equals(board.getString(1,1)) &&
            board.getString(1,1).equals(board.getString(2,2)) ) return true;
       if ( board.getString(0,2).equals(board.getString(1,1)) &&
            board.getString(1,1).equals(board.getString(2,0)) ) return true;
            
       // no winner yet
       return false;
   }

   /**
    * update the button after clicking, by set text "X" or "O"
    * on it 
    */
    public void undateBoard(JButton button){
        turns++;
        if (turns %2 == 0){
            button.setText("O");
            button.setEnabled(false);
        }else {
            button.setText("X");
            button.setEnabled(false);
        }
        
        if(turns == 9 ){
            turns =0;
        }
       
    }
    
}

