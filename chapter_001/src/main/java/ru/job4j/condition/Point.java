package ru.job4j.condition;

/**
 * Point
 * @author Pavel Priklonsky (votymu@yandex.ru)
 * @version $Id$
 * @since 24.02.2018
 */

public class Point {
    /**
     * variable x  y.
     */
    private int x;
    private int y;

    /**
     * Координаты точки.
     * @param x - x.
     * @param y - y.
     */
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Расстояние до другой точки.
     * @param that - that.
     * @return distance.
     */
    public double distanceTo(Point that) {
        //Расчет дистанции между точками.
        return Math.sqrt(Math.pow(that.x - this.x, 2) + Math.pow(that.y - this.y, 2));
    }
    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        //Вывод на консоль.
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);

        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }
}
