package Clases;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Carta extends JButton {
    private String valor;
    private boolean emparejada;
    private ImageIcon icono;
    private ImageIcon iconoReverso;

    public Carta(String valor) {
        this.valor = valor;
        this.emparejada = false;
        this.icono = new ImageIcon(getClass().getResource("/Iconos/" + valor + ".png"));
   
    }

    public String getValor() {
        return valor;
    }

    public void mostrar() {
        setIcon(icono);
    }

    public void ocultar() {
        setIcon(iconoReverso);
    }

    public boolean estaEmparejada() {
        return emparejada;
    }

    public void emparejar() {
        emparejada = true;
        setEnabled(false);
    }
}
