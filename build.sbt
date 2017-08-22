
name := "Finatra-slick-diy"

version := "1.0"

scalaVersion := "2.12.1"

scalacOptions += "-Xlint:_"

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.typesafe.slick" %% "slick" % "3.2.1",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.2.1",
  "org.postgresql" % "postgresql" % "42.1.3",
  "com.twitter" %% "finatra-http" % "2.11.0"
)

val flywayDbHost = Option(System.getenv("DB_HOST")).getOrElse("localhost")

val flywayDbName = Option(System.getenv("DB_NAME")).getOrElse("testDB")

flywayUser := Option(System.getenv("DB_LOGIN")).getOrElse("")

flywayPassword := Option(System.getenv("DB_PWD")).getOrElse("")

flywayUrl := s"jdbc:postgresql://$flywayDbHost/$flywayDbName"

flywayDriver := "org.postgresql.Driver"