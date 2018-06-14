package ru.job4j.tictactoe;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        boolean result = true;
        boolean result0 = true;
        boolean result1 = true;
        /**for (int i = 0; i != table.length; i++) {
            for (int j = 0; j != table.length; j++) {
                if (table[0][0] != table[j][i]) {
                    result = false;
                }
                if (table[0][0] != table[i][j]) {
                    result0 = false;
                }
            }
        }*/

        for (int i = 0; i != table.length; i++) {
            int j = table.length - 1;
            if (table[0][0] != table[i][i] || table[j][0] != table[j - i][i]) {
                result1 = false;
            }
        }
        return result1;
    }

    public boolean isWinnerO() {
        return false;
    }

    public boolean hasGap() {
        return false;
    }
}

