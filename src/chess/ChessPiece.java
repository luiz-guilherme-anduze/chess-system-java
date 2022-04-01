package chess;

import boardgame.Board;
import boardgame.Piece;

/**
 *
 * @author Luiz
 */
public class ChessPiece extends Piece{
    
    private Color color;

    /**
     *
     * @param board
     * @param color
     */
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
    
    
}
