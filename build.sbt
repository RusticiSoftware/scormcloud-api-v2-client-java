lazy val root = (project in file(".")).
  settings(
    organization := "com.rusticisoftware.cloud.v2.client",
    name := "scormcloud-api-v2-client",
    version := "4.0.0",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "io.swagger" % "swagger-annotations" % "1.5.17",
      "org.glassfish.jersey.core" % "jersey-client" % "2.34",
      "org.glassfish.jersey.media" % "jersey-media-multipart" % "2.34",
      "org.glassfish.jersey.inject" % "jersey-hk2" % "2.34",
      "org.glassfish.jersey.media" % "jersey-media-json-jackson" % "2.34",
      "com.fasterxml.jackson.core" % "jackson-core" % "2.13.5" % "compile",
      "com.fasterxml.jackson.core" % "jackson-annotations" % "2.13.5" % "compile",
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.13.5" % "compile",
      "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % "2.13.5" % "compile"
    )
  )
