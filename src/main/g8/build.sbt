
lazy val sparkVersion = "$spark_version$"
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "$project_description$",
      scalaVersion := "2.11.12",
      version := "1.0"
    )),
    name := "$name$",
    description := "$name$",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
      "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",
      "org.apache.spark" %% "spark-mllib" % sparkVersion % "provided",
      "com.github.fommil.netlib" % "all" % "1.1.2" % "provided" pomOnly(),
      "org.scalatest" %% "scalatest" % "3.0.4" % Test
    )
  )
assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}