public class Bateria {

    int carga;

    void descarregar(){
        if (carga >0)
            carga = carga - 10;

    }

    void carregar(){
        if (carga < 100)
            carga = carga + 5;

    }
}
