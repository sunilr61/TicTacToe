package TicTacToeScaler.controller;

import TicTacToeScaler.Strategies.WinningStrategies;
import TicTacToeScaler.model.Game;
import TicTacToeScaler.model.GameState;
import TicTacToeScaler.model.Player;

import java.util.List;
// This is game controller class
public class GameController {
    public Game startGame(int dimension, List<Player> players, List<WinningStrategies> winningStrategies){
        return Game
                .getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();

    }
    public GameState checkState(Game game){
        return game.getGameState();
    }
//    public void display(Game game){
//        game.displayBoard();
//    }

    public void makeMove(Game game){

    }

    public Player getWinner(Game game){
        return null;
    }

    public void undo(Game game){

    }


}
