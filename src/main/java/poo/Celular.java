package poo;

public class Celular extends SemFio{
    private String sistemaOperacional;

    public Celular(int codigo, String numSerie, String modelo, float peso, Dimensao dimensao, double frequencia, int canais, double distancia, String sistemaOperacional) {
        super(codigo, numSerie, modelo, peso, dimensao, frequencia, canais, distancia);
        this.sistemaOperacional = sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String toString() {
        return super.toString() + "Celular{" +
                "sistemaOperacional='" + sistemaOperacional + '\'' +
                '}';
    }
}
