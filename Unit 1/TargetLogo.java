package Lesson_9;

import java.awt.*;
import java.applet.*;

public class TargetLogo extends Applet
{
//-----------------------------------------------------------------
// Draws a snowman.
//-----------------------------------------------------------------
public void paint (Graphics page)
{
final int MID = 150;
final int TOP = 50;
setBackground (Color.white);
page.setColor (Color.red);
page.fillOval (MID-50, TOP, 200, 200);
page.setColor (Color.white);
page.fillOval (MID-25, TOP+25, 150, 150);
page.setColor (Color.red);
page.fillOval (MID, TOP+50, 100, 100);
}
}
