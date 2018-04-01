public class Bateria {

    private int carga;

    public void descarregar(){
        if (carga >0)
            carga = carga - 10;

    }

    public void carregar(){
        if (carga < 100)
            carga = carga + 5;

    }
}
