import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    private TicTacToe game;

    @BeforeEach
    public void init() {
        game = new TicTacToe();
    }

    @Nested
    class GameIsNotFinished {
        @Test
        void when_just_started_the_game() {
            /*
                 |   |   |  |
                 |   |   |  |
                 |   |   |  |
             */
            assertFalse(game.isFinished());
        }

        @Test
        void when_board_is_not_all_marked_and_no_winner() {
            /*
                 | X | O |  |
                 |   |   |  |
                 |   |   |  |
             */
            game.mark(Mark.X, Location.ONE);
            game.mark(Mark.O, Location.TWO);

            assertFalse(game.isFinished());
        }
    }

    @Nested
    class GameIsFinished {
        @Test
        void when_draw_having_board_all_marked_and_no_winner() {
            /*
                 | X | O | X |
                 | O | X | O |
                 | O | X | O |
             */
            game.mark(Mark.X, Location.ONE);
            game.mark(Mark.O, Location.TWO);
            game.mark(Mark.X, Location.THREE);
            game.mark(Mark.O, Location.FOUR);
            game.mark(Mark.X, Location.FIVE);
            game.mark(Mark.O, Location.SIX);
            game.mark(Mark.O, Location.SEVEN);
            game.mark(Mark.X, Location.EIGHT);
            game.mark(Mark.O, Location.NINE);

            assertTrue(game.isFinished());
            assertTrue(game.isDraw());
        }

        @Test
        void when_a_winner_in_row() {
            /*
                 | X | X | X |
                 |   |   |   |
                 |   |   |   |
             */
            game.mark(Mark.X, Location.ONE);
            game.mark(Mark.X, Location.TWO);
            game.mark(Mark.X, Location.THREE);

            assertTrue(game.isFinished());
            assertTrue(game.haveWinner());
        }

        @Test
        void when_a_winner_in_column() {
            /*
                 | X |   |   |
                 | X |   |   |
                 | X |   |   |
             */
            game.mark(Mark.X, Location.ONE);
            game.mark(Mark.X, Location.FOUR);
            game.mark(Mark.X, Location.SEVEN);

            assertTrue(game.isFinished());
            assertTrue(game.haveWinner());
        }

        @Test
        void when_a_winner_in_diagonal() {
            /*
                 | X |   |   |
                 |   | X |   |
                 |   |   | X |
             */
            game.mark(Mark.X, Location.ONE);
            game.mark(Mark.X, Location.FIVE);
            game.mark(Mark.X, Location.NINE);

            assertTrue(game.isFinished());
            assertTrue(game.haveWinner());
        }
    }
}