package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private Character [][] board;

    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {

        if (checkDiagonal('X') || checkHorizontal('X') || checkVertical('X')) {
            return true;
        } return false;
    }

    public Boolean isInFavorOfO() {
        if (checkDiagonal('O') || checkHorizontal('O') || checkVertical('O')) {
            return true;
        } return false;
    }

    public Boolean isTie() {

        if(!isInFavorOfO() && !isInFavorOfX()){
            return true;
        }
        return false;
    }

    public String getWinner() {
        if (isInFavorOfX()) {
            return "X";
        }
        if(isInFavorOfO()) {
            return "O";
        }
            return "";
        }


    public boolean checkVertical(Character xO){
        for(int i = 0; i <= 2; i++){
            if ((board[0][i] == xO) && (board[1][i] == xO) && (board[2][i] == xO)){
                return true;
            }
        } return false;
    }
    public boolean checkHorizontal(Character xO){
        for(int i = 0; i <= 2; i++){
            if ((board[i][0] == xO) && (board[i][1] == xO) && (board[i][2] == xO)){
                return true;
            }
        } return false;
    }

    public boolean checkDiagonal(Character xO){
        if ((board[0][0] == xO && board[1][1] == xO  && board[2][2] == xO) ||
                (board[2][0] == xO && board [1][1] == xO && board[0][2] == xO)){
            return true;
        } return false;
    }

}
