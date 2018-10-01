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

    public int getTaille() {
        return taille;
    }

    public ArrayList<Orange> getSacoche() {
        return sacoche;
    }
    

    // public override equals(Panier p1, Panier p2){
    //     for(int i = 0; i<p1.size();i++){
    //         if(p1.get(i))
    //     }
    // }

    public void ajouter(Orange e){
        if(!estPlein() )
        {
            this.sacoche.add(e);
        }
    }

    public void retire(){
        if(!estVide()){
            this.sacoche.remove((Integer)this.sacoche.size()-1);
        }
    }

    public double getPrix(){
        double p = 0.;
        for(Orange o : this.sacoche){
            p+= o.getPrix();
        }
        return p;
    }

    public void boycottOrigine(String origine){
        for(int i= 0;i<this.sacoche.size();i++){
            if(this.sacoche.get(i).getOrigine().equals(origine)){
                this.sacoche.remove(i);
                boycottOrigine(origine);
            }
        }
    }
    
}