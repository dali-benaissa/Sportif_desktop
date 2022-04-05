/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Model.Panier;
import Interfaces.IServicePanier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Model.Panier;
import java.util.logging.Level;
import java.util.logging.Logger;
import Utils.MaConnexion;
/**
 *
 * @author azizm
 */
public class PanierCRUD {
    Connection cnx2;
    
    public PanierCRUD(){
    
        cnx2 = MaConnexion.getInstance().getCnx();
    
    }
    
    
    public void ajouterProduit() {
        try {
            String requete = "INSERT INTO Panier (id,quantite,prod)"
                    + "VALUES('11','5','ProteinWhey')";
            Statement st= cnx2.createStatement();
            st.executeUpdate(requete);
            System.out.println("Produit ajoutée");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            
        }
    
    }
    
    
    public void ajouterProduit2(Panier P){
        try {
            String requete2 = "INSERT INTO panier (quantite,prod)"
                    + "VALUES(?,?)";
            PreparedStatement pst = cnx2.prepareStatement(requete2);
            pst.setInt(1, P.getQuantite());
            pst.setString(2, P.getProd());
   
            pst.executeUpdate();
            System.out.println("Produit ajoutée");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    
    
    
    }
    
    public List<Panier> afficherPanier(){
                List<Panier> myList = new ArrayList<>();
        try {
            String requete3 ="SELECT * FROM Panier";
            Statement st = cnx2.createStatement();
           ResultSet rs = st.executeQuery(requete3);
           while(rs.next()){
               Panier P =new Panier();
               P.setId(rs.getInt("id"));
               P.setQuantite(rs.getInt("quantite"));
               P.setProd(rs.getString("prod"));
               myList.add(P);
           
           
           }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());   
        }
         return myList;

    
    }
    public void modifier(Panier P) {
        try {
            String req = "update Panier set quantite = ? , prod = ? where id = ?";
            PreparedStatement ps = cnx2.prepareStatement(req);
        
            ps.setInt(1, P.getQuantite());
            ps.setString(2, P.getProd());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Panier.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void supprimer(int id) {
        try {
            String req = "delete from Panier where id = ?";
            PreparedStatement ps = cnx2.prepareStatement(req);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Panier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}