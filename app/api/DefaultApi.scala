package api

import play.api.libs.json._
import model.Book
import model.Tag
import model.User

@javax.annotation.Generated(
  value =
    Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"),
  date = "2021-09-23T01:43:18.946563+09:00[Asia/Tokyo]"
)
trait DefaultApi {

  /** 書籍削除API
    * @param bookId
    *   書籍ID
    */
  def booksBookIdDelete(bookId: Long, apiKey: Option[String]): Unit

  /** 書籍詳細取得API IDに紐づく書籍を取得します
    * @param bookId
    *   書籍ID
    */
  def booksBookIdGet(bookId: Long): Book

  /** タグ絞り込み検索API 指定した複数タグのいずれかを含む書籍リストを取得します
    */
  def booksFindByTagsGet(tags: List[String]): List[Book]

  /** 書籍一覧取得API 参照可能な書籍リストを取得します
    */
  def booksGet(): List[Book]

  /** 書籍登録API
    * @param book
    *   新しい書籍を登録する
    */
  def booksPost(book: Book): Unit

  /** 書籍更新API
    * @param book
    *   書籍情報を更新します
    */
  def booksPut(book: Book): Unit

  /** タグ一覧取得API タグリストを取得します
    */
  def tagsGet(): List[Tag]

  /** ユーザー一覧取得API ログイン可能なユーザーリストを取得します
    */
  def usersGet(): User

  /** ログインAPI
    * @param username
    *   ユーザー名
    * @param password
    *   パスワード
    */
  def usersLoginGet(username: String, password: String): Unit

  /** ログアウトAPI
    */
  def usersLogoutGet(): Unit

  /** ユーザー登録API 書籍管理するユーザーを登録します
    * @param user
    *   ユーザー情報
    */
  def usersPost(user: User): Unit

  /** ユーザー削除API 指定したユーザーを削除します
    * @param username
    *   ユーザー名
    */
  def usersUsernameDelete(username: String): Unit

  /** ユーザー詳細取得APi
    * @param username
    *   ユーザー名
    */
  def usersUsernameGet(username: String): User

  /** ユーザー更新API ユーザー情報を更新します
    * @param username
    *   ユーザー名
    */
  def usersUsernamePut(username: String, user: User): Unit
}
