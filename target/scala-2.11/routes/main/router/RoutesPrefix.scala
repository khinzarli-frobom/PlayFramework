
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/Play Download/test-play-java/conf/routes
// @DATE:Thu Apr 27 15:05:48 MMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
