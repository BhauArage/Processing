package org.example;

import processing.core.PApplet;

public class Main extends PApplet {

    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    public static final int DIAMETER = 10;

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
        b1= new Ball(1, 0.2F);
        b2= new Ball(2, 0.4F);
        b3= new Ball(3, 0.6F);
        b4= new Ball(4, 0.8F);
    }

    @Override
    public void draw() {
        b1.drawEllipse();
        b2.drawEllipse();
        b3.drawEllipse();
        b4.drawEllipse();
    }

     class Ball{
        private int x;
        private final int increment;
        private final float y;


        public Ball(int increment,float y) {
            this.increment = increment;
            this.y = y;
            this.x=0;
        }

        private void update() {
            x= x+ increment;
        }

        private void drawEllipse() {
            ellipse(x, HEIGHT* y, DIAMETER, DIAMETER);
            update();
        }
    }
}

