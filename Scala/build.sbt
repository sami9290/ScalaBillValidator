name := "Cognotekt Scala Code Test"

version := "1.0"

val deps = Seq(
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)


lazy val validator = (project in file("."))
  .settings(
    libraryDependencies ++= deps
  )
