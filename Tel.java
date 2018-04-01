public class Tel {
    public static void main(String[] args) {
        Bateria b = new Bateria();
        Celular c = new Celular();

        c.numero_identificacao = "998989898";
        c.nome_usuario = "Eu";

        c.ligar();
        c.tocarsom();
        c.desligar();

    }
}
