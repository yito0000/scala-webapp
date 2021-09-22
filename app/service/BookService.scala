package service

import domain.book.BookEntity

trait BookService {

  def fetchAll(): List[BookEntity]
}
