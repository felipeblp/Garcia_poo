object Tel {
  def main(args: Array[String]): Unit = {
    val B = new Bateria
    val C = new Celular
    C.numero_identificacao = 998989898
    C.nome_usuario = Eu
    C.ligar()
  }
}
