/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ac532323
 */
public class Controleur implements ActionListener {

    private Panier p;
    private VueGSwing vgs;
    private VueGAWT vga;

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        if (e.getActionCommand().equals("+")) {
            if (p.getSacoche().size() < p.getTaille()) {
                Orange o = new Orange("", 0);
                p.ajouter(o);
                //vgs.setTextJlabel(String.valueOf(p.getSacoche().size()));
                vga.setTextJlabel(String.valueOf(p.getSacoche().size()));
            } else {
                JOptionPane.showMessageDialog(null, "Le panier est plein");
            }
        } else {
            if (p.getSacoche().size() > 0) {
                p.retire();
                //vgs.setTextJlabel(String.valueOf(p.getSacoche().size()));
                vga.setTextJlabel(String.valueOf(p.getSacoche().size()));

            } else {
                JOptionPane.showMessageDialog(null, "Le panier est vide");
            }
        }
    }

    public void setPanier(Panier p) {
        this.p = p;
    }

    public void setVueGS(VueGSwing v) {
        this.vgs = v;
    }

    public void setVueGA(VueGAWT v) {
        this.vga = v;
    }

}
