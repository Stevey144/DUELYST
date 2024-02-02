// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/STEPHEN/Desktop/ITSD-DT2023-24-Template/conf/routes
// @DATE:Tue Jan 30 12:26:36 GMT 2024


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
