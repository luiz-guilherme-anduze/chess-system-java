package chess;

import boardgame.Board;

/**
 *
 * @author Luiz
 */
public class ChessMatch {

    private Board board;
    
    public ChessMath(){
        board = new Board(8, 8);
    }
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
    }
}
