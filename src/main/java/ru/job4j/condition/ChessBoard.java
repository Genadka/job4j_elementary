package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if ((x1 + y1) == (x2 + y2) || Math.abs(x1 - y1) == Math.abs(x2 - y2)) {
                rsl = Math.abs(x2 - x1);
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static void main(String[] args) {
        int way1 = ChessBoard.way(1, 4, 3, 2);
        System.out.println(way1);
        way1 = ChessBoard.way(5, 3, 2, 0);
        System.out.println(way1);
        way1 = ChessBoard.way(8, 3, 2, 0);
        System.out.println(way1);
    }
}
