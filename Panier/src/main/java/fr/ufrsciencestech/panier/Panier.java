/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;

/**
 *
 * @author ac532323
 */
public class Panier {

    private int taille;
    private ArrayList<Orange> sacoche;

    public Panier(int taille) {
        this.taille = taille;
        this.sacoche = new ArrayList<>(taille);
    }

    public boolean estPlein() {
        if (this.sacoche.size() == this.taille) {
            return true;
        }
        return false;
    }

    public boolean estVide() {
        return this.sacoche.isEmpty();
    }

    public String toString() {
        String s = "";
        for (Orange o : sacoche) {
            s+=o.toString()+"\n";
        }
        return s;
    }

}
