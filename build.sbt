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


import sbt.Keys.{libraryDependencies, name, resolvers, scalaVersion, version}

name := "fabric"

organization := "com.sakrio"

version := "0.0.1"

scalaVersion := "2.11.4"

autoCompilerPlugins := true

resolvers ++= Seq(
  DefaultMavenRepository,
  Resolver.jcenterRepo,
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots"),
  Resolver.sonatypeRepo("releases"),
  Resolver.typesafeRepo("releases"),
  Resolver.typesafeRepo("snapshots"),
  Resolver.sbtPluginRepo("releases"),
  Resolver.sbtPluginRepo("snapshots"),
  "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/",
  "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream-experimental" % "1.0-M2",
  "com.softwaremill.macwire" %% "macros" % "0.8.0",
  "com.softwaremill.macwire" %% "runtime" % "0.8.0",
  "org.scalaz" %% "scalaz-core" % "7.1.0",
  "com.squants" %% "squants" % "0.4.2",
  "com.github.rssh" %% "scala-gopher" % "0.99.5"
)