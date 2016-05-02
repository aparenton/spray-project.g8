package $package;format="lower"$

import scala.concurrent.duration._
import scala.concurrent.Await
import akka.actor.{Props, ActorSystem}
import akka.io.IO
import akka.util.Timeout
import $package$.util.Configuration._
import spray.can.Http

object Boot extends App {
  implicit val system = ActorSystem("$name;format="lower"$")

  // REST API Actor
  val $name;format="camel"$Actor = system.actorOf(Props[$name;format="Camel"$Actor], "$name;format="camel"$Actor")

  implicit val timeout = Timeout(5 seconds)

  IO(Http) ! Http.Bind(listener = $name;format="camel"$Actor, interface = httpHost, port = httpPort)

  scala.sys.addShutdownHook {
    system.terminate()
    Await.result(system.whenTerminated, 15 seconds)
  }
}
