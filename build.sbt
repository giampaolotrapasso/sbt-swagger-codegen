sbtPlugin := true

name := """sbt-swagger-codegen"""

organization := "eu.unicredit"

version := "0.0.4-SNAPSHOT"

crossScalaVersions := Seq("2.10.4")

resolvers += Resolver.sonatypeRepo("releases")

scalacOptions ++= Seq("-target:jvm-1.7",
					  "-feature",
					  "-language:_")

libraryDependencies ++= Seq(
	"com.eed3si9n" %% "treehugger" % "0.4.1",
	"io.swagger" % "swagger-parser" % "1.0.13"
)
