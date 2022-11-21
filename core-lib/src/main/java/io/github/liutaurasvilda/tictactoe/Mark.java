package io.github.liutaurasvilda.tictactoe;

public enum Mark {
    X("X"), O("O"),
    EMPTY(" ");

    private final String symbol;

    Mark(String symbol) {
        this.symbol = symbol;
    }

    public String symbol() {
        return symbol;
    }
}