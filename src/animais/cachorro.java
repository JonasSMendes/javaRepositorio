package animais;
public class cachorro extends animal {

    //atributos

    static int numeroDeCachorros;

   private int tamanhoDoRabo;

    //construtores adicionados
    public cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        super(nome,cor,peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeCachorros++;
    }

    //metodos


    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public String getNome(){
       return this.nome;
   }
   public void setNome(String nome){
       if (nome.equals("plinio")){
           this.nome = null;
       }
       this.nome = nome;
   }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }





   public String pegar(){
       return "bolinha";
   }




   public String interativo(String acao){

       switch (acao){
           case "carinho" : this.estadoDeEspirito = "feliz";
                break;
           case "vai dormir" : this.estadoDeEspirito = "bravo";
               break;
           case "pisar" : this.estadoDeEspirito = "triste";
               break;
           default: this.estadoDeEspirito = "neutro";

       }

//    if (acao.equals("carinho")){
//       this.estadoDeEspirito = "feliz";
//    }else if (acao.equals(("vai dormir"))){
//       this.estadoDeEspirito = "bravo";
//    }else {
//        this.estadoDeEspirito = "neutro";
//    }
         return estadoDeEspirito;
   }

    @Override
    public String toString() {
        return "cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
    @Override
    public void soar() {
        System.out.println("au au au");
    }
}
