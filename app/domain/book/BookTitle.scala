package domain.book

class BookTitle(val value: String) {

  require(value != "")

  def canEqual(other: Any): Boolean = other.isInstanceOf[BookTitle]

  override def equals(other: Any): Boolean = other match {
    case that: BookTitle =>
      (that canEqual this) &&
        value == that.value
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(value)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }

  override def toString = s"BookTitle($value)"
}
