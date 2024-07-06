package lld.designPatterns.ticTacToe;

import java.util.List;
import java.util.Map;

public class Board {
    public int size;
    public PlayingPiece board[][];

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int column, PlayingPiece piece){
        if (board[row][column]!=null) return false;
        board[row][column] = piece;
        return true;
    }

    public void printBoard() {
    }

    public List<Map<Integer, Integer>> getFreeSpaces() {
        return null;
    }
}
