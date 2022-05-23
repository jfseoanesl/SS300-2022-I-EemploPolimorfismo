package modelo;

//representa un triangulo equilatero
public class Triangulo extends FiguraGeometrica {
    
    private double base, altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return this.base * this.altura / 2;
    }

    @Override
    public double getPerimetro() {
        return 3 * this.base;
    }
    
    
}
