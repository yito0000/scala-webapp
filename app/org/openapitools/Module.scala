package org.openapitools

import api._
import play.api.inject.{Binding, Module => PlayModule}
import play.api.{Configuration, Environment}

@javax.annotation.Generated(
  value =
    Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"),
  date = "2021-09-23T01:43:18.946563+09:00[Asia/Tokyo]"
)
class Module extends PlayModule {
  override def bindings(
      environment: Environment,
      configuration: Configuration
  ): Seq[Binding[_]] = Seq(
    bind[DefaultApi].to[DefaultApiImpl]
  )
}
