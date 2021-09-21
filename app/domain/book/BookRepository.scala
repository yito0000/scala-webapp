package domain.book

trait BookRepository {
  def fetchAll(): List[BookEntity]
}
