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
public class Ganancia extends Ingreso
{

    protected String IngresoLunes;
    protected String IngresoMartes;
    protected String IngresoMiercoles;
    protected String IngresoJueves;
    protected String IngresoViernes;
    protected String IngresoSabado;

    public Ganancia(String IngresoLunes, String IngresoMartes, String IngresoMiercoles, String IngresoJueves, String IngresoViernes)
    {
        this.IngresoLunes = IngresoLunes;
        this.IngresoMartes = IngresoMartes;
        this.IngresoMiercoles = IngresoMiercoles;
        this.IngresoJueves = IngresoJueves;
        this.IngresoViernes = IngresoViernes;
    }

    public Ganancia()
    {
    }

    public Ganancia(String IngresoLunes, String IngresoMartes, String IngresoMiercoles, String IngresoJueves, String IngresoViernes, String IngresoSabado)
    {
        this.IngresoLunes = IngresoLunes;
        this.IngresoMartes = IngresoMartes;
        this.IngresoMiercoles = IngresoMiercoles;
        this.IngresoJueves = IngresoJueves;
        this.IngresoViernes = IngresoViernes;
        this.IngresoSabado = IngresoSabado;
    }

    public String getIngresoLunes()
    {
        return IngresoLunes;
    }

    public void setIngresoLunes(String IngresoLunes)
    {
        this.IngresoLunes = IngresoLunes;
    }

    public String getIngresoMartes()
    {
        return IngresoMartes;
    }

    public void setIngresoMartes(String IngresoMartes)
    {
        this.IngresoMartes = IngresoMartes;
    }

    public String getIngresoMiercoles()
    {
        return IngresoMiercoles;
    }

    public void setIngresoMiercoles(String IngresoMiercoles)
    {
        this.IngresoMiercoles = IngresoMiercoles;
    }

    public String getIngresoJueves()
    {
        return IngresoJueves;
    }

    public void setIngresoJueves(String IngresoJueves)
    {
        this.IngresoJueves = IngresoJueves;
    }

    public String getIngresoViernes()
    {
        return IngresoViernes;
    }

    public void setIngresoViernes(String IngresoViernes)
    {
        this.IngresoViernes = IngresoViernes;
    }

    public String getIngresoSabado()
    {
        return IngresoSabado;
    }

    public void setIngresoSabado(String IngresoSabado)
    {
        this.IngresoSabado = IngresoSabado;
    }

}
