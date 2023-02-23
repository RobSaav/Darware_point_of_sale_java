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
public class Calculos extends Ingreso
{
   protected String Semanal;
   protected String Bruto;
   protected String Total;

    public Calculos(String Semanal, String Bruto, String Total)
    {
        this.Semanal = Semanal;
        this.Bruto = Bruto;
        this.Total = Total;
    }

    public Calculos()
    {
    }

    public String getSemanal()
    {
        return Semanal;
    }

    public void setSemanal(String Semanal)
    {
        this.Semanal = Semanal;
    }

    public String getBruto()
    {
        return Bruto;
    }

    public void setBruto(String Bruto)
    {
        this.Bruto = Bruto;
    }

    public String getTotal()
    {
        return Total;
    }

    public void setTotal(String Total)
    {
        this.Total = Total;
    }
   
   

}