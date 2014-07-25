// Project info

name := "play-mongojack"

organization := "git.wadum"

// The version comes from version.sbt, and is generated by the release plugin

scalaVersion := "2.11.2"

// Dependencies

libraryDependencies ++= Seq(
    cache,
    "org.mongojack" % "mongojack" % "2.0.0-RC5",
    "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.4.1",
    "com.typesafe.play" %% "play" % "2.3.2" % "provided"
)

// Test dependencies

libraryDependencies ++= Seq(
    "org.specs2" %% "specs2" % "2.3.13" % "test",
    "com.typesafe.play" %% "play-test" % "2.3.2" % "test"
)