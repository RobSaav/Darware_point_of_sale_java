/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Interfaces.GestionArchivos;

/**
 *
 * @author rober
 */
public class Gestionamiento extends Ingreso
{
    public static void main(String[] args)
    {
        GestionArchivos jfga = new GestionArchivos();
        jfga.setVisible(true);
        jfga.setLocationRelativeTo(null); 
    }
}
