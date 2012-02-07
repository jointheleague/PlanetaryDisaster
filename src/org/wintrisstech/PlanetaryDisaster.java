package org.wintrisstech;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * This project is designed as a starting point for students learning about
 * classes. <p> Images in this project are public domain from
 * http://openclipart.org
 *
 * @author aaron@wintrisstech.org (Aaron VonderHaar)
 * @author http://wintrisstech.org
 */
public class PlanetaryDisaster extends JComponent
{

    private static final int windowWidth = 1052;
    private static final int windowHeight = 610;
    
    private Image background;
    private Image volcano;
    private Image volcanoWithLava;
    private Color skyColor = new Color(0, 128, 255);

    public static void main(String[] args) throws IOException
    {
        JFrame window = new JFrame();
        PlanetaryDisaster game = new PlanetaryDisaster();
        window.add(game);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public PlanetaryDisaster() throws IOException
    {
        background = ImageIO.read(getClass().getResource("landscape.png"));
        volcano = ImageIO.read(getClass().getResource("volcano2.png"));
        volcanoWithLava = ImageIO.read(getClass().getResource("volcano1.png"));
    }
    
    @Override
    public Dimension getPreferredSize()
    {
        return new Dimension(windowWidth, windowHeight);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        g.setColor(skyColor);
        g.fillRect(0, 0, windowWidth, windowHeight);
        g.drawImage(background, 0, 0, windowWidth, windowHeight, null);
        g.drawImage(volcano, -60, 35, 678, 273, null);
    }
}
