/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author azizm
 */
class Produit {
    
   
    private int id;
    private int categorie_id;
    private int prix ;
    private int quantite ;
    private String description; 
    private String nom_produit; 
    private int cart_id;
    

    public Produit() {
    }

    public Produit(int id,int categorie_id, int prix, int quantite, String description, String nom_produit, int cart_id) {
        this.id = id;
        this.categorie_id = categorie_id;
        this.prix = prix;
        this.quantite = quantite;
        this.description = description;
        this.nom_produit = nom_produit;
        this.cart_id = cart_id;     
    }

    public Produit( int categorie_id, int prix, int quantite , String description, String nom_produit, int cart_id) {
        this.categorie_id = categorie_id;
        this.prix = prix;
        this.quantite = quantite;
        this.description = description;
        this.nom_produit = nom_produit;
        this.cart_id = cart_id;
    }

    public int getId() {
        return id;
    }

    public int getCategorie_id() {
        return categorie_id;
    }

    public int getPrix() {
        return prix;
    }

    public int getQuantite() {
        return quantite;
    }
     public String getDescription() {
        return description;
    }


    public String getNom_produit() {
        return nom_produit;
    }

    public int getCart_id() {
        return cart_id;
    }

   
  

    public void setId(int id) {
        this.id = id;
    }

    public void setCategorie_id(int categorie_id) {
        this.categorie_id = categorie_id;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNom_produit(String nom_produit) {
        this.nom_produit = nom_produit;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", categorie_id=" + categorie_id + ", prix=" + prix + ", quantite=" + quantite + ", description=" + description + ", nom_produit=" + nom_produit + ", cart_id=" + cart_id + '}';
    }

   
    
    
    
    
}


