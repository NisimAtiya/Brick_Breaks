package GameEx_Final;


import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
/**
 * This class represents a 2D circle in the plane. Please make sure you update it
 * according to the GeoShape interface.
 * Ex4: you should update this class!
 * @author Asaly.Saed
 *
 */
public class Circle implements GeoShape{
    private int x;
    private int y;
    private int dx;
    private int dy;
    private int radius;
    private int red;
    private int green;
    private int blue;


    public Circle(int x,int y,int radius ,int red ,int green ,int blue){
        setX(x);
        setY(y);
        setRadius(radius);
        setColor(red,green,blue);
    }

    /*
     * Please, do not change this function!
     *
     */
    @Override
    public void draw(Graphics g, Component c) {
        g.setColor(new Color( getRed(),getGreen(),getBlue()));
        g.fillOval(getX(), getY(), getRadius(), getRadius());
        g.setColor(new Color(0,0,0));
        g.drawOval(getX(), getY(), getRadius(), getRadius());

    }



    @Override
    public void translateX() {
        // TODO Auto-generated method stub
        setX(getX()+getDx());

    }

    @Override
    public void translateY() {
        // TODO Auto-generated method stub
        setY(getY()+getDy());
    }

    @Override
    public void setColor(int r, int g, int b) {
        // TODO Auto-generated method stub
        this.red = r;
        this.green = g;
        this.blue = b;


    }

    @Override
    public boolean intersects(GeoShape g) {
        // TODO Auto-generated method stub
        if(g instanceof Circle) {
            Circle p = (Circle) g;
            double d = Math.sqrt(Math.pow(g.getX() - this.getX(), 2) + Math.pow(g.getY() - this.getY(), 2));
            if (d <= this.getRadius() + p.getRadius()){
                return true;
            }
        }

        if(g instanceof Rectangle){
            Rectangle p = (Rectangle)g;
            for (int i = p.getX(); i < p.getX() + p.getWidth() ; i++) {
                for (int j = p.getY(); j < p.getY() + p.getHeight() ; j++) {
                     double match = (Math.pow(i - this.x,2) + Math.pow(j - this.y,2));
                    if(match == Math.pow(this.getRadius(),2)){
                        return true;
                    }

                }
            }
        }
        return false;
    }

    @Override
    public int getDx() {
        // TODO Auto-generated method stub
        return dx;
    }

    @Override
    public void setDx(int dx) {
        // TODO Auto-generated method stub
        this.dx = dx;
    }

    @Override
    public int getDy() {
        // TODO Auto-generated method stub
        return dy;
    }

    @Override
    public void setDy(int dy) {
        // TODO Auto-generated method stub
        this.dy = dy;
    }

    @Override
    public int getX() {
        // TODO Auto-generated method stub
        return x;
    }

    @Override
    public void setX(int x) {
        // TODO Auto-generated method stub
        this.x = x;
    }

    @Override
    public int getY() {
        // TODO Auto-generated method stub
        return y;
    }

    @Override
    public void setY(int y) {
        // TODO Auto-generated method stub
        this.y = y;
    }

    @Override
    public int getRed() {
        // TODO Auto-generated method stub
        return red;
    }

    @Override
    public int getGreen() {
        // TODO Auto-generated method stub
        return green;
    }

    @Override
    public int getBlue() {
        // TODO Auto-generated method stub
        return blue;
    }


    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }



}
