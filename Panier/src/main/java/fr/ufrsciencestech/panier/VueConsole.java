/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.*;

/**
 *
 * @author ac532323
 */
public class VueConsole implements Observer{
    
    @Override
    public void update(Observable obj, Object arg){
        System.out.println("VC : Ca a changé dans le panier !");
    }
}
