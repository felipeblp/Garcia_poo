class Bateria {
  var carga = 0

  def descarregar(): Unit = {
    if (carga > 0) carga = carga - 10
  }

  def carregar(): Unit = {
    if (carga < 100) carga = carga + 5
  }
}
