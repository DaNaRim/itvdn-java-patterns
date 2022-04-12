package L08_Bridge.homework.consoles;

import L08_Bridge.homework.gameStorages.GameStorage;
import L08_Bridge.homework.games.Game;

import java.util.List;

public abstract class GameConsole {

    protected GameStorage gameStorage;

    public GameConsole(GameStorage gameStorage) {
        this.gameStorage = gameStorage;
    }

    public abstract List<Game> showGames();

    public abstract void startGame(Game game);
}
