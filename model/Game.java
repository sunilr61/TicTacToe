package TicTacToeScaler.model;

import TicTacToeScaler.Strategies.WinningStrategies;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private int nextIndexPlayer;
    private List<Moves> moves;
    private GameState gameState;
    private List<WinningStrategies> winningStrategies;
    public static Builder getBuilder(){
        return new Builder();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getNextIndexPlayer() {
        return nextIndexPlayer;
    }

    public void setNextIndexPlayer(int nextIndexPlayer) {
        this.nextIndexPlayer = nextIndexPlayer;
    }

    public List<Moves> getMoves() {
        return moves;
    }

    public void setMoves(List<Moves> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<WinningStrategies> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategies> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    private Game(Builder builder){
        this.board = new Board(builder.dimension);
        this.players= builder.players;
        this.winningStrategies=builder.winningStrategies;


    }
    public static class Builder{
        public int dimension;
        private List<Player> players;
        private List<WinningStrategies> winningStrategies;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategies> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }
        public Game build(){
            return new Game(this);
        }

    }


}
