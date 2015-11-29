package spatutorial.shared

import monocle.macros.Lenses
import boopickle.Default._

sealed trait TodoPriority

case object TodoLow extends TodoPriority

case object TodoNormal extends TodoPriority

case object TodoHigh extends TodoPriority

@Lenses
case class TodoItem(id: String, timeStamp: Int, content: String, priority: TodoPriority, completed: Boolean)

object TodoPriority {
  implicit val todoPriorityPickler: Pickler[TodoPriority] = generatePickler[TodoPriority]
}
