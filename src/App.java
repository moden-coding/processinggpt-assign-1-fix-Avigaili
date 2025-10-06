import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");

    }
    public void settings() {
        size(400, 400); 
    }
    public void setup() {
       
        background(255, 16, 240);

        stroke(128, 0, 128); 
        strokeWeight(21);
        line(150, 400, 200, 100); 

        

         fill(207, 255, 4); 
        stroke(57, 255, 20); 
        strokeWeight(7);
        rectMode(CENTER); // draw rectangle from its center
        rect(width / 2, height / 2, 200, 100); // centered 200×100 rectangle

        fill(57, 255, 20);
        stroke(207, 255, 4); 
        strokeWeight(12);
        ellipse(100, 300, 170, 170);
    }
}
