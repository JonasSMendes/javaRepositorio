package animais;

public class gato extends animal {
    // atributos

    static int numeroDeGato;

    //construtores

    public gato(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    //metodos

    @Override
    public String toString() {
        return "gato{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("miauu miauu");
    }
}
