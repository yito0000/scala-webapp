package domain.book

object BookEntityFixture {

  private implicit def stringToBookId(value: String) = new BookId(value)
  private implicit def stringToBookTitle(value: String) = new BookTitle(value)
  private implicit def stringToBookAuthor(value: String) = new BookAuthor(value)

  def bookAll(): List[BookEntity] = {
    List(
      new BookEntity(
        "F080FDEC-694A-4435-907D-2705D7350080",
        "title 1",
        "author 1",
        List()
      ),
      new BookEntity(
        "50108F3F-3F13-4575-A28D-5FE0AF52DBBA",
        "title 2",
        "author 2",
        List()
      ),
      new BookEntity(
        "7F5D6BC2-41F1-4B0D-82F4-A3A894194315",
        "title 3",
        "author 3",
        List()
      )
    )
  }
}
