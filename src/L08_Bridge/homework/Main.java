package L08_Bridge.homework;

import L08_Bridge.homework.consoles.GameConsole;
import L08_Bridge.homework.consoles.Nintendo;
import L08_Bridge.homework.gameStorages.SuperGamesCartridge;
import L08_Bridge.homework.games.Game;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        GameConsole gameConsole = new Nintendo(new SuperGamesCartridge());

        List<Game> games = gameConsole.showGames();

        games.get(0).start();
    }
}
