/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoFigurasGeometricas;

/**
 *
 * @author usuario
 */
public class Circulo {

    public int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    double calcularPerímetro() {
        return 2 * Math.PI * this.radio;
    }
}
