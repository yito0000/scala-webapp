package infrastructure.book

import api.{DefaultApi, DefaultApiImpl}
import com.typesafe.config.ConfigFactory
import org.scalatest.BeforeAndAfterAll
import org.scalatestplus.play.PlaySpec
import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.db.{Database, Databases}
import play.api.inject.guice.GuiceApplicationBuilder
import play.api.{Application, Configuration, inject}

import java.io.File

class BookRepositoryDbTest
    extends PlaySpec
    with BeforeAndAfterAll
    with GuiceOneAppPerSuite {

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

  private val database: Database = Databases(
    "org.h2.Driver",
    "jdbc:h2:file:~/scala-webapp/test.db;DB_CLOSE_DELAY=-1;",
    "postgres",
    Map("username" -> "sa", "password" -> "sa")
  )
  private val sut = new BookRepositoryDb(database)

  "BookRepositoryDb#fetchAll" must {
    "Book table records fetch all" in {
      val actual = sut.fetchAll()
      actual foreach (entity => println(entity))
    }
  }

}
