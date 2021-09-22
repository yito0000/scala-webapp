package service
import domain.book.{BookEntity, BookRepository}

import javax.inject.{Inject, Singleton}

@Singleton
class BookServiceImpl @Inject() (private val bookRepository: BookRepository)
    extends BookService {
  override def fetchAll(): List[BookEntity] = {
    bookRepository.fetchAll()
  }
}
