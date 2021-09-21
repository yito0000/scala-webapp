package support

import api.{DefaultApi, DefaultApiImpl}
import com.typesafe.config.ConfigFactory
import org.scalatestplus.play.PlaySpec
import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.db.{Database, Databases}
import play.api.{Application, Configuration, inject}
import play.api.inject.guice.GuiceApplicationBuilder

import java.io.File

trait DatabaseTestSpec extends PlaySpec with GuiceOneAppPerSuite {

  override def fakeApplication(): Application = {
    val config = ConfigFactory
      .load()
      .withFallback(
        ConfigFactory.parseFile(new File("conf/application.test.conf"))
      )

    GuiceApplicationBuilder()
      .configure(Configuration(config))
      .bindings(inject.bind[DefaultApi].to[DefaultApiImpl])
      .build()
  }

  def database: Database = Databases(
    "org.h2.Driver",
    "jdbc:h2:file:~/scala-webapp/test.db;DB_CLOSE_DELAY=-1;",
    "postgres",
    Map("username" -> "sa", "password" -> "sa")
  )
}
