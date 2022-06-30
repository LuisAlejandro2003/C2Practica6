import models.Lectura;
import models.Procesos;
import models.Salida;

public class Principal {
    public static void main(String[] args) {
        Lectura lectura = new Lectura();
        lectura.pedirOpcion();
        Procesos procesos = new Procesos();
        double lado1 = procesos.calcularLado1(lectura.vertice1X,lectura.vertice1Y , lectura.vertice2X , lectura.vertice2Y);
        double lado2 = procesos.calcularLado2(lectura.vertice2X,lectura.vertice2Y , lectura.vertice3X , lectura.vertice3Y);
        double lado3 = procesos.calcularLado3(lectura.vertice3X,lectura.vertice3Y , lectura.vertice4X , lectura.vertice4Y);
        double lado4 = procesos.calcularLado4(lectura.vertice4X,lectura.vertice4Y , lectura.vertice1X , lectura.vertice1Y);

        double perimetro1= procesos.perimetro1(lado1 , lado2 , lado3 , lado4);

        Salida salida = new Salida();
        salida.imprimirPerimetro1(perimetro1);


    }
}
