package $package$.util

import com.typesafe.config.ConfigFactory

object Configuration {
  private val config = ConfigFactory.load

  // Http
  val httpHost = config.getString("$name$.http.host")
  val httpPort = config.getInt("$name$.http.port")
}
