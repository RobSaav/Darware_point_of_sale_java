/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.io.BufferedReader;
import java.util.ArrayList;

/**
 *
 * @author rober
 */
public class Ingreso
//Clase Madre
{

    private String Nombre;
    private String Existencias;
    private String TamanioCM;
    private String Marca;
    private String Precio;
    private String Color;
    private String CodigoDeBarras;
    private String Unidades;

    private String Ingresos;
    private String UTotales;

    private String Semana;
    private String Hora;

    public Ingreso(String Nombre, String Existencias, String TamanioCM, String Marca, String Precio, String Color,String CodigoDeBarras, String Unidades, String Ingresos, String UTotales, String Semana, String Hora)
    {
        this.Nombre = Nombre;
        this.Existencias = Existencias;
        this.TamanioCM = TamanioCM;
        this.Marca = Marca;
        this.Precio = Precio;
        this.Color = Color;
        this.CodigoDeBarras = CodigoDeBarras;
        this.Unidades = Unidades;
        this.Ingresos = Ingresos;
        this.UTotales = UTotales;
        this.Semana = Semana;
        this.Hora = Hora;
    }

    public Ingreso(String Semana, String Hora)
    {
        this.Semana = Semana;
        this.Hora = Hora;
    }

    public Ingreso(String Nombre, String Existencias, String TamanioCM, String Marca, String Precio, String Color, String CodigoDeBarras, String Unidades, String Ingresos, String UTotales)
    {
        this.Nombre = Nombre;
        this.Existencias = Existencias;
        this.TamanioCM = TamanioCM;
        this.Marca = Marca;
        this.Precio = Precio;
        this.Color = Color;
        this.CodigoDeBarras = CodigoDeBarras;
        this.Unidades = Unidades;
        this.Ingresos = Ingresos;
        this.UTotales = UTotales;
    }

    public Ingreso()
    {
    }

    public Ingreso(String Nombre, String Existencias, String TamanioCM, String Marca, String Precio, String Color,String CodigoDeBarras, String Unidades, String Ingresos)
    {
        this.Nombre = Nombre;
        this.Existencias = Existencias;
        this.TamanioCM = TamanioCM;
        this.Marca = Marca;
        this.Precio = Precio;
        this.Color = Color;
        this.CodigoDeBarras = CodigoDeBarras;
        this.Unidades = Unidades;
        this.Ingresos = Ingresos;
    }

    public Ingreso(String Precio, String Unidades, String Ingresos, String UTotales)
    {
        this.Precio = Precio;
        this.Unidades = Unidades;
        this.Ingresos = Ingresos;
        this.UTotales = UTotales;
    }

    public String getNombre()
    {
        return Nombre;
    }

    public void setNombre(String Nombre)
    {
        this.Nombre = Nombre;
    }

    public String getExistencias()
    {
        return Existencias;
    }

    public void setExistencias(String Existencias)
    {
        this.Existencias = Existencias;
    }

    public String getTamanioCM()
    {
        return TamanioCM;
    }

    public void setTamanioCM(String TamanioCM)
    {
        this.TamanioCM = TamanioCM;
    }

    public String getMarca()
    {
        return Marca;
    }

    public void setMarca(String Marca)
    {
        this.Marca = Marca;
    }

    public String getPrecio()
    {
        return Precio;
    }

    public void setPrecio(String Precio)
    {
        this.Precio = Precio;
    }

    public String getColor()
    {
        return Color;
    }

    public void setColor(String Color)
    {
        this.Color = Color;
    }

  

    public String getUnidades()
    {
        return Unidades;
    }

    public void setUnidades(String Unidades)
    {
        this.Unidades = Unidades;
    }

    public String getIngresos()
    {
        return Ingresos;
    }

    public void setIngresos(String Ingresos)
    {
        this.Ingresos = Ingresos;
    }

    public String getUTotales()
    {
        return UTotales;
    }

    public void setUTotales(String UTotales)
    {
        this.UTotales = UTotales;
    }

    public String getSemana()
    {
        return Semana;
    }

    public void setSemana(String Semana)
    {
        this.Semana = Semana;
    }

    public String getHora()
    {
        return Hora;
    }

    public void setHora(String Hora)
    {
        this.Hora = Hora;
    }

    public String getCodigoDeBarras()
    {
        return CodigoDeBarras;
    }

    public void setCodigoDeBarras(String CodigoDeBarras)
    {
        this.CodigoDeBarras = CodigoDeBarras;
    }



}
