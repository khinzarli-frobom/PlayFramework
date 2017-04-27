name := """test-play-java"""
organization := "com.frobom"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.8"

libraryDependencies += jdbc
libraryDependencies += "com.adrianhurt" %% "play-bootstrap" % "1.0-P25-B3"