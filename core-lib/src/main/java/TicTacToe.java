import java.util.Arrays;
import java.util.stream.Stream;

public class TicTacToe {

    private final Mark[] board;

    public TicTacToe() {
        this.board = new Mark[9];
        Arrays.fill(board, Mark.NONE);
    }

    public boolean isFinished() {
        return haveWinner() || isDraw();
    }

    public boolean haveWinner() {
        return rowWin() || columnWin() || diagonalWin();
    }

    public boolean isDraw() {
        return boardIsAllMarked() && haveNoWinner();
    }

    private boolean boardIsAllMarked() {
        return Arrays.stream(board).noneMatch(e -> e == Mark.NONE);
    }

    private boolean haveNoWinner() {
        return !haveWinner();
    }

    public void mark(Mark mark, Location location) {
        switch (location) {
            case ONE -> board[0] = mark;
            case TWO -> board[1] = mark;
            case THREE -> board[2] = mark;
            case FOUR -> board[3] = mark;
            case FIVE -> board[4] = mark;
            case SIX -> board[5] = mark;
            case SEVEN -> board[6] = mark;
            case EIGHT -> board[7] = mark;
            case NINE -> board[8] = mark;
        }
    }

    private boolean rowWin() {
        return Stream.of(board[0], board[1], board[2]).allMatch(e -> e == Mark.X) ||
                Stream.of(board[0], board[1], board[2]).allMatch(e -> e == Mark.O) ||
                Stream.of(board[3], board[4], board[5]).allMatch(e -> e == Mark.X) ||
                Stream.of(board[3], board[4], board[5]).allMatch(e -> e == Mark.O) ||
                Stream.of(board[6], board[7], board[8]).allMatch(e -> e == Mark.X) ||
                Stream.of(board[6], board[7], board[8]).allMatch(e -> e == Mark.O);
    }

    private boolean columnWin() {
        return Stream.of(board[0], board[3], board[6]).allMatch(e -> e == Mark.X) ||
                Stream.of(board[0], board[3], board[6]).allMatch(e -> e == Mark.O) ||
                Stream.of(board[1], board[4], board[7]).allMatch(e -> e == Mark.X) ||
                Stream.of(board[1], board[4], board[7]).allMatch(e -> e == Mark.O) ||
                Stream.of(board[2], board[5], board[8]).allMatch(e -> e == Mark.X) ||
                Stream.of(board[2], board[5], board[8]).allMatch(e -> e == Mark.O);
    }

    private boolean diagonalWin() {
        return Stream.of(board[0], board[4], board[8]).allMatch(e -> e == Mark.X) ||
                Stream.of(board[0], board[4], board[8]).allMatch(e -> e == Mark.O) ||
                Stream.of(board[2], board[4], board[6]).allMatch(e -> e == Mark.X) ||
                Stream.of(board[2], board[4], board[6]).allMatch(e -> e == Mark.O);
    }
}
