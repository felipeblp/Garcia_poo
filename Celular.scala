class Celular {
  val numero_identificacao: Nothing = null
  val nome_usuario: String = null
  var ligado = false
  val bateria = true

  def ligar(): Unit = {
    if (ligado) {
      ligado = true
      if ((carga ne 0) && bateria) {
        System.out.println("Olá " + numero_identificacao + nome_usuario)
        if (carga > 20) carga = carga - 20
        else System.out.println("Bateria fraca")
      }
    }
  }

  def desligar(): Unit = {
    if (ligado) {
      ligado = false
      if ((carga ne 0) && bateria) {
        System.out.println("Tchau " + nome_usuario)
        carga = carga - 10
      }
    }
  }

  def tocarsom(): Unit = {
    If(ligado = true && carga > 10)
    System.out.println("Tocando Som")
  }

  def estadocelular(): Unit = {
    If(ligado)
    System.out.printl("Celular Ligado")
    System.out.printl("Celular Desligado")
  }
}

