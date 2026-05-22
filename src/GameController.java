
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController implements ActionListener {

    private GameModel model;
    private GameView view;

    public GameController(GameModel model, GameView view) {
        this.model = model;
        this.view = view;

        // Connect this controller instance as the listener for all View components
        this.view.registerListeners(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // 1. Handle Exit Button Interaction
        if (command.equals("EXIT")) {
            if (view.showConfirmDialog("Are you sure you want to exit?", "Exit Game")) {
                System.exit(0);
            }
            return;
        }

        // 2. Handle Reset Button Interaction
        if (command.equals("RESET")) {
            model.resetBoard();
            view.clearBoardDisplay();
            return;
        }

        // 3. Handle Game Board Matrix Button Interactions (Commands "0" through "8")
        try {
            int index = Integer.parseInt(command);
            int currentPlayer = model.getCurrentPlayer();
            String symbol = (currentPlayer == 1) ? "O" : "X";

            // Attempt to apply the move to the rule model array
            if (model.makeMove(index)) {
                // Request the view to visually render the symbol placement
                view.updateBoardButton(index, symbol);

                // Run rule engine analysis: Did this move secure a victory?
                if (model.checkWin()) {
                    view.showMessage("Player " + currentPlayer + " (" + symbol + ") Wins!", "Match Over");

                    if (currentPlayer == 1) {
                        model.incrementPlayer1Score();
                    } else {
                        model.incrementPlayer2Score();
                    }

                    // Synchronize the interface score metrics and flush the grid
                    view.updateScores(model.getPlayer1Score(), model.getPlayer2Score());
                    model.resetBoard();
                    view.clearBoardDisplay();
                } // Run rule engine analysis: Is the board full without a winner?
                else if (model.checkDraw()) {
                    view.showMessage("It's a Tie Match!", "Match Over");
                    model.resetBoard();
                    view.clearBoardDisplay();
                } // No concluding win/tie parameters achieved -> Advance to next player turn
                else {
                    model.switchPlayer();
                }
            }
        } catch (NumberFormatException ex) {
            // Catches arbitrary layout commands safely if added in the future
        }
    }
}
