// Applets are Depreciated. Don't bother learning this properly.
import java.applet.Applet;
import java.awt.*;

/*
<applet code="AppletDemo.class" width="300" height="300">
</applet>
*/
public class AppletDemo extends Applet {
        public void paint(Graphics g) {
                g.drawString("lmao cat", 100, 150);
        }
}

/* How to execute:
 * $ javac AppletDemo.java --release 8
 * $ appletviewer AppletDemo.java
 */
