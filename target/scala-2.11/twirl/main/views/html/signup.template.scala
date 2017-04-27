
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import b3.vertical.fieldConstructor

Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
    """),format.raw/*9.5*/("""<h1>Signup</h1>
    
    """),_display_(/*11.6*/b3/*11.8*/.form(routes.HomeController.create())/*11.45*/ {_display_(Seq[Any](format.raw/*11.47*/("""
        
        """),format.raw/*13.9*/("""<fieldset>
            """),_display_(/*14.14*/b3/*14.16*/.text(signupForm("userName"), '_label -> "Name", '_help -> "")),format.raw/*14.78*/("""
            """),_display_(/*15.14*/b3/*15.16*/.text(signupForm("userEmail"), '_label -> "Email", '_help -> "")),format.raw/*15.80*/("""
            """),_display_(/*16.14*/b3/*16.16*/.text(signupForm("userPassword"), '_label -> "Password", '_help -> "")),format.raw/*16.86*/("""

         """),format.raw/*18.10*/("""</fieldset>
        
            <input type="submit" value="create" > 
        
    """)))}),format.raw/*22.6*/("""
    
""")))}))
      }
    }
  }

  def render(signupForm:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(signupForm)

  def f:((Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)

  def ref: this.type = this

}


}

/**/
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Thu Apr 27 14:11:11 MMT 2017
                  SOURCE: E:/Play Download/test-play-java/app/views/signup.scala.html
                  HASH: b124dc8eb66eedbafc6248d32e441a3541318d50
                  MATRIX: 751->1|921->25|951->47|979->87|1007->90|1018->94|1056->96|1094->108|1148->136|1158->138|1204->175|1244->177|1291->197|1343->222|1354->224|1437->286|1479->301|1490->303|1575->367|1617->382|1628->384|1719->454|1760->467|1880->557
                  LINES: 27->1|33->1|35->4|36->6|37->7|37->7|37->7|39->9|41->11|41->11|41->11|41->11|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|48->18|52->22
                  -- GENERATED --
              */
          