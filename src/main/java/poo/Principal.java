package poo;

public class Principal {
    public static void main(String[] args) {
        Dimensao dimensao = new Dimensao(10,20,30);
        Telefone telefone = new Telefone(3234, "NS4532","comercial", 102.4f,dimensao);
        SemFio semFio = new SemFio(5342,"NS67345","atualizado",63.4f,new Dimensao(15,8,4),4,3,6);
        Telefone vetor[] = new Telefone[3];

        vetor[0] = new Telefone(4738,"NS39485","fixo",98.3f,new Dimensao(30,4,1));
        vetor[1] = new SemFio(3928,"NS93840","SemFioCasa",87.2f,new Dimensao(10,2,3),50,3,23.4);
        vetor[2] = new Celular(8939,"NS73812","SemFio",89.3f, new Dimensao(7,4,3),78,2,54,"Android");

        System.out.println(telefone);
        System.out.println(semFio);

        telefone.imprimirDados();
        semFio.imprimirDados(); // a classe SemFio herda da classe Telefone o método imprimirDados.

        semFio.setNumSerie("NS89764");

        System.out.println(semFio);

        for (int i = 0; i < 3; i++){
            if (vetor[i] instanceof Celular){ // instanceof é para verificar se existe uma instância (vetor[i] da classe Celular.
                Celular celular = (Celular) vetor[i];
            }
        }

        ((SemFio) vetor[1]).setFrequencia(32);
    }
}
