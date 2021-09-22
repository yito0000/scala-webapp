package api

import model.Book
import model.Tag
import model.User
import service.BookService

import javax.inject.Inject

/** Provides a default implementation for [[DefaultApi]].
  */
@javax.annotation.Generated(
  value =
    Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"),
  date = "2021-09-22T20:13:22.087650+09:00[Asia/Tokyo]"
)
class DefaultApiImpl extends DefaultApi {

  /** @inheritdoc
    */
  override def booksBookIdDelete(bookId: Long, apiKey: Option[String]): Unit = {
    // TODO: Implement better logic

  }

  /** @inheritdoc
    */
  override def booksBookIdGet(bookId: Long): Book = {
    // TODO: Implement better logic

    Book("", "", "", List())
  }

  /** @inheritdoc
    */
  override def booksFindByTagsGet(tags: List[String]): List[Book] = {
    // TODO: Implement better logic

    List.empty[Book]
  }

  /** @inheritdoc
    */
  override def booksGet(): List[Book] = {
//    bookService.fetchAll() map (entity =>
//      new Book(
//        entity.id.value,
//        entity.title.value,
//        entity.author.value,
//        entity.tags map (tag => new Tag(tag.value))
//      )
//    )
    List()
  }

  /** @inheritdoc
    */
  override def booksPost(book: Book): Unit = {
    // TODO: Implement better logic

  }

  /** @inheritdoc
    */
  override def booksPut(book: Book): Unit = {
    // TODO: Implement better logic

  }

  /** @inheritdoc
    */
  override def tagsGet(): List[Tag] = {
    // TODO: Implement better logic

    List.empty[Tag]
  }

  /** @inheritdoc
    */
  override def usersGet(): User = {
    // TODO: Implement better logic

    User(None, "", "", "", "", "")
  }

  /** @inheritdoc
    */
  override def usersLoginGet(username: String, password: String): Unit = {
    // TODO: Implement better logic

  }

  /** @inheritdoc
    */
  override def usersLogoutGet(): Unit = {
    // TODO: Implement better logic

  }

  /** @inheritdoc
    */
  override def usersPost(user: User): Unit = {
    // TODO: Implement better logic

  }

  /** @inheritdoc
    */
  override def usersUsernameDelete(username: String): Unit = {
    // TODO: Implement better logic

  }

  /** @inheritdoc
    */
  override def usersUsernameGet(username: String): User = {
    // TODO: Implement better logic

    User(None, "", "", "", "", "")
  }

  /** @inheritdoc
    */
  override def usersUsernamePut(username: String, user: User): Unit = {
    // TODO: Implement better logic

  }
}
