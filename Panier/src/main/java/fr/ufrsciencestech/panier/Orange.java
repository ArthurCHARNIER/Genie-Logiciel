/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author ac532323
 */
public class Orange {

    private double prix;

    private String origine;

    public Orange(double px, String origine) {
        this.prix = px;
        this.origine = origine;

        if (this.prix < 0) {
            throw new IllegalArgumentException("Prix négatif : " + this.prix);
        }
    }

    public double getPrix() {
        return prix;
    }

    public String getOrigine() {
        return origine;
    }

    public String toString()
    {
        String s = "Origine : "+ origine+" prix : "+prix;
        return s;
    }

    public boolean equals(Orange o1, Orange o2)
    {
        if (o1.origine.equals(o2.origine) && (o1.prix == o2.prix))
        {
            return true;
        }
        return false;
    }

}
