package lld.designPatterns.ticTacToe;

import java.util.*;

public class Game {
    Deque<Player> players;
    Board board;
    Game(){
        initializeGame();
    }

    private void initializeGame() {
        players = new LinkedList<>();
        Player player1 = new Player("Player1",new PlayingPieceX());
        Player player2 = new Player("Player2",new PlayingPieceO());
        players.add(player1);
        players.add(player2);
        board = new Board(3);
    }

    public String startGame() {
        boolean noWinner =true;
        while (noWinner){
            Player playerTurn = players.removeFirst();
            board.printBoard();
            List<Map<Integer,Integer>> freeSpaces = board.getFreeSpaces();
            if(freeSpaces.isEmpty()){
                noWinner=false;
                continue;
            }
            System.out.println(playerTurn.name + " Enter row,column: ");
            Scanner input = new Scanner(System.in);
            String s = input.nextLine();
            String values[] = s.split(",");
            int row = Integer.valueOf(values[0]);
            int column = Integer.valueOf(values[1]);
            
            boolean pieceAdded = board.addPiece(row,column,playerTurn.piece);
            if(!pieceAdded){
                System.out.println("Invalid position");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);
            boolean isWinner = isThereWinner(row,column,playerTurn.piece.pieceType);
            if(isWinner) return playerTurn.name;
        }
        return "tie";
    }

    private boolean isThereWinner(int row, int column, PieceType pieceType) {
        return false;
    }
}
