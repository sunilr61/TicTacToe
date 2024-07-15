package TicTacToeScaler.model;

public class BotPlayer extends Player{
    public BotPlayer(int id, String name, Symbol symbol,PlayerType playerType){
        super(id, name, symbol);
        this.playerType = PlayerType.BOTPLAYER;

    }
}
