import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Nested
    class GameIsNotFinished {
        @Test
        void new_game_is_not_finished() {
            TicTacToe game = new TicTacToe();
            assertFalse(game.isFinished());
        }
    }

    @Nested
    class GameIsFinished {
        @Test
        void game_is_draw() {
            TicTacToe game = new TicTacToe();
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
        void row_has_a_winner() {

        }
    }
}