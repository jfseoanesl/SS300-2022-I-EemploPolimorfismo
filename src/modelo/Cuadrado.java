package modelo;

public class Cuadrado extends FiguraGeometrica {
    private double lado;

    public Cuadrado(double lado) {
        super();
        this.lado = lado;
    }

    public Cuadrado() {
    }

    /**
     * @return the lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
       return this.lado * this.lado;
    }

    @Override
    public double getPerimetro() {
        return 4 * this.lado;
    }
    
    
}
