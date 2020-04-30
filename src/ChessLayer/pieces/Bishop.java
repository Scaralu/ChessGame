package ChessLayer.pieces;


import BoardLayer.Board;
import BoardLayer.Position;
import ChessLayer.ChessPiece;
import ChessLayer.Color;

public class Bishop extends ChessPiece {

    public Bishop(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "B";
    }

    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getColumns()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        //AboveRight
        p.setValues(position.getRow() - 1, position.getColumn() + 1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() - 1, p.getColumn() + 1);
        } if (getBoard().positionExists(p) && isThereOponnentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //AboveLeft
        p.setValues(position.getRow() - 1, position.getColumn() - 1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() - 1, p.getColumn() - 1);
        } if (getBoard().positionExists(p) && isThereOponnentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //BelowRight
        p.setValues(position.getRow() + 1, position.getColumn() + 1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() + 1, p.getColumn() + 1);
        } if (getBoard().positionExists(p) && isThereOponnentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //BelowLeft
        p.setValues(position.getRow() + 1, position.getColumn() - 1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() + 1, p.getColumn() - 1);
        } if (getBoard().positionExists(p) && isThereOponnentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        return mat;
    }
}
