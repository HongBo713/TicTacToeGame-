
/**
 * A class for the board of this game 
 *
 * @author Hongbo Pang
 * @version June 10 2017
 */
public class Board
{
    private String board[][];

    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
      board = new String[3][3];
        for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            board[i][j] = String.valueOf(i) + " " + String.valueOf(j);
         }
      }
    }
    
    /**
     *Set the text for a specific board  
     *
     *@param integer row of the board object
     *       integer col of the board object 
     *       string text need to be set 
     *       
     */
    public void setString(int row,int col, String text){
        board[row][col] = text;
    }
    
    /**
     * get the string of a item in board with row & col;
     * 
     * @param integer row and coloum
     * @return the item
     */
    public String getString(int row,int col){
        return board[row][col];
    }
}
