import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.GridLayout;
import javax.swing.JButton;
/**
 * A class modelling a tic-tac-toe (noughts and crosses, Xs and Os) game in a very
 * simple GUI window.
 * 
 * @author Hongbo Pang
 * @version June 10 2017
 */

public class  TicTacToeFrame extends JFrame
{ 
   private JTextArea status; // text area to print game status
   private JFrame frame = new JFrame ("TicTacToe");
   private final GridLayout grid;     // default grid-size for tic-tac-toe
   private final JButton[] buttons; 
   private JLabel label,label1,label2      ;
   private JTextArea textArea, textArea1, textArea2;
   private boolean isNewGame = false;

      /* The reset menu item */
   private JMenuItem NewItem;
   
   /* The quit menu item */
   private JMenuItem quitItem;
   
   private JButton button1,button2,button3,button4,button5,button6,button7,button8,button9;

   /** 
    * Constructs a new Tic-Tac-Toe board and sets up the basic
    * JFrame containing a JTextArea in a JScrollPane GUI.
    */
   public TicTacToeFrame()
   { 
        super();
        frame.setResizable(true);
        frame.setVisible(true);
        frame.pack();
        grid = new GridLayout(4, 5);   
        buttons = new JButton[9];

       JMenuBar menubar = new JMenuBar();
       frame.setJMenuBar(menubar); // add menu bar to our frame
       
       JMenu fileMenu = new JMenu("Game"); // create a menu
       menubar.add(fileMenu); // and add to our menu bar

       quitItem = new JMenuItem("Quit Game"); // create a menu item called "Quit"
       fileMenu.add(quitItem);
       
       final int SHORTCUT_MASK = Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(); // to save typing          
       quitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, SHORTCUT_MASK));
       quitItem.addActionListener(new ActionListener() // create an anonymous inner class
       { // start of anonymous subclass of ActionListener
          // this allows us to put the code for this action here  
            public void actionPerformed(ActionEvent event)
            {
                System.exit(0); // quit
            }
        } // end of anonymous subclass
      );


        Container con = frame.getContentPane();  
        addComponentsToPane(con);

        JScrollPane scroll = new JScrollPane (status);
         
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }
   
    public void addComponentsToPane(final Container pane) {
        JPanel panel = new JPanel();
        panel.setLayout(grid);        
        panel.setPreferredSize(new Dimension(300, 300));
    
        //add buttons
        
        button1 = new JButton();
        button1.getPreferredSize();
        panel.add(button1);
 
        
        button2 = new JButton();
        button2.getPreferredSize();
        panel.add(button2);

        button3 = new JButton();
        button3.getPreferredSize();
        panel.add(button3);
 
                
        button4 = new JButton();
        button4.getPreferredSize();
        panel.add(button4);
       
                
        button5 = new JButton();
        button5.getPreferredSize();
        panel.add(button5);
   
                
        button6 = new JButton();
        button6.getPreferredSize();
        panel.add(button6);

                
        button7 = new JButton();
        button7.getPreferredSize();
        panel.add(button7);
  
                
        button8 = new JButton();
        button8.getPreferredSize();
        panel.add(button8);

                
        button9 = new JButton();
        button9.getPreferredSize();
        panel.add(button9);
        
        
        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.append("Game in progess");
        textArea.setFont(new Font("Serif", Font.ITALIC, 16));
        panel.add(textArea);
        
        textArea1 = new JTextArea();
        textArea1.setEditable(false);
        textArea1.append("Pick any square to start");
        textArea1.setFont(new Font("Serif", Font.ITALIC, 16));
        panel.add(textArea1);      
        
        textArea2 = new JTextArea();
        textArea2.setEditable(false);
        textArea2.setFont(new Font("Serif", Font.ITALIC, 16));;
        panel.add(textArea2);        
        
       
        
        pane.add(panel);
        // pane.add(panel2);
    }
    
    /**
     * Returns a button
     * 
     * @param the index of that button 
     * @return the button
     */
        public JButton getButton(int index) {
        if (index == 1){
        return button1;
        }else if(index == 2){
        return button2;
        }else if (index == 3){
        return button3;
        }else if (index == 4){
        return button4;
        }else if (index == 5){
        return button5;
        }else if (index == 6){
        return button6;
        }else if (index == 7){
        return button7;
        }else if (index == 8){
        return button8;
        }else if (index == 9){
        return button9;
        }
        
        return button1;
    }

    /**
     * Returns the size of the buttons[] array.
     * 
     * @return the size of the buttons[] array.
     */
    public int getNumberOfButtons() {
        return buttons.length;
    }

    /**
     * Retruns the row of that button 
     * 
     * @param a button object 
     * @return the row of that button 
     */
    public int getButtonRow(JButton button) {
        if (button == button1 || button == button2 || button == button3){
            return 0;
        }else if ((button == button4 || button == button5 || button == button6)){
            return 1;
        }
            return 2;          
    }
    
    /**
     * Retruns the coloum of that button 
     * 
     * @param a button object 
     * @return the coloum of that button 
     */
    
        public int getButtonCol(JButton button) {
        if (button == button1 || button == button4 || button == button7){
            return 0;
        }else if ((button == button2 || button == button5 || button == button8)){
            return 1;
        }
        
        return 2;
    }
   
    //set the text areas
    public void setTextArea(String text){
        textArea.setText(null);
        textArea.append(text);
    }
    public void setTextArea1(String text){
        textArea1.setText(null);
        textArea1.append(text);
    }
    public void setTextArea2(String text){
        textArea2.setText(null);
        textArea2.append(text);
    }
    
    

}