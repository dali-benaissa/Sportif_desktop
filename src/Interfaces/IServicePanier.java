/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author azizm
 */

import java.util.List;
import Model.Panier;

public interface IServicePanier {
    
    //CRUD
    public void createPanier(Panier p);
    public List<Panier> readPanier();
    
}