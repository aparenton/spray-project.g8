package $package$

import akka.actor.Actor
import $package$.routing.SimpleRouting
import spray.routing.HttpService

class $name;format="Camel"$Actor extends Actor
with HttpService
with SimpleRouting {
  def actorRefFactory = context

  val routes = pathPrefix("v1") { simpleRoutes }

  def receive = runRoute(routes)
}
