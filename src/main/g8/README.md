$name$
========

## Build

Run the following to build a docker image of the project:

```shell
\$ sbt assembly && docker build -t $name$ .
```

## Run

Run the following to create your docker container:

```shell
\$ docker run -p 8080:8080 $name$
```

And test your application:

```shell
\$ curl docker:8080/v1/hello
Hello World!
```

## Links

- [Spray.io documentation](http://spray.io/documentation/)
- [Akka documentation](http://doc.akka.io/docs/akka/2.4.4/scala.html)
