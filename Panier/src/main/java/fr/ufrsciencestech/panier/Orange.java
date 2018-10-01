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

    public Orange( String origine,double px) {
        this.origine = origine;
        this.prix = px;
        

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

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if(obj == null)
        {
            return false;
        }
        if(getClass() != obj.getClass())
        {
            return false;
        }
        Orange other = (Orange)obj;
        
        if (prix != other.prix)
        {
            return false;
        }
        
        if (!origine.equals(other.origine))
        {
            return false;
        }
        
        return true;
    }

}
