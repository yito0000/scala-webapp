package domain.book

import domain.tag.Tag

class BookEntity(
    val id: BookId,
    val title: BookTitle,
    val author: BookAuthor,
    val tags: List[Tag]
) {

  def canEqual(other: Any): Boolean = other.isInstanceOf[BookEntity]

  override def equals(other: Any): Boolean = other match {
    case that: BookEntity =>
      (that canEqual this) &&
        id == that.id &&
        title == that.title &&
        author == that.author &&
        tags == that.tags
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(id, title, author, tags)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }

  override def toString = s"BookEntity($id, $title, $author, $tags)"
}
