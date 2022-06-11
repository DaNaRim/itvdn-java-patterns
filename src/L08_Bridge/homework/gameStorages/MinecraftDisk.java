package L08_Bridge.homework.gameStorages;

import L08_Bridge.homework.games.Game;
import L08_Bridge.homework.games.Minecraft;

import java.util.List;

public class MinecraftDisk extends GameDisk {

    private static final List<Game> GAMES = List.of(new Minecraft());

    @Override
    public List<Game> getGamesList() {
        return GAMES;
    }
}
