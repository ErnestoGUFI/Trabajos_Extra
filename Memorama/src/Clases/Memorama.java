package Clases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class Memorama extends JFrame {
    private JPanel panelCartas;
    private JButton botonReiniciar;
    private JLabel etiquetaTiempo;
    private Temporizador temporizador;
    private ArrayList<Carta> cartas;
    private Carta primeraCarta;
    private Carta segundaCarta;
    private boolean comprobandoPar;

    public Memorama() {
        setTitle("Juego de Memorama");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        panelCartas = new JPanel();
        panelCartas.setLayout(new GridLayout(2, 4));

        botonReiniciar = new JButton("Reiniciar");
        etiquetaTiempo = new JLabel("Tiempo: 0 s");

        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new BorderLayout());
        panelSuperior.add(etiquetaTiempo, BorderLayout.WEST);
        panelSuperior.add(botonReiniciar, BorderLayout.EAST);

        add(panelSuperior, BorderLayout.NORTH);
        add(panelCartas, BorderLayout.CENTER);

        temporizador = new Temporizador(etiquetaTiempo);

        inicializarJuego();

        botonReiniciar.addActionListener(e -> reiniciarJuego());

        setVisible(true);
    }

    private void inicializarJuego() {
        cartas = new ArrayList<>();
        ArrayList<String> valoresCartas = new ArrayList<>();
        char[] letras = {'A', 'B', 'C', 'D'};
        for (char letra : letras) {
            valoresCartas.add(String.valueOf(letra));
            valoresCartas.add(String.valueOf(letra));
        }
        Collections.shuffle(valoresCartas);

        for (int i = 0; i < 8; i++) {
            Carta carta = new Carta(valoresCartas.get(i));
            carta.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    manejarClickCarta(carta);
                }
            });
            cartas.add(carta);
            panelCartas.add(carta);
        }

        primeraCarta = null;
        segundaCarta = null;
        comprobandoPar = false;
    }

    private void reiniciarJuego() {
        temporizador.detener();
        panelCartas.removeAll();
        inicializarJuego();
        panelCartas.revalidate();
        panelCartas.repaint();
        etiquetaTiempo.setText("Tiempo: 0 s");
    }

    private void manejarClickCarta(Carta carta) {
        if (comprobandoPar || carta.estaEmparejada()) return;

        carta.mostrar();

        if (primeraCarta == null) {
            primeraCarta = carta;
            if (temporizador.getTiempoTranscurrido() == 0) {
                temporizador.iniciar();
            }
        } else if (segundaCarta == null && carta != primeraCarta) {
            segundaCarta = carta;
            comprobandoPar = true;
            comprobarCartas();
        }
    }

    private void comprobarCartas() {
        if (primeraCarta.getValor().equals(segundaCarta.getValor())) {
            primeraCarta.emparejar();
            segundaCarta.emparejar();
            comprobarVictoria();
        } else {
            Timer temporizadorVoltear = new Timer(1000, e -> {
                primeraCarta.ocultar();
                segundaCarta.ocultar();
                primeraCarta = null;
                segundaCarta = null;
                comprobandoPar = false;
            });
            temporizadorVoltear.setRepeats(false);
            temporizadorVoltear.start();
        }
    }

    private void comprobarVictoria() {
        for (Carta carta : cartas) {
            if (!carta.estaEmparejada()) {
                primeraCarta = null;
                segundaCarta = null;
                comprobandoPar = false;
                return;
            }
        }
        temporizador.detener();
        int respuesta = JOptionPane.showOptionDialog(this, "¡Ganaste!\nTiempo: " + temporizador.getTiempoTranscurrido() + " segundos.",
                "Juego Terminado", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                new String[]{"Reiniciar", "Cerrar"}, "Reiniciar");

        if (respuesta == 0) {
            reiniciarJuego();
        } else {
            System.exit(0);
        }
    }
}
