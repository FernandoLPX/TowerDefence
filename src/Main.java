import main.Game;

public class Main {

    public static void main(String[] args) throws Exception {
        Game game = new Game();
        game.getGameScreen().initInputs();
        game.start();
    }
}
