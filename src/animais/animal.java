package animais;

public class animal {
//atributos
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

    //construtor

    public animal(String nome, String cor,double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }

    //metodos
   protected void comer(){}

   protected void  dormir(){}

   public void soar(){
        System.out.println("cricri");
    }
}
