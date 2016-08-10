val asm5 = "org.ow2.asm" % "asm" % "5.1"
val dynalink = "org.dynalang" % "dynalink" % "0.7"

lazy val commonSettings = Seq(
  organization := "net.flaviusb",
  version := "0.1.0",
  scalaVersion := "2.11.8"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "make-domain-objects-jvm",
    libraryDependencies ++= List(asm5, dynalink)
  )

