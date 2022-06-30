package models;

import javax.swing.*;
import java.util.Scanner;

public class Lectura {
    Scanner teclado = new Scanner(System.in);
    public  double vertice1X=0;
    public  double vertice1Y=0;
    public  double vertice2X=2;
    public  double vertice2Y=0;
    public  double vertice3X=2;
    public  double vertice3Y=2;
    public  double vertice4X=0;
    public  double vertice4Y=2;

    public void pedirOpcion(){
        //JOptionPane.showInputDialog(null , "Estos son los valores de los vertices: " +"("+vertice1X+","+vertice1Y+")"+"("+vertice2X+","+vertice2Y+")"+"("+vertice3X+","+vertice3Y+")"+"("+vertice4X+","+vertice4Y+")");
       vertice1X= Integer.parseInt(JOptionPane.showInputDialog(null , "Vertice 1X"));
        System.out.println("Vertice 1X");
        vertice1X=teclado.nextDouble();

        System.out.println("Vertice 1Y");
        vertice1Y=teclado.nextDouble();

        System.out.println("Vertice 2X");
        vertice2X=teclado.nextDouble();

        System.out.println("Vertice 2Y");
        vertice2Y=teclado.nextDouble();

        System.out.println("Vertice 3X");
        vertice3X=teclado.nextDouble();

        System.out.println("Vertice 3Y");
        vertice3Y=teclado.nextDouble();

        System.out.println("Vertice 4X");
        vertice4X=teclado.nextDouble();

        System.out.println("Vertice 4Y");
        vertice4Y=teclado.nextDouble();


    }

}
