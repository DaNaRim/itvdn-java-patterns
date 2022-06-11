package L08_Bridge.homework.gameStorages;

import L08_Bridge.homework.games.Game;
import L08_Bridge.homework.games.Minecraft;
import L08_Bridge.homework.games.NeedForSpeed;

import java.util.List;

public class SuperGamesCartridge extends GameCartridge {

    private static final List<Game> GAMES = List.of(
            new Minecraft(),
            new NeedForSpeed()
    );

    @Override
    public List<Game> getGamesList() {
        return GAMES;
    }
}
