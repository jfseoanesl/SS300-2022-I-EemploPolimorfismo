package vista;

import java.util.ArrayList;
import modelo.*;

public class PruebaPolimorfismo {
    public static void main(String[] args) {
        
        ArrayList<FiguraGeometrica>listaFiguras = new ArrayList();
        
        FiguraGeometrica figura=new Cuadrado(20);
        listaFiguras.add(figura);
        
        listaFiguras.add(new Triangulo(30,20));
        
        for(FiguraGeometrica f: listaFiguras){
            imprimirFigura(f);
        }
        
    }
    
    public static void imprimirFigura(FiguraGeometrica figura){
        System.out.println("Area: " + figura.calcularArea());
        System.out.println("Perimetro: " + figura.calcularPerimetro());
        System.out.println("--------------------------------/n");
        
    }
}
