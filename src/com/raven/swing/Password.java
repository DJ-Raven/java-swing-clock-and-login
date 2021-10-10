package com.raven.swing;

import java.awt.Color;
import javax.swing.JPasswordField;

public class Password extends JPasswordField {

    public Password() {
        setFont(new java.awt.Font("sansserif", 0, 100));
        setForeground(new java.awt.Color(120, 120, 120));
        setBackground(new Color(0, 0, 0, 0));
        setBorder(null);
        setFocusable(false);
    }
}
