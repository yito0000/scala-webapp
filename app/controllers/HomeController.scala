package controllers

import controllers.form.InputForm
import play.api.Logger
import play.api.data.Forms._
import play.api.data._
import play.api.i18n.I18nSupport
import play.api.mvc.{
  AbstractController,
  AnyContent,
  ControllerComponents,
  Request
}

import javax.inject.{Inject, Singleton}

@Singleton
class HomeController @Inject() (cc: ControllerComponents)
    extends AbstractController(cc)
    with I18nSupport {

  private val log: Logger = Logger(this.getClass)

  private val inputForm = Form(
    mapping(
      "input1" -> text.verifying("validation error", { !_.isEmpty() }),
      "input2" -> text.verifying("validation error", { !_.isEmpty() }),
      "input3" -> text.verifying("validation error", { !_.isEmpty() })
    )(InputForm.apply)(InputForm.unapply)
  )

  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def getInput() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.input(inputForm))
  }

  def postInput() = Action { implicit request: Request[AnyContent] =>
    inputForm.bindFromRequest.fold(
      errors => {
        log.error(s"errors = [$errors]")
        BadRequest(views.html.input(errors))
      },
      success => {
        val value = inputForm.bindFromRequest().get
        log.info(s"input form = [$value]")
        Redirect("/complete")
      }
    )
  }

  def getComplete() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.complete())
  }
}
