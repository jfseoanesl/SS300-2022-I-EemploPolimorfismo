package modelo;

public abstract class FiguraGeometrica {
    
    public FiguraGeometrica(){}
    
    public abstract double getArea();
    public abstract double getPerimetro();
    
    public double calcularArea(){
        return this.getArea();
    }
    
    public double calcularPerimetro(){
        return this.getPerimetro();
    }
}
