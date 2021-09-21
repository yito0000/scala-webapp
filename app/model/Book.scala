package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Book.
  * @param id 書籍ID
  * @param title タイトル
  * @param author 著者
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-09-18T23:42:37.917390+09:00[Asia/Tokyo]")
case class Book(
  id: Option[Long],
  title: String,
  author: String,
  tags: Option[List[Tag]]
)

object Book {
  implicit lazy val bookJsonFormat: Format[Book] = Json.format[Book]
}

