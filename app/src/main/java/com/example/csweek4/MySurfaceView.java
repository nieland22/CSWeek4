package com.example.csweek4;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;

import java.util.ArrayList;

public class MySurfaceView extends SurfaceView implements View.OnTouchListener {

    protected ArrayList<Spot> theSpots;

    public MySurfaceView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        setWillNotDraw(false);
        theSpots=new ArrayList<Spot>();
        //I want to listen for touch events
        setOnTouchListener(this);
    }

    public boolean onTouch(View v, MotionEvent event)
    {
        //find the location of the touch
        int x=(int) event.getX();
        int y=(int) event.getY();
        //add a new spot with the location of the touch
        Spot newSpot=new Spot(x, y);
        theSpots.add(newSpot);
        //after adding, need to tell myself(the surface view) to redraw
        invalidate();
        return true;
    }

    public void onDraw(Canvas canvas)
    {
        for(Spot spot : theSpots)
        {
            spot.draw(canvas);
        }
    }
}
