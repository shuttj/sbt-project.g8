import sbt._
import Keys._

object BuildSettings
{
	val buildScalaVersion = "$scala-version$"

	val settings = Defaults.defaultSettings ++ Seq (
		name := "$name$"
		, retrievedManaged := true
		, scalaVersion := buildScalaVersion
		, sbtVersion := "$sbt-version$"
		, organization := "$organization$"
	)
}

object ProjectBuild extends Build
{
	lazy val root = Project("root",
		file("."),
		settings = BuildSettings.settings)
}