package ChessLayer;

import BoardLayer.Board;
import BoardLayer.Piece;
import BoardLayer.Position;

public abstract class ChessPiece extends Piece {

    private Color color;


    protected boolean isThereOponnentPiece(Position p){
        ChessPiece pi = (ChessPiece) getBoard().piece(position);
        return p != null && pi.getColor() != color;
    }

    public ChessPiece(Board board, Color color){
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }


}
