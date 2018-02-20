lazy val sparkVersion = "2.2.0"
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.addmeaning",
      scalaVersion := "2.11.12",
      version := "1.0"
    )),
    name := "Spark template",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % sparkVersion,
      "org.apache.spark" %% "spark-sql" % sparkVersion,
      "org.apache.spark" %% "spark-mllib" % sparkVersion,
      "com.github.fommil.netlib" % "all" % "1.1.2" pomOnly(),
      "org.scalatest" %% "scalatest" % "3.0.4" % Test
    )
  )