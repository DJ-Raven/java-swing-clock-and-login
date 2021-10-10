package com.raven.swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class Panel extends JPanel {

    public Color getGradientColor() {
        return gradientColor;
    }

    public void setGradientColor(Color gradientColor) {
        this.gradientColor = gradientColor;
    }

    private Color gradientColor;

    public Panel() {
        setOpaque(false);
        gradientColor = new Color(255, 255, 255);
        setBackground(new Color(241, 212, 62));
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        float dist[] = {0f, 1f};
        Color colors[] = {gradientColor, getBackground()};
        RadialGradientPaint gra = new RadialGradientPaint(new Point(getWidth() / 2, 0), getHeight(), dist, colors);
        g2.setPaint(gra);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
        super.paintComponent(grphcs);
    }
}
