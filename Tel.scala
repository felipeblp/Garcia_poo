object Tel {
  def main(args: Array[String]): Unit = {
    val b = new Bateria
    val c = new Celular
    c.numero_identificacao = 998989898
    c.nome_usuario = Eu
    c.ligar()
    c.tocarsom()
    c.desligar()
  }
}
