package model

import play.api.libs.json._

/** Represents the Swagger definition for Tag.
  * @param name
  *   タグ名
  */
@javax.annotation.Generated(
  value =
    Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"),
  date = "2021-09-23T01:43:18.946563+09:00[Asia/Tokyo]"
)
case class Tag(
    name: String
)

object Tag {
  implicit lazy val tagJsonFormat: Format[Tag] = Json.format[Tag]
}
