import javax.swing.JApplet;
import java.awt.*;
import java.applet.*;
import java.io.*;
public class Snowman extends Applet
{
//-----------------------------------------------------------------
// Draws a snowman.
//-----------------------------------------------------------------
public void paint (Graphics page)
{
final int MID = 150;
final int TOP = 50;
this.setSize(new Dimension(300,225));
setBackground (Color.cyan);
page.setColor (Color.green); //changed ground to green so my name was readable
page.fillRect (0, 175, 300, 50); // ground
page.setColor (Color.yellow);
page.fillOval (+260, -40, 80, 80); // sun
page.setColor (Color.white);
page.fillOval (MID, TOP, 40, 40); // head shifted right 20 pixels
page.fillOval (MID-15, TOP+35, 70, 50); // upper torso shifted right
page.setColor (Color.red);
page.fillOval (MID+12, TOP+45, 5, 5); //Red Buttons now on upper torso
page.fillOval (MID+28, TOP+45, 5, 5);
page.setColor (Color.white);
page.fillOval (MID-30, TOP+80, 100, 60); // lower torso shifted right
page.setColor (Color.black);
page.fillOval (MID+10, TOP+10, 5, 5); // left eye shifted right
page.fillOval (MID+25, TOP+10, 5, 5); // right eye shifted right
page.drawArc (MID+10, TOP+20, 20, 10, 15, 160); // smile is now a frown
page.drawLine (MID-5, TOP+60, MID-50, TOP+40); // left arm
page.drawLine (MID+45, TOP+60, MID+75, TOP+60); // right arm
page.drawLine (MID, TOP+5, MID+20, TOP+5); // brim of hat
page.fillRect (MID+5, TOP-20, 30, 25); // top of hat
page.drawString ("Karun Ellango", 220, 10); //changed ground to green\
}
}
