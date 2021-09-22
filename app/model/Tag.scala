package model

import play.api.libs.json._

/** Represents the Swagger definition for Tag.
  * @param name
  *   タグ名
  */
@javax.annotation.Generated(
  value =
    Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"),
  date = "2021-09-22T20:13:22.087650+09:00[Asia/Tokyo]"
)
case class Tag(
    name: String
)

object Tag {
  implicit lazy val tagJsonFormat: Format[Tag] = Json.format[Tag]
}
