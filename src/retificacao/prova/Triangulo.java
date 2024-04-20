package retificacao.prova;

public class Triangulo extends BaseFigura implements IComum {
    
    private double base;
    private double altura;
    
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
    }

    @Override
    public String toString() {
        return "Triangulo [cor=" + cor + ", base=" + base + ", altura=" + altura + "]";
    }

    @Override
    public double getArea() {
       return base * altura;
    }

}