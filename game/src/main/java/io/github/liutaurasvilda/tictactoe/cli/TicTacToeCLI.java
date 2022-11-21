package io.github.liutaurasvilda.tictactoe.cli;

import io.github.liutaurasvilda.tictactoe.Location;
import io.github.liutaurasvilda.tictactoe.Mark;
import io.github.liutaurasvilda.tictactoe.TicTacToe;

public class TicTacToeCLI {

    private TicTacToeCLI() {
    }

    public static void main(String[] args) {
        new TicTacToeCLI().play();
    }

    void play() {
        TicTacToe game = new TicTacToe();
        game.mark(Mark.X, Location.ONE);
        game.mark(Mark.X, Location.TWO);
        game.mark(Mark.O, Location.THREE);

        System.out.println(game);
    }
}
