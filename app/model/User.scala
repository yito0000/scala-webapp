package model

import play.api.libs.json._

/** Represents the Swagger definition for User.
  * @param id
  *   ユーザーID
  * @param username
  *   ユーザー名
  * @param firstName
  *   名
  * @param lastName
  *   姓
  * @param email
  *   メールアドレス
  * @param password
  *   パスワード
  */
@javax.annotation.Generated(
  value =
    Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"),
  date = "2021-09-18T23:42:37.917390+09:00[Asia/Tokyo]"
)
case class User(
    id: Option[Long],
    username: String,
    firstName: String,
    lastName: String,
    email: String,
    password: String
)

object User {
  implicit lazy val userJsonFormat: Format[User] = Json.format[User]
}
