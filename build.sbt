name := "empty-project"

description := "SSS Empty Project Template"

version := "0.0.1"

organization := "sss.template"

scalaVersion := "2.10.3"

resolvers ++= Seq(
  "snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases" at "http://oss.sonatype.org/content/repositories/releases",
  "Typesafe Repo" at "http://repo.typesafe.com/typesafe/repo/",
  "Typesafe Releases" at "http://repo.typesafe.com/typesafe/maven-releases/"
)

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature", "-language:postfixOps", "-language:implicitConversions", "-Xlint")

testOptions in Test += Tests.Argument(TestFrameworks.Specs2, "junitxml", "console")

libraryDependencies ++= {
  Seq(
    "org.specs2"              %% "specs2"                         % "2.2.2" % "test",
    "junit"                    % "junit"                          % "4.11" % "test",
    "org.mockito"              % "mockito-all"                    % "1.9.5" % "test",
    "commons-io"               % "commons-io"                     % "2.4"
  )
}
