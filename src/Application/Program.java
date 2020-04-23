package Application;

import BoardLayer.Board;
import ChessLayer.ChessException;
import ChessLayer.ChessMatch;
import ChessLayer.ChessPiece;
import ChessLayer.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        Scanner sc = new Scanner(System.in);

        while (true){
            try{
                UI.clearTerminal();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Souce: ");
                ChessPosition source = UI.readChessPosition(sc);
                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);
                ChessPiece capturedPiece = chessMatch.moveChessPiece(source, target);
            }
            catch(ChessException e){
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());
                sc.nextLine();
            }
            catch (InputMismatchException e){
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());
                sc.nextLine();
            }
        }


    }
}
