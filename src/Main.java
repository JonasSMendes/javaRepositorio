// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import animais.cachorro;
import animais.gato;
import animais.passaro;
import lojas.petShop;
import animais.animal;
import lutadores.Lutador;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {



        animal cachorro1 = new cachorro("nami", "marrom", 25, 5.5, 5, "nada");

        animal gato1 = new gato("luffy", "preto", 5.4);

        animal passaro1 = new passaro("piupiu", "azul", 0.5);


        petShop petshop1 = new petShop();

        petshop1.banho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

        petshop1.banho(gato1);
        System.out.println(gato1.getEstadoDeEspirito());

        petshop1.deixaNoHotel(passaro1);
        System.out.println(passaro1.getEstadoDeEspirito());



        cachorro1.soar();
        gato1.soar();
        passaro1.soar();


//        cachorro1.setNome("luffy");
//        cachorro1.setCor("amarelo");
//        cachorro1.setAltura(27);
//        cachorro1.setPeso(5.5);
//        cachorro1.setTamanhoDoRabo(5);
/*
        System.out.println(cachorro1.getNome());
        System.out.println(cachorro1.getPeso());

        cachorro1.latir();
        cachorro1.pegar();

        System.out.println( "o cachorro pegou a " + cachorro1.pegar());
        System.out.println("o cachorro está " + cachorro1.interativo("vai dormir"));
        System.out.println("o cachorro está " + cachorro1.interativo("pisar"));
        System.out.println("o cachorro está " + cachorro1.interativo("carinho"));
*/
/*
        Lutador lutadorBox = new Lutador();
        Lutador lutadorJudo = new Lutador();

        lutadorBox.nome = "pedro";
        lutadorBox.forca = 80;
        lutadorBox.resistencia = 70;

        lutadorJudo.nome = "amarildo";
        lutadorJudo.forca = 50;
        lutadorJudo.resistencia = 90;

        if (lutadorJudo.forca > lutadorBox.resistencia){
            System.out.println("ganhou");
        }else {
            System.out.println( lutadorJudo.forca -  lutadorBox.resistencia );
        }

*/


    }


}