package com.example.csweek4;

import android.graphics.Canvas;
import android.graphics.Paint;

import java.util.Random;

public class Spot {

    protected int radius;
    protected int centerX;
    protected int centerY;
    protected Paint color;

    public Spot(int cX, int cY)
    {
        radius=30;
        this.centerX=cX;
        this.centerY=cY;
        Random rand=new Random();
        color=new Paint();
        color.setARGB(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }

    public void draw(Canvas canvas)
    {
        canvas.drawCircle(centerX, centerY, radius, color);
    }
}
