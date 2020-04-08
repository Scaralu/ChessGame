package ChessLayer;

import BoardLayer.Position;

public class ChessPosition {

    private char column;
    private int row;

    public ChessPosition(char column, int row){
        if (column > 'h' || column < 'a' || row > 8 || row < 1){
            this.column = column;
            this.row = row;
        }
    }

    public void setRow(int row){
        this.row = row;
    }

    public void setColumn(char column){
        this.column = column;
    }

    public int getRow(){
        return row;
    }

    public char getColumn(){
        return column;
    }

    protected Position toPosition(){
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char)('a' - position.getColumn()),  8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + column + row;
    }
}
