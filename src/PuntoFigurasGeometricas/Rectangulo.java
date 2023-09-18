
package PuntoFigurasGeometricas;


public class Rectangulo {

    public int base;
    public int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return this.base * this.altura;
    }

    public double calcularPerímetro() {
        return (2 * this.base) + (2 * this.altura);
    }
}
