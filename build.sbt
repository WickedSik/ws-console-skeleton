ThisBuild / scalaVersion := "3.3.6"

// sbt's super-shell writes progress output to the terminal and corrupts a TUI.
ThisBuild / useSuperShell := false

// The skeleton targets JDK 23+: run.sh passes --sun-misc-unsafe-memory-access,
// which older JVMs reject. Compile against the same API level.
ThisBuild / scalacOptions ++= Seq("-release", "23")

lazy val root = (project in file("."))
  .settings(
    name := "ws-console-skeleton",
    // Resolved from Maven Central.
    libraryDependencies += "io.github.wickedsik" %% "ws-console" % "0.1.0"
  )
