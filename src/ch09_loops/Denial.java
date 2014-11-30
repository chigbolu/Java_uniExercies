package ch09_loops;

import java.awt.*;
import javax.swing.*;

public class Denial extends JFrame {
    private MyCanvas canvas = new MyCanvas();

    public static void main(String[] args) {
        new Denial();
    }

    public Denial() {
        setLayout(new BorderLayout());
        setSize(150, 150); // canvas is 240 X 240
        setTitle("Innocent");
        add("Center", canvas);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class MyCanvas extends Canvas 
	{
        public void paint(Graphics g) 
		{
            int x = 20;
            int y = 20;
            for (int n = 0; n < 5; n++)
			{
                g.drawString( "it wasn't me!" , x, y);
                y += 20;
            }
        }
    }
}
