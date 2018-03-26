public class Celular {

    Int numero_identificacao;
    String nome_usuario;
    boolean ligado = false;
    boolean bateria = true;

    void ligar(){
        if (ligado) {
            ligado = true;
            if (carga !=0 && bateria) {
                System.out.println("Olá " + numero_identificacao + nome_usuario)
                if (carga > 20)
                    carga = carga - 20;
                else
                    System.out.println("Bateria fraca");
            }
        }
    }

    void desligar() {
        if (ligado) {
            ligado = false;
            if (carga != 0 && bateria) {
                System.out.println("Tchau " + nome_usuario);
                carga = carga - 10;

            }
        }
    }

    void tocarsom(){
        If (ligado = true && carga >10)
        System.out.println("Tocando Som");
    }

    void estadocelular(){
        If (ligado)
        System.out.printl("Celular Ligado");
    else
        System.out.printl("Celular Desligado");

    }
}
