package domain.book

trait BookRepository {
  def fetchAll(): List[BookEntity]

  def findById(id: BookId): BookEntity
}
