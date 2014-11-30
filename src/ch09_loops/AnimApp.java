package ch09_loops;

import java.awt.*;
import javax.swing.*;

public class AnimApp extends JComponent implements Runnable {

    Image[] images = new Image[14];
    int frame = 0;

    public void paint(Graphics g) {
        Image image = images[frame];
        if (image != null) {
            // Draw the current image
            int x = 0;
            int y = 0;
            g.drawImage(image, x, y, this);
        }
    }

    public void run() {
        // Load the array of images
        images[0] = new ImageIcon("res\\ch09_loops\\T0.gif").getImage();
        images[1] = new ImageIcon("res\\ch09_loops\\T1.gif").getImage();
        images[2] = new ImageIcon("res\\ch09_loops\\T2.gif").getImage();
        images[3] = new ImageIcon("res\\ch09_loops\\T3.gif").getImage();
        images[4] = new ImageIcon("res\\ch09_loops\\T4.gif").getImage();
        images[5] = new ImageIcon("res\\ch09_loops\\T5.gif").getImage();
        images[6] = new ImageIcon("res\\ch09_loops\\T6.gif").getImage();
        images[7] = new ImageIcon("res\\ch09_loops\\T7.gif").getImage();
        images[8] = new ImageIcon("res\\ch09_loops\\T8.gif").getImage();
        images[9] = new ImageIcon("res\\ch09_loops\\T9.gif").getImage();
        images[10] = new ImageIcon("res\\ch09_loops\\T10.gif").getImage();
        images[11] = new ImageIcon("res\\ch09_loops\\T11.gif").getImage();
        images[12] = new ImageIcon("res\\ch09_loops\\T12.gif").getImage();
        images[13] = new ImageIcon("res\\ch09_loops\\T13.gif").getImage();
        // Display each image for 1/10 second
        int delay = 100;    // 1/10 second

        try {
            while (true) {
                // Move to the next image
                frame = (frame + 1) % images.length;

                // Causes the paint() method to be called
                repaint();

                // Wait
                Thread.sleep(delay);
            }
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        AnimApp app = new AnimApp();

        // Display the animation in a frame
        JFrame frame = new JFrame();
        frame.getContentPane().add(app);
        frame.setSize(250, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        (new Thread(app)).start();
    }
}
