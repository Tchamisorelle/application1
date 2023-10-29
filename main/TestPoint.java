package inf331.application1.main;

import inf331.application1.defclass.Point;
public class TestPoint {
    public static void main(String[] args){
        Point p1 = new Point(3.4, 2.4);
        Point p2 = new Point(p1);
        Point p3 = new Point(0.4, 2.1);

        p1.afficher();
        p2.afficher();
        p3.deplacer(2, 1);
        p3.afficher();
        double x2 = p2.getX();
        double y2 = p2.getY();
        double x3 = p3.getX();
        double y3 = p3.getY();
        String point2 = "(" + x2 + "," + y2 + ")";
        String point3 = "(" + x3 + "," + y3 + ")";

        double distance = p2.distance(p3);
        System.out.println("la distance entre les points" + point2 + point3 + " est: " + distance);


    }
}
