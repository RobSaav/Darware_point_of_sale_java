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
public class Tiempo extends Ingreso
{
    private String Semana;
    private String Hora;

    public Tiempo()
    {
    }

    public Tiempo(String Semana, String Hora)
    {
        this.Semana = Semana;
        this.Hora = Hora;
    }

    public String getHora()
    {
        return Hora;
    }

    public void setHora(String Hora)
    {
        this.Hora = Hora;
    }

    public String getSemana()
    {
        return Semana;
    }

    public void setSemana(String Semana)
    {
        this.Semana = Semana;
    }
    
    
    
}
