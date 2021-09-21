package infrastructure.book

import domain.book.BookEntityFixture
import support.DatabaseTestSpec

class BookRepositoryDbTest extends DatabaseTestSpec {

  private val sut = new BookRepositoryDb(database)

  "BookRepositoryDb#fetchAll" must {
    "Book table records fetch all" in {
      val actual = sut.fetchAll()
      val expected = BookEntityFixture.bookAll()
      assertResult(expected) { actual }
    }
  }

}
