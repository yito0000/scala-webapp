package support

import api.{DefaultApi, DefaultApiController, DefaultApiImpl}
import com.google.inject.AbstractModule
import domain.book.BookRepository
import infrastructure.book.BookRepositoryDb
import service.{BookService, BookServiceImpl}

class WebAppModule extends AbstractModule {
  override def configure(): Unit = {
    bind(classOf[BookService]).to(classOf[BookServiceImpl])
    bind(classOf[BookRepository]).to(classOf[BookRepositoryDb])
    bind(classOf[DefaultApiController])
  }
}
