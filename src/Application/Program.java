package Application;

import BoardLayer.Board;
import ChessLayer.ChessMatch;

public class Program {

    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}
