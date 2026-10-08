ThisBuild / scalaVersion := "3.3.6"

// sbt's super-shell writes progress output to the terminal and corrupts a TUI.
ThisBuild / useSuperShell := false

// ws-console is compiled for Java 20 and needs a JDK 20+ runtime.
ThisBuild / scalacOptions ++= Seq("-release", "20")

lazy val root = (project in file("."))
  .settings(
    name := "ws-console-skeleton",
    // Resolved from ~/.ivy2/local: run `sbt publishLocal` in ws-console first.
    libraryDependencies += "io.github.wickedsik" %% "ws-console" % "0.1.0-SNAPSHOT"
  )
