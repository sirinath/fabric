/*
 * Copyright (c) 2015. The Project (Project Founder, Project Owner, Project Committers, Project Developers and Project Contributors.)
 *
 * Licensed under:
 *  - the Apache License, Version 2.0 <http://www.apache.org/licenses/LICENSE-2.0> or
 *  - the Academic Free License, Version 3.0 <http://opensource.org/licenses/AFL-3.0> or
 *  - the CeCILL-B Free Software License, Version 1.0 <http://www.cecill.info/licences/Licence_CeCILL-B_V1-en.html>, at your option.
 * This file may not be copied, modified, or distributed except according to those terms.
 * Any contribution to the project should comply with terms in all of the above licenses.
 */


object Ver {
  lazy val akka = "2.3.8"
  lazy val akkaStream = "1.0-M2"
  lazy val akkaHttp = "1.0-M2"
  lazy val parboiled = "2.0.1"
  lazy val scalaz = "7.1.0"
  lazy val scalazStream = "0.6a"
  lazy val shapeless = "2.0.0"
  lazy val spire = "0.9.0"
  lazy val jawn = "0.7.2"
  lazy val squants = "0.4.2"
}

object Orgs {
  lazy val akka = "com.typesafe.akka"
  lazy val scala = "org.scala-lang"
  lazy val parboiled = "org.parboiled"
  lazy val scalaz = "org.scalaz"
  lazy val scalazStream = scalaz + ".stream"
  lazy val shapeless = "com.chuusai"
  lazy val spire = "org.spire-math"
  lazy val squants = "com.squants"
}

object Art {

  object Akka {
    implicit val akka = "akka"

    def !(s: String): String = Akka(s)

    def apply(s2: String)(implicit s1: String): String = s1 + "-" + s2

    def !(s1: String, s2: String): String = Akka(s1, s2)

    def apply(s2: String, s3: String)(implicit s1: String): String = s1 + "-" + s2 + "-" + s3

    def actor: String = !"actor"

    def agent: String = !"agent"

    def cluster: String = !"cluster"

    def kernel: String = !"kernel"

    def osgi: String = !"osgi"

    def remote: String = !"remote"

    def slf4j: String = !"slf4j"

    def camel: String = !"camel"

    def testkit: String = !"testkit"

    def stream: String = !("stream", "experimental")

    def http: String = !("http", "experimental")

    def httpCore: String = !("http-core", "experimental")
  }

}