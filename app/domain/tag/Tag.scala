package domain.tag

class Tag(val value: String) {
  require(value != "")

  def canEqual(other: Any): Boolean = other.isInstanceOf[Tag]

  override def equals(other: Any): Boolean = other match {
    case that: Tag =>
      (that canEqual this) &&
        value == that.value
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(value)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}
