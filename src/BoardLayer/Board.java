package BoardLayer;

import javax.swing.text.Position;

public class Board {

    //variables
    private Integer row;
    private Integer column;
    private Piece[][] pieces;

    public Board(Integer row, Integer collumn) {
        this.row = row;
        this.column = column;
        pieces = new Piece[row][column];
    }



}
