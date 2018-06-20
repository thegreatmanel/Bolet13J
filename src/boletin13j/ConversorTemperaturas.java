/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13j;

import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class ConversorTemperaturas {

    static final float tmax = 80;
    
    float tfha = 0;
    float tream = 0;
float tcent=0;
    public void lanzaex()throws TemperaturaErradaExcepcion {
        tcent = Float.parseFloat(JOptionPane.showInputDialog("Inserte grados"));
        if (tcent < tmax) {
            centigradosAFharenheit();
            centigradosAReamur();
            

        } else {
            throw new TemperaturaErradaExcepcion("TEMPERATURA DEMASIADO ALTA");
        };
    }

    private float centigradosAFharenheit() {
        tfha = tcent * (9f / 5f) + 32.4f;
        JOptionPane.showMessageDialog(null, "Fharenheit " + tfha);
        return tfha;
    }

    private float centigradosAReamur() {
        tream = tcent * (4f / 5f);
        JOptionPane.showMessageDialog(null, "Reamur:  " + tream);
        return tream;
    }

}
