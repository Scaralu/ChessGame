package ChessLayer.pieces;

import BoardLayer.Board;
import BoardLayer.Position;
import ChessLayer.ChessPiece;
import ChessLayer.Color;

public class Horse extends ChessPiece {

    public Horse(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "H";
    }

    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getColumns()][getBoard().getColumns()];

        Position p = new Position(0, 0);
        //AboveLeft
        p.setValues(position.getRow() - 2   , position.getColumn() - 1);

        //LeftAbove
        p.setValues(position.getRow() - 1   , position.getColumn() - 2);

        //RightAbove
        p.setValues(position.getRow() - 2   , position.getColumn() + 1);
        //AboveRight
        p.setValues(position.getRow() - 1   , position.getColumn() + 2);

        //BelowLeft
        p.setValues(position.getRow() + 2   , position.getColumn() - 1);
        //LeftBelow
        p.setValues(position.getRow() + 1   , position.getColumn() - 2);

        //BelowRight
        p.setValues(position.getRow() + 2   , position.getColumn() + 1);
        //RightBelow
        p.setValues(position.getRow() + 1   , position.getColumn() + 2);

        return mat;
    }
}
