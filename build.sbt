organization := "com.example"
version := "0.1.0"
name := "webapp"
scalaVersion := "2.12.6"

enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  guice,
  ws,
  jdbc,
  evolutions,
  "org.postgresql" % "postgresql" % "42.2.23",
  "org.flywaydb" %% "flyway-play" % "7.14.0",
  "com.h2database" % "h2" % "1.4.200" % Test,
  "com.typesafe.play" %% "anorm" % "2.5.3",
  "org.webjars" % "swagger-ui" % "3.1.5",
  "javax.annotation" % "javax.annotation-api" % "1.3.2" % "compile",
  "org.scalatest" %% "scalatest" % "3.0.4" % Test,
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
)

javaOptions in Test += "-Dconfig.file=conf/application.test.conf"
