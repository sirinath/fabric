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
  Resolver.typesafeRepo("releases"),
  Resolver.typesafeRepo("snapshots"),
  Resolver.sbtPluginRepo("releases"),
  Resolver.sbtPluginRepo("snapshots"),
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots"),
  Resolver.sonatypeRepo("releases"),
  Resolver.jcenterRepo,
  DefaultMavenRepository,
  "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/",
  "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
)

libraryDependencies ++= Seq(
  Orgs.akka %% Art.Akka.actor % Ver.akka,
  Orgs.akka %% Art.Akka.agent % Ver.akka,
  Orgs.akka %% Art.Akka.cluster % Ver.akka,
  Orgs.akka %% Art.Akka.kernel % Ver.akka,
  Orgs.akka %% Art.Akka.osgi % Ver.akka,
  Orgs.akka %% Art.Akka.remote % Ver.akka,
  Orgs.akka %% Art.Akka.slf4j % Ver.akka,
  Orgs.akka %% Art.Akka.camel % Ver.akka,
  Orgs.akka %% Art.Akka.testkit % Ver.akka,
  Orgs.akka %% Art.Akka.stream % Ver.akkaStream,
  Orgs.akka %% Art.Akka.http % Ver.akkaHttp,
  Orgs.akka %% Art.Akka.httpCore % Ver.akkaHttp,
  Orgs.scalaz %% "scalaz-core" % Ver.scalaz,
  Orgs.scalazStream %% "scalaz-stream" % Ver.scalazStream,
  Orgs.shapeless %% "shapeless" % Ver.shapeless,
  Orgs.spire %% "spire" % Ver.spire,
  Orgs.spire %% "jawn-ast" % Ver.jawn,
  Orgs.squants %% "squants" % Ver.squants
)