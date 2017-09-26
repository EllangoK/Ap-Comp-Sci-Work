import java.awt.*;
import java.applet.*;
import java.util.*; 
 
public class Pumpkin extends Applet
{
 public void paint(Graphics g)  
 {
 
 //Stem
 g.setColor(new Color(128,64,0));
 g.fillRect(330,60,100,100);
 
 // Pumpkin Body 
 g.setColor(new Color(255,128,0));
 g.fillOval(100,150,550,400);
 
 //Eyes
 g.setColor(Color.black);
 g.fillOval(225,250,150,50);
 g.fillOval(375,250,150,50);
 
 //nose
 Polygon nose = new Polygon();
 nose.addPoint(330,400);
 nose.addPoint(430,400);
 nose.addPoint(380,350);
 g.fillPolygon(nose);
 
 //mouth
 Polygon mouth = new Polygon();
 mouth.addPoint(250,500);
 mouth.addPoint(480,500);
 mouth.addPoint(350,450);
 mouth.addPoint(365,475);
 mouth.addPoint(380,450);
 g.fillPolygon(mouth);
 
 }  
}
