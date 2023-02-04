package com.company;
import uwcse.graphics.*; // access the graphics utilities in the uw library
import java.awt.Color; // access the Color class
public class Main extends GWindowEventAdapter{

    /** The graphics window that displays the picture */
    private GWindow window;

    public OceanScene() {
        // The graphics window
        this.window = new GWindow("Ocean scene");
        this.window.setExitOnClose();

        // The ocean and the sky
        Rectangle ocean = new Rectangle(0, 0, window.getWindowWidth(), window
                .getWindowHeight(), Color.blue, true);
        window.add(ocean);

        // the sky covers the upper quarter of the window
        Rectangle sky = new Rectangle(0, 0, window.getWindowWidth(), window
                .getWindowHeight() / 4, Color.black, true);
        window.add(sky);

        // Add the graphics elements
        //this.addGraphicsElements();

        // Code to do the animation
        this.window.addEventHandler(this);
        this.window.startTimerEvents(150);
    }


    public static void main(String[] args) {
	// write your code here
    }
}
