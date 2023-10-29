package inf331.application1.defclass;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(){
        this(0.0,0.0);
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
}
