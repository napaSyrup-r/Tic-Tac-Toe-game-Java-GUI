public class GameModel {
    // 1 representing Player 1 (O), 2 representing Player 2 (X)
    private int playerNo; 
    
    // Array tracking grid positions: 0 = Empty, 1 = O, 2 = X
    private int[] board;  
    
    private int player1Score;
    private int player2Score;

    public GameModel() {
        board = new int[9];
        player1Score = 0;
        player2Score = 0;
        resetBoard();
    }

    // Pure backend rules: Clears the board logic without clearing running session match scores
    public void resetBoard() {
        for (int i = 0; i < 9; i++) {
            board[i] = 0;
        }
        playerNo = 1; // Player 1 (O) defaults to first turn
    }

    // Validates and logs game grid array moves 
    public boolean makeMove(int index) {
        if (index < 0 || index > 8 || board[index] != 0) {
            return false; // Move is invalid (position already taken or out of bounds)
        }
        board[index] = playerNo;
        return true;
    }

    public int getCurrentPlayer() {
        return playerNo;
    }

    public void switchPlayer() {
        playerNo = (playerNo == 1) ? 2 : 1;
    }

    public int getPlayer1Score() { return player1Score; }
    public int getPlayer2Score() { return player2Score; }
    
    public void incrementPlayer1Score() { player1Score++; }
    public void incrementPlayer2Score() { player2Score++; }
    public int[] getBoard() { return board; }

    // Pure Mathematical Rule Engine: Decides if the current player has won the match
    public boolean checkWin() {
        // Check Rows
        if (board[0] == playerNo && board[1] == playerNo && board[2] == playerNo) return true;
        if (board[3] == playerNo && board[4] == playerNo && board[5] == playerNo) return true;
        if (board[6] == playerNo && board[7] == playerNo && board[8] == playerNo) return true;
        
        // Check Columns
        if (board[0] == playerNo && board[3] == playerNo && board[6] == playerNo) return true;
        if (board[1] == playerNo && board[4] == playerNo && board[7] == playerNo) return true;
        if (board[2] == playerNo && board[5] == playerNo && board[8] == playerNo) return true;
        
        // Check Diagonals
        if (board[0] == playerNo && board[4] == playerNo && board[8] == playerNo) return true;
        if (board[2] == playerNo && board[4] == playerNo && board[6] == playerNo) return true;
        
        return false;
    }

    // Pure Mathematical Rule Engine: Decides if the game state is locked in a draw
    public boolean checkDraw() {
        for (int cell : board) {
            if (cell == 0) return false; // Found an empty spot, match goes on
        }
        return !checkWin(); // If board is full and no one won, it's a draw
    }
}