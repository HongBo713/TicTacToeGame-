
/**
 * A class that stars a new game 
 *
 * @author Hongbo Pang
 * @version June 10 2017 
 */
public class TicTacgame {
    public static void main(String[] args) {        
        TicTacController controller = new TicTacController();

        while (!controller.isGameOver()) {
            try {
                Thread.sleep(250);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }

    }    
}
