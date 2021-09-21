package domain.book

class BookId(val value: String) {

  def canEqual(other: Any): Boolean = other.isInstanceOf[BookId]

  override def equals(other: Any): Boolean = other match {
    case that: BookId =>
      (that canEqual this) &&
        value == that.value
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(value)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }

  override def toString = s"BookId($value)"
}
