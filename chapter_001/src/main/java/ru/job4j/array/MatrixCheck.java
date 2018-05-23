package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = false;
        for (int i = 0; i != data.length; i++) {
            if (data[0][0] == data[i][i]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
