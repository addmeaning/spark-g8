lazy val sparkVersion = $spark_version$
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := $package$,
      scalaVersion := "2.12.13",
      version := "1.0"
    )),
    name := $name$
    description := $project_description$,
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
      "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",
      "org.apache.spark" %% "spark-mllib" % sparkVersion % "provided",
      "com.github.fommil.netlib" % "all" % "1.1.2" % "provided" pomOnly(),
      "org.scalatest" %% "scalatest" % "3.0.4" % Test
    )
  )
assemblyMergeStrategy in assembly := {
  case PathList("META-INF", _*) => MergeStrategy.discard
  case _ => MergeStrategy.first
}

run in Compile := Defaults.runTask(fullClasspath in Compile, mainClass in (Compile, run), runner in (Compile, run)).evaluated
