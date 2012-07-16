import sbt._
import Keys._

object BuildSettings
{
	val buildScalaVersion = "$scalaVersion$"

	val settings = Defaults.defaultSettings ++ Seq (
		name := "$name$"
		, retrievedManaged := true
		, scalaVersion := buildScalaVersion
		, sbtVersion := "$sbtVersion$"
		, organization := "$organization$"
	)
}

object $name$Build extends Build
{
	lazy val root = Project("root",
		file("."),
		settings = BuildSettings.settings)
}