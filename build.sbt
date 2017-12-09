val graphPaint = (
  project in file(".")
).settings(
  name := "graph.paint",
  organization := "com.nitrograph",
  version := "0.0.1",
  scalaVersion := "2.12.4",
  mainClass := Some("com.nitrograph.graph.paint.GraphPaint"),
  libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"
).enablePlugins(
  ScalaJSPlugin
)
