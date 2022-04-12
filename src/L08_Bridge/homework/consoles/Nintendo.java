package L08_Bridge.homework.consoles;

import L08_Bridge.homework.gameStorages.GameStorage;
import L08_Bridge.homework.games.Game;

import java.util.List;

public class Nintendo extends GameConsole {

    public Nintendo(GameStorage gameStorage) {
        super(gameStorage);
    }

    @Override
    public List<Game> showGames() {
        return gameStorage.getGamesList();
    }

    @Override
    public void startGame(Game game) {
        game.start();
    }
}
