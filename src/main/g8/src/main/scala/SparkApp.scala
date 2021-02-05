import org.apache.spark.sql.SparkSession
package $package$
object SparkApp extends App {
  val session = SparkSession.builder()
    .appName("spark-app").master("local[*]").getOrCreate()

}
