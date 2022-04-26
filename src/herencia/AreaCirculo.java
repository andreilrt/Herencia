package herencia;

import java.util.Scanner;

public class AreaCirculo {

    private double Radio;

    public AreaCirculo() {
        Radio = 0;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    public double getRadio() {
        return this.Radio;
    }

    public double PedirRadio() {
        Scanner Input = new Scanner(System.in);
        double R = 0;
        while (R <= 0) {
            System.out.print("Digite su radio: ");
            R = Input.nextDouble();
            if (R <= 0) {
                System.out.println("***Digite un radio valido***");
            }
        }
        return R;
    }

    public double CalcularArea() {
        this.setRadio(this.PedirRadio());
        return Math.PI * this.getRadio() * this.getRadio();
    }

    public void MostrarAreaCirculo(double Area) {
        System.out.println("El Area de su circulo es: " + Area);
    }

    public double CalcularVolumenCilindro() {
        return 0;
    }

    public void MostrarVolumenCilindro(double V) {

    }

    public double CalcularVolumenEsfera() {
        return 0;
    }

    public void MostrarVolumenEsfera(double V) {

    }

    public double CalcularVolumenCono() {
        return 0;
    }

    public void MostrarVolumenCono(double V) {

    }
}
