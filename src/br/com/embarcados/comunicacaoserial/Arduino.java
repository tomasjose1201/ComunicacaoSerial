package br.com.embarcados.comunicacaoserial;

import javax.swing.JButton;

/**
 * @author klauder
 */
public class Arduino {

    private ControlePorta arduino;

    /**
     * Construtor da classe Arduino
     */
    public Arduino() {
        arduino = new ControlePorta("COM4", 9600);//Windows - porta e taxa de transmissão
        //arduino = new ControlePorta("/dev/ttyUSB0",9600);//Linux - porta e taxa de transmissão
    }

    /**
     * Envia o comando para a porta serial
     *
     * @param button - Botão que é clicado na interface Java
     */
    public void comunicacaoArduino(JButton button) {
        switch (button.getActionCommand()) {
            case "Ligar":
                arduino.enviaDados(1);
                break;
            case "Desligar":
                arduino.enviaDados(2);
                break;
            case "Desligado":
                arduino.enviaDados(3);
                break;
            case "Nível 1":
                arduino.enviaDados(4);
                break;
            case "Nível 2":
                arduino.enviaDados(5);
                break;
            case "Nível 3":
                arduino.enviaDados(6);
                break;
            case "Ler":
                arduino.enviaDados(7);
                break;
            default:
                arduino.close();
                break;
        }
        System.out.println(button.getText());
    }
}
