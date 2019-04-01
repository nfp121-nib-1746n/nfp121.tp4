package question3;

import question3.tp3.*;

import java.awt.*;
import javax.swing.*;
import java.util.Observer;
import java.util.Observable;

public class IHMCalculette extends JFrame {
    public IHMCalculette() {
        super("IHM Calculette");
        PileModele<Integer> modele = new PileModele<Integer>(new Pile2<Integer>(5));
        Controleur controle = new Controleur(modele);
        Vue vue = new Vue(modele);
        setVisible(true);
        setLayout(new GridLayout(2, 1));
        add(controle);
        pack();
        setLocation(200,200);
        add(vue);
        

    }

    public static void main(String[] args){
        new IHMCalculette();
    }
}
