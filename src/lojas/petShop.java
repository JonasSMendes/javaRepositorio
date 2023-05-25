package lojas;

import animais.animal;
import animais.cachorro;

public class petShop {

    public void tosar(cachorro cachorro){
        cachorro.setEstadoDeEspirito("com frio");
    }
    public void banho(animal animal){
        animal.setEstadoDeEspirito("molhados");
    }

    public void deixaNoHotel(animal animal){
        animal.setEstadoDeEspirito("saudade");
    }
}
