name := "actions-testing"

version := "0.1"

scalaVersion := "2.13.5"

idePackagePrefix := Some("io.github.drmanganese.testing")
Global / excludeLintKeys += idePackagePrefix

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.5" % "test"
