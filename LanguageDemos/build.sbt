ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "LanguageDemos"
  )

libraryDependencies += "org.scala-lang.modules" %% "scala-parallel-collections" % "1.0.4"

libraryDependencies += "org.typelevel" %% "cats-core" % "2.9.0"
