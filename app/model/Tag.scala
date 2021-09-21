package model

import play.api.libs.json._

/** Represents the Swagger definition for Tag.
  * @param id
  *   タグID
  * @param name
  *   タグ名
  */
@javax.annotation.Generated(
  value =
    Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"),
  date = "2021-09-18T23:42:37.917390+09:00[Asia/Tokyo]"
)
case class Tag(
    id: Option[Long],
    name: Option[String]
)

object Tag {
  implicit lazy val tagJsonFormat: Format[Tag] = Json.format[Tag]
}
