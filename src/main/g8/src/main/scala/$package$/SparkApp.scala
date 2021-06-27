package $package$
import org.apache.spark.sql.SparkSession
object SparkApp extends App {
  val session = SparkSession.builder()
    .appName("spark-app").master("local[*]").getOrCreate()

}
