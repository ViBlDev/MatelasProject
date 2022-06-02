/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matelas.core.entity;

/**
 *
 * @author Administrateur
 */
public class Matelas {
    
    private Long id; 
    private String nom;
    private int longeur;
    private int largeur;
    private int prix;

    public Matelas(Long id, String nom, int longeur, int largeur, int prix) {
        this.id = id;
        this.nom = nom;
        this.longeur = longeur;
        this.largeur = largeur;
        this.prix = prix;
    }

    public Matelas() {
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getLongeur() {
        return longeur;
    }

    public void setLongeur(int longeur) {
        this.longeur = longeur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Matelas{" + "id=" + id + ", nom=" + nom + ", longeur=" + longeur + ", largeur=" + largeur + ", prix=" + prix + '}';
    }
    
    
}
