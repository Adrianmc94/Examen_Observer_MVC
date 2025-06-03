public class Coche {
    String modelo;
    String matricula;
    Integer velocidad;
    double gasolina;
    double distancia;

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.gasolina = 50.0;
        this.velocidad = 0;
        this.matricula = matricula;
        this.distancia = 0;
    }

    public void repostar(double litros) {
        this.gasolina += litros;
    }

    public void avanzar(int metros) {
        this.distancia += metros;

        double consumo = metros * 0.0001; // 1 litro por cada 10 km

        if (this.gasolina >= consumo) {
            this.distancia += metros;
            this.gasolina -= consumo;
        }
    }
}


