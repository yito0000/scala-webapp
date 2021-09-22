package service

import com.google.inject.ImplementedBy
import domain.book.BookEntity

@ImplementedBy(classOf[BookServiceImpl])
trait BookService {

  def fetchAll(): List[BookEntity]
}
