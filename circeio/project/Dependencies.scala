import sbt._

object Dependencies {
  lazy val scalaTest    = "org.scalatest" %% "scalatest"      % "3.2.2"
  lazy val circeCore    = "io.circe"      %% "circe-core"     % "0.10.0"
  lazy val circeGeneric = "io.circe"      %% "circe-generic"  % "0.10.0"
  lazy val circeParser  = "io.circe"      %% "circe-parser"   % "0.10.0"
}
