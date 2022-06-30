package models;
public class Procesos {
    public  double calcularLado1( double ejex1 ,  double ejey1 , double ejex2 ,  double ejey2){
        double resultado1=0;
        resultado1 = Math.sqrt(Math.pow((ejex2 + ejex1),2)+Math.pow((ejey2 + ejey1),2));
        return resultado1;
    }
    public  double calcularLado2( double ejex2 ,  double ejey2 , double ejex3 ,  double ejey3){
        double resultado2=0;
        resultado2 = Math.sqrt(Math.pow((ejex2 + ejex3),2)+Math.pow((ejey2 + ejey3),2));
        return resultado2;
    }
    public  double calcularLado3( double ejex3 ,  double ejey3 , double ejex4 ,  double ejey4){
        double resultado3=0;
        resultado3 = Math.sqrt(Math.pow((ejex3 + ejex4),2)+Math.pow((ejey3 + ejey4),2));
        return resultado3;
    }
    public  double calcularLado4( double ejex4 ,  double ejey4 , double ejex1 ,  double ejey1){
        double resultado4=0;
        resultado4 = Math.sqrt(Math.pow((ejex4 + ejex1),2)+Math.pow((ejey4 + ejey1),2));
        return resultado4;
    }

    public double perimetro1(double lado1 , double lado2 ,double lado3 , double lado4){
        double perimetro1=0;
      perimetro1= lado1+ lado2 + lado3 + lado4;
        return perimetro1;
    }
}
