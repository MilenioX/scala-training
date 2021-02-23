import Dependencies._

scalaVersion     := "2.13.4"
version          := "0.1.0-SNAPSHOT"
organization     := "com.mundox"
organizationName := "mundox"

lazy val root = (project in file("."))
  .settings(
    name := "circeio",
    libraryDependencies += scalaTest % Test
  )