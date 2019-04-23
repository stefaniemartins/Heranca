package poo;

public class Telefone {

    private int codigo;
    private String numSerie, modelo;
    private float peso;
    private Dimensao dimensao;

    public Telefone(int codigo, String numSerie, String modelo, float peso, Dimensao dimensao) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dimensao = dimensao;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public void imprimirDados(){
        System.out.println("Código: " + this.codigo);
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "codigo=" + codigo +
                ", numSerie='" + numSerie + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", dimensao=" + dimensao +
                '}';
    }
}
