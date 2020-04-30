package ChessLayer.pieces;

import BoardLayer.Board;
import ChessLayer.ChessPiece;
import ChessLayer.Color;

public class Queen extends ChessPiece {


    public Queen(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "Q";
    }

    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getColumns()][getBoard().getColumns()];


        return mat;
    }

}
