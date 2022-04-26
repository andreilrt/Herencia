package herencia;

public class VolumenCono extends VolumenCilindro {

    public VolumenCono() {
        super();
    }

    public double CalcularVolumenCono() {
        double Resultado = (super.CalcularVolumenCilindro()) / 3;
        return Resultado;
    }

    public void MostrarVolumenCono(double VolumenCono) {
        System.out.println("El volumen de su cono es: " + VolumenCono);
    }
}
