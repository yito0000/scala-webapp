package infrastructure.book

import anorm.SQL
import anorm.SqlParser.str
import domain.book._
import play.api.db.Database

import javax.inject.{Inject, Singleton}

@Singleton
class BookRepositoryDb @Inject() (private val db: Database)
    extends BookRepository {

  override def fetchAll(): List[BookEntity] = {

    val parser = for {
      id <- str("id")
      title <- str("title")
      author <- str("author")
    } yield new BookEntity(
      new BookId(id),
      new BookTitle(title),
      new BookAuthor(author),
      List()
    )

    val bookList: List[BookEntity] = {
      db.withConnection { implicit c =>
        SQL("""
           |SELECT id, title, author
           |FROM book
           |""".stripMargin).as(parser *)
      }
    }

    bookList
  }
}
