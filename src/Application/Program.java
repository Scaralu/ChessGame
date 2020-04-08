package Application;

import BoardLayer.Board;
import ChessLayer.ChessMatch;
import ChessLayer.ChessPiece;
import ChessLayer.ChessPosition;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        Scanner sc = new Scanner(System.in);

        while (true){
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.println("Souce: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.println("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.moveChessPiece(source, target);

        }


    }
}
