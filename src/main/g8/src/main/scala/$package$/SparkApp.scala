package $package$
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
object SparkApp extends App {
  val session = SparkSession.builder()
    .appName("spark-app").master("local[*]").getOrCreate()
  import session.implicits._
  session.close()
}
