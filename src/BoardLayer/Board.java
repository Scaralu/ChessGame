package BoardLayer;

import javafx.geometry.Pos;

public class Board {

    //variables
    private Integer rows;
    private Integer columns;
    private Piece[][] pieces;

    public Board(Integer row, Integer column) {

        //Defensive programming
        if (row < 1 || column < 1){
            throw new BoardException("Error creating board. The board must have at least 1 row and column");
        }


        this.rows = row;
        this.columns = column;
        pieces = new Piece[row][column];
    }

    public Integer getRow() {
        return rows;
    }

    public Integer getColumn() {
        return columns;
    }

    public Piece[][] getPieces() {
        return pieces;
    }

    public void setPieces(Piece[][] pieces) {
        this.pieces = pieces;
    }


    public Piece piece(Integer row, Integer column){
        if (!positionExists(row, column)){
            throw new BoardException("That position doesn't exists");   
        }

        return pieces[row][column];
    }

    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece (Piece piece, Position position){
        if (thereIsAPiece(position)){
            throw new BoardException("There is a piece in this position: " + position);
        }

        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    private boolean positionExists(Integer row, Integer column) {
        return row >= 0 && column >= 0 && row < rows && column < columns;
    }

    public boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position){
        if (!positionExists(position)){
            throw new BoardException("That position doesn't exists");
        }
        return piece(position) != null;
    }
}
