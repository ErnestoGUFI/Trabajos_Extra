package Clases;

import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temporizador {
    private int tiempoTranscurrido;
    private Timer timer;
    private JLabel etiquetaTiempo;

    public Temporizador(JLabel etiquetaTiempo) {
        this.etiquetaTiempo = etiquetaTiempo;
        this.tiempoTranscurrido = 0;
        this.timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tiempoTranscurrido++;
                etiquetaTiempo.setText("Tiempo: " + tiempoTranscurrido + " s");
            }
        });
    }

    public void iniciar() {
        tiempoTranscurrido = 0;
        etiquetaTiempo.setText("Tiempo: 0 s");
        timer.start();
    }

    public void detener() {
        timer.stop();
    }

    public int getTiempoTranscurrido() {
        return tiempoTranscurrido;
    }
}
