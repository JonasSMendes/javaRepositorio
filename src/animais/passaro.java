package animais;

public class passaro extends animal {

    //atributos

    static int numeroDePassaros;


    //construtor

    public passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    //metodos


    @Override
    public void soar() {
        System.out.println("piu piuuu");
    }
}
