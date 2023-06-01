package GameEx_Final;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
/**
 * This class represents a 2D axis parallel rectangle.
 * Ex4: you should implement this class!
 * @author Asaly.Saed
 *
 */
public class Rectangle implements GeoShape {
    private int x;
    private int y;
    private int dx;
    private int dy;
    private int width;
    private int heigth;
    private int red;
    private int green;
    private int blue;

    public Rectangle(int x ,int y ,int width ,int heigth ,int red ,int green ,int blue){
        setX(x);
        setY(y);
        setWidth(width);
        setHeigth(heigth);
        setColor(red,green,blue);
    }

    /*
     * Please, do not change this function!
     *
     */
    public void draw(Graphics g, Component c) {
        g.setColor(new Color(getRed(), getGreen(), getBlue()));
        g.fillRect(getX(), getY(), getWidth(), getHeight());
        g.setColor(new Color(0, 0, 0));
        g.drawRect(getX(), getY(), getWidth(), getHeight());
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

        if(g instanceof Circle){
            Circle p = (Circle)g;
            for (int i = this.x; i < this.x + this.width ; i++) {
                for (int j = this.y; j < this.y + this.heigth ; j++) {
                     double match = (Math.pow(i - p.getX(),2) + Math.pow(j - p.getY(),2));
                    if(match == Math.pow(p.getRadius(),2)){
                        return true;
                    }

                }
            }
        }

        if(g instanceof Rectangle) {
            Rectangle p = (Rectangle) g;
            for (int i = this.x; i <= this.x + this.width; i++) {
                for (int j = this.y; j <= this.y + this.heigth; j++) {
                    for (int k = p.getX(); k <= p.getX()+p.getWidth() ; k++) {
                        for (int t = p.getY(); t<= p.getY()+p.getHeight() ; t++){
                            if(i==k&&j==t){
                                return true;
                            }
                        }

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

    public int getHeight() {
        return heigth;
    }
    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}
