package Clases;

import javax.swing.*;
import java.awt.*;

public class MickeyMouse extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Configurar el color de fondo
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Dibujar la cabeza
        g2d.setColor(Color.BLACK);
        g2d.fillOval(100, 100, 200, 200); // Cabeza

        // Dibujar las orejas
        g2d.fillOval(50, 50, 100, 100); // Oreja izquierda
        g2d.fillOval(250, 50, 100, 100); // Oreja derecha

        // Dibujar los óvalos de color piel alrededor de los ojos y la boca
        Color skinColor = new Color(255, 224, 189); // Color de piel
        g2d.setColor(skinColor);
        g2d.fillOval(120, 150, 90, 100); // Óvalo alrededor del ojo izquierdo
        g2d.fillOval(190, 150, 90, 100); // Óvalo alrededor del ojo derecho
        g2d.fillOval(140, 210, 120, 80); // Óvalo alrededor de la boca

        // Dibujar los ojos
        g2d.setColor(Color.WHITE);
        g2d.fillOval(150, 190, 20, 30); // Ojo izquierdo
        g2d.fillOval(230, 190, 20, 30); // Ojo derecho

        // Dibujar las pupilas
        g2d.setColor(Color.BLACK);
        g2d.fillOval(155, 200, 10, 15); // Pupila izquierda
        g2d.fillOval(235, 200, 10, 15); // Pupila derecha

        // Dibujar la nariz
        g2d.fillOval(190, 220, 20, 15); // Nariz

        // Dibujar la boca
        g2d.drawArc(175, 240, 50, 30, 0, -180); // Boca
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mickey Mouse");
        MickeyMouse mickeyMouse = new MickeyMouse();
        frame.add(mickeyMouse);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
