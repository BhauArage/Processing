package org.example;

import processing.core.PApplet;

public class Main extends PApplet {

    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    public static final int DIAMETER = 10;
    class Ball{
        int x,increment;
        float height;


        public Ball(int increment,float height) {
            this.increment = increment;
            this.height=height;
            this.x=0;
        }
    }
    
    Ball b1,b2,b3,b4;
    public static void main(String[] args) {
        PApplet.main("org.example.Main",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
//        ellipse(WIDTH/2,HEIGHT/2, DIAMETER, DIAMETER);
        b1=new Ball(1,0.2F);
        b2=new Ball(2,0.4F);
        b3=new Ball(3,0.6F);
        b4=new Ball(4,0.8F);
    }

    @Override
    public void draw() {
        drawEllipse(b1);
        drawEllipse(b2);
        drawEllipse(b3);
        drawEllipse(b4);

        update(b1);
        update(b2);
        update(b3);
        update(b4);
    }

    private void update(Ball b) {
        b.x= b.x+ b.increment;
    }

    private void drawEllipse(Ball obj) {
        ellipse(obj.x, HEIGHT* obj.height, DIAMETER, DIAMETER);
    }

}
