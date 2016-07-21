
/**
 * Write a description of class TicTacToe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class TicTacToe
{
    private char[][] theBoard;
    
    public TicTacToe()
    {
        theBoard = new char[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                theBoard[row][col] = '_';
            }
        }
    }
    
    public void printBoard()
    {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(theBoard[row][col] + " ");
            }
            System.out.println();
        }
    }
    
    public static boolean symbolIsRepeatedHorizontally
        (char[][] board, char symbol){
            boolean symbolIsRepeated = false;
            for (int row = 0; row < 3; row++) {
                int symbolCount = 0;
                for (int col = 0; col < 3; col++) {
                    if (board[row][col] == symbol) {
                        symbolCount = symbolCount + 1;
                    }
                }
                if (symbolCount == 3) {
                    symbolIsRepeated = true;
                }
            }
            return symbolIsRepeated;
    }
    
    // method stub
    public boolean isGameOver(char symbol)
    {
        boolean repeatedHorizontally = 
            symbolIsRepeatedHorizontally(theBoard, symbol);
        return repeatedHorizontally;
    }
    
    public void takeTurn(char player)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("It is " + player + "'s turn!");
        
        System.out.println("What row?");
        int row = input.nextInt();
        System.out.println("What column?");
        int col = input.nextInt();

        // make sure row and col are valid

        theBoard[row][col] = player;
    }
    
    public void playGame()
    {
        printBoard();
        while (true) {
            takeTurn('X');
            printBoard();
            
            if (isGameOver('X')) {
                break;
            }

            takeTurn('O');
            printBoard();
            
            if (isGameOver('O')) {
                break;
            }
        }
    }
}
