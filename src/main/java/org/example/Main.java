package org.example;

import processing.core.PApplet;

public class Main extends PApplet {

    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    public static final int DIAMETER = 10;

    int b1=0,b2=0,b3=0,b4=0;

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
    }

    @Override
    public void draw() {
        drawEllipse(b1, 0.2F);
        drawEllipse(b2, 0.4F);
        drawEllipse(b3, 0.6F);
        drawEllipse(b4, 0.8F);
        b1++;
        b2+=2;
        b3+=3;
        b4+=4;
    }

    private void drawEllipse(int x,float height) {
        ellipse(x,HEIGHT*height, DIAMETER, DIAMETER);
    }

}
