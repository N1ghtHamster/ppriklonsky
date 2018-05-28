package ru.job4j.tictactoe;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        return false;
    }

    public boolean isWinnerO() {
        return false;
    }

    public boolean hasGap() {
        boolean a = false;
        for (int i = 0; i != table.length; i++) {
            for (int j = 0; j != table.length; j++) {
                if (table[0][0] == table[i][j]) {
                    a = true;
                }
            }
        }
        return a;
    }
}

