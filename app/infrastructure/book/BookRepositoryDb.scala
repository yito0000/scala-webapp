package infrastructure.book

import anorm.SQL
import anorm.SqlParser.str
import domain.book._
import infrastructure.book.dto.BookRecord
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
      tag <- str("tag")
    } yield new BookRecord(id, title, author, tag)

    val records = db.withConnection { implicit c =>
      SQL("""
          |SELECT
          |  book.id AS id,
          |  book.title AS title,
          |  book.author AS author,
          |  tag.name as tag
          |FROM book LEFT JOIN tag ON book.id = tag.book_id
          |""".stripMargin).as(parser *)
    }

    val ids = records map (_.id) distinct

    ids map (id => {
      val filteredId = records filter (record => id == record.id)
      new BookEntity(
        new BookId(id),
        new BookTitle(filteredId(0).title),
        new BookAuthor(filteredId(0).author),
        filteredId map (record => new BookTag(record.tag))
      )
    })

  }

  override def findById(id: BookId): BookEntity = ???
}
