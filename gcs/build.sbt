name := "gcs"

libraryDependencies ++= Seq(
  "com.google.cloud" % "google-cloud-storage" % "1.106.0",
  "com.google.cloud" % "google-cloud-nio"     % "0.120.0-alpha" % Test
)
