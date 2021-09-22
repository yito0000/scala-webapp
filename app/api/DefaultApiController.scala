package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Book
import model.Tag
import model.User

@javax.annotation.Generated(
  value =
    Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"),
  date = "2021-09-22T20:13:22.087650+09:00[Asia/Tokyo]"
)
@Singleton
class DefaultApiController @Inject() (cc: ControllerComponents, api: DefaultApi)
    extends AbstractController(cc) {

  /** DELETE /v1/books/:bookId
    * @param bookId
    *   書籍ID
    */
  def booksBookIdDelete(bookId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val apiKey = request.headers.get("api_key")

      api.booksBookIdDelete(bookId, apiKey)
    }

    executeApi()
    Ok
  }

  /** GET /v1/books/:bookId
    * @param bookId
    *   書籍ID
    */
  def booksBookIdGet(bookId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Book = {
      api.booksBookIdGet(bookId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /** GET /v1/books/findByTags?tags=[value]
    */
  def booksFindByTagsGet(): Action[AnyContent] = Action { request =>
    def executeApi(): List[Book] = {
      val tags = request.queryString
        .get("tags")
        .map(_.toList)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException(
            "tags",
            "query string"
          )
        }
      api.booksFindByTagsGet(tags)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /** GET /v1/books
    */
  def booksGet(): Action[AnyContent] = Action { request =>
    def executeApi(): List[Book] = {
      api.booksGet()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /** POST /v1/books
    */
  def booksPost(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val book = request.body.asJson.map(_.as[Book]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException(
          "body",
          "book"
        )
      }
      api.booksPost(book)
    }

    executeApi()
    Ok
  }

  /** PUT /v1/books
    */
  def booksPut(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val book = request.body.asJson.map(_.as[Book]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException(
          "body",
          "book"
        )
      }
      api.booksPut(book)
    }

    executeApi()
    Ok
  }

  /** GET /v1/tags
    */
  def tagsGet(): Action[AnyContent] = Action { request =>
    def executeApi(): List[Tag] = {
      api.tagsGet()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /** GET /v1/users
    */
  def usersGet(): Action[AnyContent] = Action { request =>
    def executeApi(): User = {
      api.usersGet()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /** GET /v1/users/login?username=[value]&password=[value]
    */
  def usersLoginGet(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val username = request
        .getQueryString("username")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException(
            "username",
            "query string"
          )
        }
      val password = request
        .getQueryString("password")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException(
            "password",
            "query string"
          )
        }
      api.usersLoginGet(username, password)
    }

    executeApi()
    Ok
  }

  /** GET /v1/users/logout
    */
  def usersLogoutGet(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.usersLogoutGet()
    }

    executeApi()
    Ok
  }

  /** POST /v1/users
    */
  def usersPost(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val user = request.body.asJson.map(_.as[User]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException(
          "body",
          "user"
        )
      }
      api.usersPost(user)
    }

    executeApi()
    Ok
  }

  /** DELETE /v1/users/:username
    * @param username
    *   ユーザー名
    */
  def usersUsernameDelete(username: String): Action[AnyContent] = Action {
    request =>
      def executeApi(): Unit = {
        api.usersUsernameDelete(username)
      }

      executeApi()
      Ok
  }

  /** GET /v1/users/:username
    * @param username
    *   ユーザー名
    */
  def usersUsernameGet(username: String): Action[AnyContent] = Action {
    request =>
      def executeApi(): User = {
        api.usersUsernameGet(username)
      }

      val result = executeApi()
      val json = Json.toJson(result)
      Ok(json)
  }

  /** PUT /v1/users/:username
    * @param username
    *   ユーザー名
    */
  def usersUsernamePut(username: String): Action[AnyContent] = Action {
    request =>
      def executeApi(): Unit = {
        val user = request.body.asJson.map(_.as[User]).getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException(
            "body",
            "user"
          )
        }
        api.usersUsernamePut(username, user)
      }

      executeApi()
      Ok
  }

  private def splitCollectionParam(
      paramValues: String,
      collectionFormat: String
  ): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv"   => ",+"
        case "tsv"   => "\t+"
        case "ssv"   => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
