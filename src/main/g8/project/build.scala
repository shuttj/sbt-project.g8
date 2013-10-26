import sbt._
import Keys._

object BuildSettings
{

	val settings = Defaults.defaultSettings ++ Seq (
		name := "$name$"
		, organization := "$organization$"
	)
}

object ProjectBuild extends Build
{
	lazy val root = Project("root",
		file("."),
		settings = BuildSettings.settings)
}
