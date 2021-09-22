package model

import play.api.libs.json._

/** Represents the Swagger definition for Book.
  * @param id
  *   書籍ID
  * @param title
  *   タイトル
  * @param author
  *   著者
  */
@javax.annotation.Generated(
  value =
    Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"),
  date = "2021-09-22T20:13:22.087650+09:00[Asia/Tokyo]"
)
case class Book(
    id: String,
    title: String,
    author: String,
    tags: List[Tag]
)

object Book {
  implicit lazy val bookJsonFormat: Format[Book] = Json.format[Book]
}
