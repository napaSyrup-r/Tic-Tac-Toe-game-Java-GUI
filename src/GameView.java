
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GameView extends JFrame {

    // 3x3 Grid of Game Buttons
    private JButton[] boardButtons = new JButton[9];

    // Control elements
    private JToggleButton resetButton;
    private JButton exitButton;

    // Scoreboard Labels
    private JLabel p1ScoreLabel;
    private JLabel p2ScoreLabel;

    public GameView() {
        // Configure Frame Properties
        setTitle("Tic-Tac-Toe (MVC Refactored)");
        setMinimumSize(new Dimension(800, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center window on screen
        setLayout(new BorderLayout(10, 10));

        // Create UI Sub-panels
        createHeaderPanel();
        createGameBoard();
        createControlPanel();
    }

    private void createHeaderPanel() {
        JPanel headerPanel = new JPanel(new GridLayout(2, 2, 10, 5));
        headerPanel.setBackground(Color.BLACK);
        headerPanel.setBorder(BorderFactory.createEmptyBorder(15, 50, 15, 50));

        // Create Styled Text Labels
        JLabel p1Title = new JLabel("PLAYER 1 (O):", SwingConstants.CENTER);
        p1Title.setFont(new Font("Agency FB", Font.BOLD, 36));
        p1Title.setForeground(Color.WHITE);

        JLabel p2Title = new JLabel("PLAYER 2 (X):", SwingConstants.CENTER);
        p2Title.setFont(new Font("Agency FB", Font.BOLD, 36));
        p2Title.setForeground(Color.WHITE);

        p1ScoreLabel = new JLabel("0", SwingConstants.CENTER);
        p1ScoreLabel.setFont(new Font("Agency FB", Font.BOLD, 48));
        p1ScoreLabel.setForeground(Color.YELLOW);

        p2ScoreLabel = new JLabel("0", SwingConstants.CENTER);
        p2ScoreLabel.setFont(new Font("Agency FB", Font.BOLD, 48));
        p2ScoreLabel.setForeground(Color.YELLOW);

        // Add to Header Grid layout
        headerPanel.add(p1Title);
        headerPanel.add(p2Title);
        headerPanel.add(p1ScoreLabel);
        headerPanel.add(p2ScoreLabel);

        add(headerPanel, BorderLayout.NORTH);
    }

    private void createGameBoard() {
        JPanel boardPanel = new JPanel(new GridLayout(3, 3, 5, 5));
        boardPanel.setBackground(Color.DARK_GRAY);

        // Build the 9 grid square interactive buttons
        for (int i = 0; i < 9; i++) {
            boardButtons[i] = new JButton("");
            boardButtons[i].setFont(new Font("Agency FB", Font.BOLD, 60));
            boardButtons[i].setBackground(Color.WHITE);
            boardButtons[i].setFocusPainted(false);

            // Critical MVC Action: Tag each button with an ID index number
            boardButtons[i].setActionCommand(String.valueOf(i));

            boardPanel.add(boardButtons[i]);
        }

        add(boardPanel, BorderLayout.CENTER);
    }

    private void createControlPanel() {
        JPanel controlPanel = new JPanel(new GridLayout(1, 2, 20, 0));
        controlPanel.setBorder(BorderFactory.createEmptyBorder(10, 50, 20, 50));

        resetButton = new JToggleButton("RESET");
        resetButton.setFont(new Font("Agency FB", Font.BOLD, 48));
        resetButton.setBackground(Color.BLACK);
        resetButton.setForeground(Color.WHITE);

        exitButton = new JButton("EXIT");
        exitButton.setFont(new Font("Agency FB", Font.BOLD, 48));
        exitButton.setBackground(Color.BLACK);
        exitButton.setForeground(Color.WHITE);

        controlPanel.add(resetButton);
        controlPanel.add(exitButton);

        add(controlPanel, BorderLayout.SOUTH);
    }

    // --- Controller Connection Hook Methods ---
    // Allows the Controller to catch user interactions across the entire board
    public void registerListeners(ActionListener listener) {
        for (int i = 0; i < 9; i++) {
            boardButtons[i].addActionListener(listener);
        }
        resetButton.addActionListener(listener);
        exitButton.addActionListener(listener);
    }

    public void updateBoardButton(int index, String symbol) {
        boardButtons[index].setText(symbol);
        // Change colors depending on symbol choice
        if (symbol.equals("O")) {
            boardButtons[index].setForeground(Color.BLUE);
        } else if (symbol.equals("X")) {
            boardButtons[index].setForeground(Color.RED);
        }
    }

    public void updateScores(int score1, int score2) {
        p1ScoreLabel.setText(String.valueOf(score1));
        p2ScoreLabel.setText(String.valueOf(score2));
    }

    public void clearBoardDisplay() {
        for (int i = 0; i < 9; i++) {
            boardButtons[i].setText("");
        }
        resetButton.setSelected(false);
    }

    public void showMessage(String msg, String title) {
        JOptionPane.showMessageDialog(this, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public boolean showConfirmDialog(String msg, String title) {
        int option = JOptionPane.showConfirmDialog(this, msg, title, JOptionPane.YES_NO_OPTION);
        return option == JOptionPane.YES_OPTION;
    }
}
