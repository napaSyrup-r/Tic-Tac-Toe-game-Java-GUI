
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        // Run UI tasks safely on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Instantiate the independent architectural components
                GameModel model = new GameModel();
                GameView view = new GameView();

                // Bind them together utilizing the Controller coordinator
                new GameController(model, view);

                // Display the fully assembled interface window to the user
                view.setVisible(true);
            }
        });
    }
}
