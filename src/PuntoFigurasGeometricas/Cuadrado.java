
package PuntoFigurasGeometricas;


public class Cuadrado {

    public int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return this.lado * this.lado;
    }

    public double calcularPerímetro() {
        return (4 * this.lado);
    }
}
