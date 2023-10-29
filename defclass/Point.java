package inf331.application1.defclass;

public class Point {
    private double x;
    private double y;

    public Point(double a, double b){
        this.x = a;
        this.y = b;
    }
    // public Point(){
    //     this(0.0,0.0);
    // }

    public Point(Point valpt){
        this.x = valpt.x;
        this.y = valpt.y;
    }

    public double getX(){
        return x;
    }
    public void setX(double val){
        x = val;
    }
    public double getY(){
        return y;
    }
    public void setY(double val){
        y = val;
    }
    public void deplacer(double vx, double vy){
        x += vx;
        y += vy;

    }
    public void afficher(){
        System.out.println("Coordonnees du point (" + x + "," + y + ")");
    }
    public double distance(Point p){
        double dx = x - p.x;
        double dy = y - p.y;
        return Math.sqrt((dx * dx) + (dy * dy));
    }
}
