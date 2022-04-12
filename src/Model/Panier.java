/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;


/**
 *
 * @author azizm
 */
public class Panier {
    
    private int id;
    private int quantite ;
    private String prod  ;

    public Panier() {
    }

    public Panier(int id,int quantite, String prod) {
        this.id = id;
        this.quantite = quantite;
        this.prod = prod;     
    }

   
    public Panier(int quantite, String prod) {
        this.quantite = quantite;
        this.prod = prod;     
    }

    public int getId() {
        return id;
    }

    public int getQuantite() {
        return this.quantite;
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
        
                
         
    }
   
    /**
     *
     * @return
     */
    public String getProd() {
        return prod;
    }

   
  

    public void setId(int id) {
        this.id = id;
    }


    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    @Override
    public String toString() {
        return "Panier{" + "id=" + id + "quantite=" + quantite + ", produit=" + prod + '}';
    }

    public void setProd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
