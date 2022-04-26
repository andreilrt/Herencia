package herencia;

public class VolumenEsfera extends AreaCirculo {

    public VolumenEsfera() {
        super();
    }

    public double CalcularVolumenEsfera() {
        double Resultado = 4 * (super.CalcularArea()) / 3;
        return Resultado;
    }

    public void MostrarVolumenEsfera(double VolumenEsfera) {
        System.out.println("El volumen de su esfera es: " + VolumenEsfera);
    }
}
