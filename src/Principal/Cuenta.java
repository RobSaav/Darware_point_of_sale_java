/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author rober
 */
public class Cuenta extends Ingreso
{
  private int Contraseña;
  private String Usuario;
  
  Cuenta(){}

    public Cuenta(int Contraseña, String Usuario)
    {
        this.Contraseña = Contraseña;
        this.Usuario = Usuario;
    }

    public String getUsuario()
    {
        return Usuario;
    }

    public void setUsuario(String Usuario)
    {
        this.Usuario = Usuario;
    }

    public int getContraseña()
    {
        return Contraseña;
    }

    public void setContraseña(int Contraseña)
    {
        this.Contraseña = Contraseña;
    }
  
  

}
