/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

import Principal.Procesos;

/**
 *
 * @author rober
 */
public class Mod extends Procesos
{

    protected int Modificar;

    Mod()
    {
    }

    public Mod(int Modificar)
    {
        this.Modificar = Modificar;
    }

    public int getModificar()
    {
        return Modificar;
    }

    public void setModificar(int Modificar)
    {
        this.Modificar = Modificar;
    }

}
