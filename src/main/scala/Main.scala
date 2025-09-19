object Main extends App {
  // Declaracion de la clase Actividad
  case class Actividad(usuario: String, tipo: String, duracionMin: Int, calorias: Int, dia: String)

  // Lista de actividades de ejemplo
  val actividades = List(
    Actividad("Juan", "Correr", 30, 300, "Lunes"),
    Actividad("Juan", "Natación", 45, 400, "Miércoles"),
    Actividad("Ana", "Ciclismo", 60, 500, "Martes")
  )

  println(actividades)

  // Obtiene las actividades por usuario y las retorna como una lista
  def actividadesPorUsuario(usuario: String, actividades: List[Actividad]) : List[Actividad] = {
    actividades.filter(_.usuario == usuario)
  }

  println(actividadesPorUsuario("Ana", actividades))
}
