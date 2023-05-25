package animais;
public class cachorro {

    //atributos

   private String nome;
   private String cor;
   private int altura;
   private double peso;
   private int tamanhoDoRabo;
   private String estadoDeEspirito;

   //construtores
    public cachorro(){}

    //construtores adicionados
    public cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;
    }

    //metodos
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

    public void comer(){};

   public void latir(){
       System.out.println("au au au au");
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


}
