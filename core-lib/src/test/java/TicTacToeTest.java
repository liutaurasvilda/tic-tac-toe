import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    void new_game_is_in_play() {
        TicTacToe game = new TicTacToe();
        assertTrue(game.isInPlay());
    }
}