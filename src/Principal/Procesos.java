/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Interfaces.Ingresos;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class Procesos extends Ingreso
{

    private static Ingreso obj1[];
    private static Ganancia obj2[];
    private static Cuenta obj3[];
    private static int opc;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        //Principal para comenzar
        opc = 0;
        do
        {
            Menu();
            switch (opc)
            {
                case 1:
                    System.out.println("-----------------");
                    System.out.println("Salir de cuenta");
                    Ingresar();
                    System.out.println("-----------------");
                    break;
                case 2:
                    System.out.println("-----------------");
                    System.out.println("Ingreso de Materiales");
                    IngresarMateriales();
                    System.out.println("-----------------");
                    break;
                case 3:
                    System.out.println("-----------------");
                    System.out.println("Ingreso de salarios");
                    IngresarGanancia();
                    System.out.println("-----------------");
                    break;
                case 4:
                    System.out.println("-----------------");
                    System.out.println("Modificar ingresos");
                    ModificarIngreso();
                    System.out.println("-----------------");
                    break;
                case 5:
                    System.out.println("-----------------");
                    System.out.println("Modificar Materiales");
                    ModificarExistencias();
                    System.out.println("-----------------");
                    break;
                case 6:
                    System.out.println("-----------------");
                    System.out.println("Mostrar");
                    Mostrar();
                    System.out.println("-----------------");
                    break;
                case 7:
                    System.out.println("-----------------");
                    System.out.println("Dudas...");
                    Dudas();
                    System.out.println("-----------------");
                    break;
                case 8:
                    System.out.println("-----------------");
                    System.out.println("Saliendo");
                    System.out.println("-----------------");
                    break;
                default:
                    System.out.println("Error de opcion");
                    break;
            }
        } while (opc > 0 && opc < 8);
    }

    public static void Menu()
    {
        System.out.println("Bienvenidos");
        System.out.println("Seleccione la operacion");
        System.out.println("1.-Ingresar Cuenta");
        System.out.println("2.-Ingresar Materiales");
        System.out.println("3.-Ingresar Ganancias");
        System.out.println("4.-Modificar Ingresos");
        System.out.println("5.-Modificar Excistencias");
        System.out.println("6.-Mostrar");
        System.out.println("7.-Dudas");
        System.out.println("8.-Salir");
        opc = sc.nextInt();
    }

    public static void Ingresar()
    {
        int opc6 = 0;
        obj3 = new Cuenta[]
        {
            new Cuenta()
        };

        for (int i = 0; i < obj3.length; i++)
        {
            obj3[i] = new Cuenta();
            System.out.println("Bienvenido");
            System.out.println("Ingrese su numero de cuenta");
            obj3[i].setContraseña(sc.nextInt());
            System.out.println("Ingrese su contrseña");
            obj3[i].setUsuario(sc.next());

        }

        do
        {
            System.out.println("Desea salir de su cuenta?");
            System.out.println("1.-si");
            System.out.println("2.-No");
            opc6 = sc.nextInt();
            switch (opc6)
            {
                case 1:
                    System.out.println("Saliendo...Hasta pronto");
                    break;
                case 2:
                    System.out.println("Regresamos entonces");
                    break;
                default:
                    break;
            }

        } while (opc6 > 0 && opc6 < 2);
    }

    public static void IngresarMateriales()
    {
        obj1 = new Ingreso[]
        {
            new Ingreso()
        };

        for (int i = 0; i < obj1.length; i++)
        {
            obj1[i] = new Ingreso();
            System.out.println("----------------------");
            System.out.println("Ingreso de materiales");
            System.out.println("----------------------");
            System.out.println("Ingrese el nombre del producto:");
            obj1[i].setNombre(sc.next());
            System.out.println("Ingrese el numero de excistencias:");
            obj1[i].setExistencias(sc.next());
            System.out.println("Ingrese el tamaño en Centimetros:");
            obj1[i].setTamanioCM(sc.next());
            System.out.println("Ingrese la Marca:");
            obj1[i].setMarca(sc.next());
            System.out.println("Ingrese el precio:");
            obj1[i].setPrecio(sc.next());
            System.out.println("Ingrese el Color:");
            obj1[i].setColor(sc.next());
            System.out.println("Ingrese el codigo de barras:");
            obj1[i].setCodigoDeBarras(sc.next());

        }

        System.out.println("Mostrando...");
        System.out.println("Mostrando Existencias");

        for (int i = 0; i < obj1.length; i++)
        {
            System.out.println("Nombre del producto: " + obj1[i].getNombre());
            System.out.println("Numero de existencias: " + obj1[i].getExistencias());
            System.out.println("Tamaño del producto en cm: " + obj1[i].getTamanioCM());
            System.out.println("Marca del producto: " + obj1[i].getMarca());
            System.out.println("Precio del producto: " + obj1[i].getPrecio());
            System.out.println("Color del producto: " + obj1[i].getColor());
            System.out.println("Codigo de barras del producto: " + obj1[i].getCodigoDeBarras());
        }
    }

    public static void IngresarGanancia()
    {

        int op2 = 0;
        float l = 0, m = 0, mi = 0, ju = 0, vi = 0, sa = 0, dom = 0;
        do
        {

            obj2 = new Ganancia[]
            {
                new Ganancia(),
            };

            System.out.println("----------------------");
            System.out.println("Ingreso de ganancias");
            System.out.println("----------------------");
            System.out.println("Ingrese el dia:");
            System.out.println("1.-Lunes");
            System.out.println("2.-Martes");
            System.out.println("3.-Miercoles");
            System.out.println("4.-Jueves");
            System.out.println("5.-Viernes");
            System.out.println("6.-Sabado");
            System.out.println("7.-Domingo");
            System.out.println("8.-Ganancias semanales");
            System.out.println("9.-Ganancias mensuales");
            System.out.println("10.-Ganancias netas");
            System.out.println("11.-Regresar");
            op2 = sc.nextInt();
            for (int i = 0; i < obj2.length; i++)
            {
                obj2[i] = new Ganancia();
                switch (op2)
                {
                    case 1:
                        System.out.println("Introduzca el Ingreso:");
                        l = sc.nextFloat();
                        break;
                    case 2:
                        System.out.println("Introduzca el Ingreso:");
                        m = sc.nextFloat();
                        break;
                    case 3:
                        System.out.println("Introduzca el Ingreso:");
                        mi = sc.nextFloat();
                        break;
                    case 4:
                        System.out.println("Introduzca el Ingreso:");
                        ju = sc.nextFloat();
                        break;
                    case 5:
                        System.out.println("Introduzca el Ingreso:");
                        vi = sc.nextFloat();
                        break;
                    case 6:
                        System.out.println("Introduzca el Ingreso:");
                        sa = sc.nextFloat();
                        break;
                    case 7:
                        System.out.println("Introduzca el Ingreso:");
                        dom = sc.nextFloat();
                        break;
                    case 8:
                        System.out.println("Ingresos semanales");
//                        obj2[i].setGananciasSemana(sc.nextFloat());
//                        System.out.println("Ganancia semanal:" + obj2[i].getGananciasSemana());
                        break;
                    case 9:
                        float total5 = 0;
                        System.out.println("Ingresos mensuales");
                        float total6 = (total5 * 4);
//                        obj2[i].setGananciasMes(total6);
//                        System.out.println("Ganancias mensuales: " + obj2[i].getGananciasMes());
                        break;
                    case 10:
//                        System.out.println("Ganancias Netas");
//                        System.out.println("Desea calcular ganancia neta?");
//                        System.out.println("1.-si");
//                        System.out.println("2.-No");
//                        int op3 = sc.nextInt();
//                        if (op3 == 1)
//                        {
//                            float total7 = 0;
//                            System.out.println("Calculando ganancia total...");
//                            System.out.println("Cual es su gasto al mes?");
//                            total7 = sc.nextFloat();
//                            obj2[i].setTotalBruto(total7);
//                            System.out.println("Calculando...");
//                            float total4 = (total7 - obj2[i].getGananciasMes());
//                            obj2[i].setTotalNeto(total4);
//                            System.out.println("Ganancia neta: " + obj2[i].getTotalNeto());
//                        } else
//                        {
//                            System.out.println("Regresando");
//                            IngresarGanancia();
//                        }
                        break;
                    case 11:
                        System.out.println("Regresar");
                        System.out.println("Desea regresar?");
                        System.out.println("1.-si");
                        System.out.println("2.-No");
                        int opc10 = sc.nextInt();
                        switch (opc10)
                        {
                            case 1:
                                System.out.println("Regresando...");
                                break;
                            case 2:
                                System.out.println("Continuando...");
                                Menu();
                            default:
                                System.out.println("");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Error de dia");
                }

                //Suma de los ingresos de todos los dias de la semana por siete dias
                //Suma de cuatro semanas para ganancias mensuales
                System.out.println("Sumando ingresos...");
                float total3 = (l) + (m) + (mi) + (ju) + (vi) + (sa) + (dom);
                System.out.println("Totales de la semana: " + total3);
//                obj2[i].setIngreso(total3);
//                System.out.println("Ingreso total: " + obj2[i].getIngreso());

            }
        } while (op2 > 0 && op2 < 8);
    }

    public static void ModificarIngreso()
    {
        System.out.println("Modificando ingreso");
        int opc3 = 0;
        int opc4 = 0;
        System.out.println("Que desea modificar?");
        System.out.println("1.-Ingresos diarios");
        System.out.println("2.-salir");
        switch (opc3)
        {
            case 1:
//                System.out.println("Modificando ingresos");
//                System.out.println("Que deseas modificar de los ingresos?");
//                System.out.println("Dias de uno al siete");
//                for (int i = 0; i < obj2.length; i++)
//                {
//                    switch (opc4)
//                    {
//                        case 1:
//                            System.out.println("Lunes");
//                            System.out.println("Itroduzca el nuevo ingreso");
//                            obj2[i].setIngreso(sc.nextFloat());
//                            break;
//                        case 2:
//                            System.out.println("Martes");
//                            System.out.println("Itroduzca el nuevo ingreso");
//                            obj2[i].setIngreso(sc.nextFloat());
//                            break;
//                        case 3:
//                            System.out.println("Miercoles");
//                            System.out.println("Itroduzca el nuevo ingreso");
//                            obj2[i].setIngreso(sc.nextFloat());
//                            break;
//                        case 4:
//                            System.out.println("Jueves");
//                            System.out.println("Itroduzca el nuevo ingreso");
//                            obj2[i].setIngreso(sc.nextFloat());
//                            break;
//                        case 5:
//                            System.out.println("Viernes");
//                            System.out.println("Itroduzca el nuevo ingreso");
//                            obj2[i].setIngreso(sc.nextFloat());
//                            break;
//                        case 6:
//                            System.out.println("Sabado");
//                            System.out.println("Itroduzca el nuevo ingreso");
//                            obj2[i].setIngreso(sc.nextFloat());
//                            break;
//                        case 7:
//                            System.out.println("Domingo");
//                            System.out.println("Itroduzca el nuevo ingreso");
//                            obj2[i].setIngreso(sc.nextFloat());
//                            break;
//                        default:
//                            System.out.println("Error de dia");
//                            break;
//                    }
//                }
                break;

            case 2:
                System.out.println("Saliendo");

                break;
            default:
                System.out.println("Error con modificaciones");
                break;
        }
    }

    public static void ModificarExistencias()
    {
        obj1 = new Ingreso[]
        {
            new Ingreso()
        };
        System.out.println("Modificando existencia");
        System.out.println("Modificando Materiales");
        System.out.println("Que material quieres modificar?");
        System.out.println("Ingresa su codigo de barras");
        int opc10 = sc.nextInt();
        System.out.println("Cambiando...");
        //Comparar codigo de barras de producto a vambiar con variable

        for (int i = 0; i < obj1.length; i++)
        {
            obj1[i] = new Ingreso();
            System.out.println("----------------------");
            System.out.println("Ingreso de materiales");
            System.out.println("----------------------");
            System.out.println("Ingrese el nombre del producto:");
            obj1[i].setNombre(sc.next());
            System.out.println("Ingrese el numero de excistencias:");
            obj1[i].setExistencias(sc.next());
            System.out.println("Ingrese el tamaño en Centimetros:");
            obj1[i].setTamanioCM(sc.next());
            System.out.println("Ingrese la Marca:");
            obj1[i].setMarca(sc.next());
            System.out.println("Ingrese el precio:");
//            obj1[i].setPrecio(sc.nextFloat());
            System.out.println("Ingrese el Color:");
            obj1[i].setColor(sc.next());
            System.out.println("Ingrese el codigo de barras:");
            obj1[i].setCodigoDeBarras(sc.next());

        }
        System.out.println("Nuevo producto....");

        for (int i = 0; i < obj1.length; i++)
        {
            System.out.println("Nombre del producto: " + obj1[i].getNombre());
            System.out.println("Numero de existencias: " + obj1[i].getExistencias());
            System.out.println("Tamaño del producto en cm: " + obj1[i].getTamanioCM());
            System.out.println("Marca del producto: " + obj1[i].getMarca());
            System.out.println("Precio del producto: " + obj1[i].getPrecio());
            System.out.println("Color del producto: " + obj1[i].getColor());
            System.out.println("Codigo de barras del producto: " + obj1[i].getCodigoDeBarras());
        }
    }

    public static void Mostrar()
    {
        System.out.println("Mostrando Existencias");
        for (int i = 0; i < obj1.length; i++)
        {
            obj1[i] = new Ingreso();
            System.out.println("Nombre del producto: " + obj1[i].getNombre());
            System.out.println("Numero de existencias: " + obj1[i].getExistencias());
            System.out.println("Tamaño del producto en cm: " + obj1[i].getTamanioCM());
            System.out.println("Marca del producto: " + obj1[i].getMarca());
            System.out.println("Precio del producto: " + obj1[i].getPrecio());
            System.out.println("Color del producto: " + obj1[i].getColor());
            System.out.println("Codigo de barras del producto: " + obj1[i].getCodigoDeBarras());

        }
//        System.out.println("Mostrando Ingresos");
//        for (int i = 0; i < obj2.length; i++)
//        {
//            obj2[i] = new RegGanancias();
//            System.out.println("Ganancias semanales: " + obj2[i].getGananciasSemana());
//            System.out.println("Ganancias Mensuales: " + obj2[i].getGananciasMes());
//            System.out.println("--------------------------------------");
//        }

    }

    public static void Dudas()
    {
        int opc6 = 0;
//        System.out.println("En relacion a los tipos de errores que tenga el usuario");
//        System.out.println("Se eligira uno y se mostrara el porque del error");
        do
        {
            System.out.println("ingresando dudas");
            System.out.println("Que error obtuvo?");
            System.out.println("1.-Error de dia");
            System.out.println("2.-Error de opcion");
            System.out.println("3.-Error de duda");
            opc6 = sc.nextInt();
            switch (opc6)
            {
                case 1:
                    System.out.println("Selecciono un dia fuera del numero 7");
                    System.out.println("Solucion:");
                    System.out.println("Seleccione un numero entre 1 y 7");
                    break;
                case 2:
                    System.out.println("Selecciono una opcion fuera del rango");
                    System.out.println("Solucion");
                    System.out.println("Seleccione una opcion entre 1 y 8");
                    break;
                case 3:
                    System.out.println("Selecciono una opcion fuera del rango dudas");
                    System.out.println("solucion");
                    System.out.println("Seleccione una opcion entre 1 y tres");
                    break;
                default:
                    System.out.println("Error de duda");
                    break;
            }
        } while (opc6 > 0 && opc6 < 3);

    }

    public static int getOpc()
    {
        return opc;
    }

    public static void setOpc(int aOpc)
    {
        opc = aOpc;
    }

    public static Scanner getSc()
    {
        return sc;
    }

    public static void setSc(Scanner aSc)
    {
        sc = aSc;
    }

    public static Ingreso[] getObj1()
    {
        return obj1;
    }

    public static void setObj1(Ingreso[] aObj1)
    {
        obj1 = aObj1;
    }

    public static Ganancia[] getObj2()
    {
        return obj2;
    }

    public static void setObj2(Ganancia[] aObj2)
    {
        obj2 = aObj2;
    }

    public static Cuenta[] getObj3()
    {
        return obj3;
    }

    public static void setObj3(Cuenta[] aObj3)
    {
        obj3 = aObj3;
    }
}
