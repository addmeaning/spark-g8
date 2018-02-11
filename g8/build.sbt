import Dependencies._
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.addmeaning",
      scalaVersion := "2.11.12",
      version := "1.0"
    )),
    name := "Spark template",
    libraryDependencies ++= Seq(
      core, mllib, jblas, scalaTest in Test
    )
  )