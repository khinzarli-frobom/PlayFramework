
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/Play Download/test-play-java/conf/routes
// @DATE:Thu Apr 27 15:05:48 MMT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:14
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:14
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.postLogin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.HomeController.profile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_login1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login1_invoker = createInvoker(
    HomeController_0.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_postLogin2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_postLogin2_invoker = createInvoker(
    HomeController_0.postLogin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "postLogin",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_signup3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signup3_invoker = createInvoker(
    HomeController_0.signup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signup",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_create4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_create4_invoker = createInvoker(
    HomeController_0.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_profile5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_HomeController_profile5_invoker = createInvoker(
    HomeController_0.profile,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "profile",
      Nil,
      "GET",
      """""",
      this.prefix + """profile"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_HomeController_login1_route(params) =>
      call { 
        controllers_HomeController_login1_invoker.call(HomeController_0.login)
      }
  
    // @LINE:8
    case controllers_HomeController_postLogin2_route(params) =>
      call { 
        controllers_HomeController_postLogin2_invoker.call(HomeController_0.postLogin)
      }
  
    // @LINE:9
    case controllers_HomeController_signup3_route(params) =>
      call { 
        controllers_HomeController_signup3_invoker.call(HomeController_0.signup)
      }
  
    // @LINE:10
    case controllers_HomeController_create4_route(params) =>
      call { 
        controllers_HomeController_create4_invoker.call(HomeController_0.create)
      }
  
    // @LINE:11
    case controllers_HomeController_profile5_route(params) =>
      call { 
        controllers_HomeController_profile5_invoker.call(HomeController_0.profile)
      }
  
    // @LINE:14
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
