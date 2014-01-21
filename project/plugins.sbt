resolvers += Resolver.url("scala-js-releases", url("http://dl.bintray.com/content/scala-js/scala-js-releases"))(Resolver.ivyStylePatterns)

addSbtPlugin("org.scala-lang.modules.scalajs" % "scalajs-sbt-plugin" % "0.2.1")

resolvers += Classpaths.sbtPluginSnapshots

addSbtPlugin("io.spray" % "sbt-twirl" % "0.7.0-SNAPSHOT")
                                                             
