
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import b3.vertical.fieldConstructor

Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
    """),format.raw/*9.5*/("""<h1>login</h1>
    
    """),_display_(/*11.6*/b3/*11.8*/.form(routes.HomeController.postLogin())/*11.48*/ {_display_(Seq[Any](format.raw/*11.50*/("""
        
        """),format.raw/*13.9*/("""<fieldset>
           
            """),_display_(/*15.14*/b3/*15.16*/.text(userForm("email"), '_label -> "Email", '_help -> "")),format.raw/*15.74*/("""
            """),_display_(/*16.14*/b3/*16.16*/.text(userForm("password"), '_label -> "Password", '_help -> "")),format.raw/*16.80*/("""

         """),format.raw/*18.10*/("""</fieldset>
        
           
            <input type="submit" value="login">or 
            <a href=""""),_display_(/*22.23*/routes/*22.29*/.HomeController.create()),format.raw/*22.53*/("""">signup</a>
       
            
        
    """)))}),format.raw/*26.6*/("""
    
""")))}))
      }
    }
  }

  def render(userForm:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Thu Apr 27 13:31:07 MMT 2017
                  SOURCE: E:/Play Download/test-play-java/app/views/login.scala.html
                  HASH: 6ca36c1edc154e0de8e34aabbb5281a2f27803d1
                  MATRIX: 749->1|917->23|947->45|975->85|1003->88|1014->92|1052->94|1090->106|1143->133|1153->135|1202->175|1242->177|1289->197|1354->235|1365->237|1444->295|1486->310|1497->312|1582->376|1623->389|1760->499|1775->505|1820->529|1902->581
                  LINES: 27->1|33->1|35->4|36->6|37->7|37->7|37->7|39->9|41->11|41->11|41->11|41->11|43->13|45->15|45->15|45->15|46->16|46->16|46->16|48->18|52->22|52->22|52->22|56->26
                  -- GENERATED --
              */
          