package TicTacToeScaler.model;

public class HumanPlayer extends Player {

    HumanPlayer(int id, String name, Symbol symbol,PlayerType playerType){
        super(id, name, symbol);
        this.playerType = PlayerType.HUMANPLAYER;
    }
}
