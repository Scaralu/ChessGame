package ChessLayer.pieces;

import BoardLayer.Board;
import ChessLayer.ChessPiece;
import ChessLayer.Color;

public class Pawn extends ChessPiece {


    public Pawn(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "P";
    }

    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getColumns()][getBoard().getColumns()];


        return mat;
    }
}
