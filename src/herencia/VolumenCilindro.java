package herencia;

import java.util.Scanner;

public class VolumenCilindro extends VolumenEsfera {

    private double Altura;

    public VolumenCilindro() {
        super();
        Altura = 0;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double PedirAltura() {
        Scanner Input = new Scanner(System.in);
        double H = 0;
        while (H <= 0) {
            System.out.print("Digite su Altura: ");
            H = Input.nextDouble();
            if (H <= 0) {
                System.out.println("***Digite una altura válida***");
            }
        }
        return H;
    }

    public double CalcularVolumenCilindro() {
        double Resultado = super.CalcularArea();
        this.setAltura(this.PedirAltura());
        Resultado = Resultado * this.getAltura();
        return Resultado;
    }

    public void MostrarVolumenCilindro(double VolumenCilindro) {
        System.out.println("El volumen de su cilindro es: " + VolumenCilindro);
    }
}
