package application;

import boardgame.Board;
import chess.ChessMatch;


/**
 *
 * @author Luiz
 */
public class Program {
    public static void main(String[] args){
        
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
        
    }    
}
