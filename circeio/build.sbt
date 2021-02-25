import Dependencies._

scalaVersion     := "2.13.4"
version          := "0.1.0-SNAPSHOT"
organization     := "com.mundox"
organizationName := "mundox"

lazy val root = (project in file("."))
  .settings(
    name := "circeio",
    Seq(
      libraryDependencies += "org.scalatest" %% "scalatest"      % "3.2.2",
      libraryDependencies += "io.circe"      %% "circe-core"     % "0.12.3",
      libraryDependencies += "io.circe"      %% "circe-generic"  % "0.12.3",
      libraryDependencies += "io.circe"      %% "circe-parser"   % "0.12.3",
      libraryDependencies += "org.typelevel" %% "cats-core"      % "2.1.1"
    )
  )