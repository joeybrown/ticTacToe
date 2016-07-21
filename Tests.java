
public class Tests
{
    public static char[][] test1 = 
    {{'X', 'X', 'X'},
     {'O', 'O', 'X'},
     {'O', 'X', 'X'}};
    
    
    public static boolean TestHorizontal() {
               
        boolean expected = true;
        boolean result =
            TicTacToe.symbolIsRepeatedHorizontally(test1, 'O');
            
        return expected == result;
    }
    
    public static void TestAll() {
        System.out.println(TestHorizontal());
    }
    
    
}
