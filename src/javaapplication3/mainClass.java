/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;


import Utils.MaConnexion;
import Model.Panier;
import Services.PanierCRUD;
import java.sql.Date;
import java.sql.SQLException;

/**
 *
 * @author ASUS CELERON
 */
public class mainClass {
    public static void main(String[] args) throws SQLException {
        MaConnexion mc = MaConnexion.getInstance();
        MaConnexion mc2 = MaConnexion.getInstance();
        System.out.println(mc.hashCode() + "-----" + mc2.hashCode());
       PanierCRUD pcd= new PanierCRUD();
     
       Panier P2 = new Panier(5,15,"aziz");
      
       pcd.ajouterProduit2(P2);
       pcd.supprimer(4);
       System.out.println(pcd.afficherPanier());
    }
}