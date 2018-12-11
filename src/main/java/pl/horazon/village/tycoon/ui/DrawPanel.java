package pl.horazon.village.tycoon.ui;

import pl.horazon.village.tycoon.game.Board;
import pl.horazon.village.tycoon.ui.img.Images;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class DrawPanel extends JPanel {
    BufferedImage img;

    public DrawPanel() {
        img = Images.getCastleImage();
    }

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        int[][] borad = Board.getInstance().getBorad();

        g2d.setColor(new Color(125, 167, 116));

        for (int row = 0; row < borad.length; row++)
            for (int col = 0; col < borad[row].length; col++) {
                g2d.drawRect(50 * col, 50 * row, 50, 50);
                //g2d.drawImage(img,32 * col, 32 * row , null);
            }

    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}