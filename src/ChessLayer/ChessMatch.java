package ChessLayer;

import BoardLayer.Board;
import ChessLayer.pieces.King;
import ChessLayer.pieces.Rook;

public class ChessMatch {

    Board board;

    public ChessMatch(){
        board = new Board(8,8);
        setup();
    }


    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRow()][board.getColumn()];

        for (int i = 0; i<board.getRow(); i++){
            for (int j = 0; j<board.getColumn(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    public void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }
    private void setup(){
        placeNewPiece('b', 6, new Rook(board, Color.WHITE));
        placeNewPiece('e', 8, new King(board, Color.WHITE));

        placeNewPiece('b', 3, new King(board, Color.BLACK));
        placeNewPiece('e', 1, new King(board, Color.BLACK));

    }
}
