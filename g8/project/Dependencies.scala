
import sbt._

val sparkVersion = "2.2.0"

object Dependencies {
  lazy val core = "org.apache.spark" %% "spark-core" % sparkVersion
  lazy val sql = "org.apache.spark" %% "spark-sql" % sparkVersion
  lazy val mllib = "org.apache.spark" %% "spark-mllib" % sparkVersion
  lazy val jblas = "com.github.fommil.netlib" % "all" % "1.1.2" pomOnly()
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.4"
}