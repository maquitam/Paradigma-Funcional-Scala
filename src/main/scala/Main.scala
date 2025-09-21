object Main extends App {
  // Declaracion de la clase Actividad
  case class Actividad(usuario: String, tipo: String, duracionMin: Int, calorias: Int, dia: String)

  // Lista de actividades de ejemplo
  val actividades = List(
    Actividad("Juan", "Correr", 30, 300, "Lunes"),
    Actividad("Juan", "Natación", 45, 400, "Miércoles"),
    Actividad("Ana", "Ciclismo", 60, 500, "Martes")
  )

  // Obtiene las actividades por usuario y las retorna como una lista
  def actividadesPorUsuario(usuario: String, actividades: List[Actividad]) : List[Actividad] = {
    actividades.filter(_.usuario == usuario)
  }

  // Esta funcion obtiene las calorias del usuario y retorna el total de calorias por usuario
  def totalCalorias(usuario: String, actividades: List[Actividad]) : Int = {
    actividadesPorUsuario(usuario, actividades)
      .map(_.calorias)
      .sum
  }

  // Devuelve el total del tiempo de ejercicio de un usuario en minutos
  def totalTiempo(usuario: String, actividades: List[Actividad]): Int = {
    actividadesPorUsuario(usuario, actividades)
    .map(_.duracionMin)
    .sum
  }
}
