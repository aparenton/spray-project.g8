package $package$.routing

import spray.httpx.SprayJsonSupport
import spray.json.DefaultJsonProtocol
import spray.routing.HttpService

trait SimpleRouting extends HttpService {
  val simpleRoutes =
    path("hello") {
      get {
        complete("Hello World!")
      }
    }
}
