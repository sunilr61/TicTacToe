package TicTacToeScaler.model;

public class Cell {
    int row;
    int col;
    Symbol symbol;
    CellState cellState;
    public Cell(int i, int j){
        this.row=i;
        this.col=j;
        this.cellState=CellState.EMPTY;
        this.symbol=null;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

}
