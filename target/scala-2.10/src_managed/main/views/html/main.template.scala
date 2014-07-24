
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(connected: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.36*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>Mr.Qoo 花生向聊天室</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*8.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        
        <div class="topbar">
            <div class="fill">
                <div class="container">
                    <a class="brand" href=""""),_display_(Seq[Any](/*18.45*/routes/*18.51*/.Application.index())),format.raw/*18.71*/("""">Mr.Qoo 花生向聊天室</a>
                    
                    """),_display_(Seq[Any](/*20.22*/if(connected != null)/*20.43*/ {_display_(Seq[Any](format.raw/*20.45*/("""
                        <p class="pull-right">
                            Logged in as """),_display_(Seq[Any](/*22.43*/connected)),format.raw/*22.52*/(""" —
                            <a href=""""),_display_(Seq[Any](/*23.39*/routes/*23.45*/.Application.index())),format.raw/*23.65*/("""">Logout</a>
                        </p>
                    """)))}/*25.23*/else/*25.28*/{_display_(Seq[Any](format.raw/*25.29*/("""
                        <form action=""""),_display_(Seq[Any](/*26.40*/routes/*26.46*/.Application.chatRoom())),format.raw/*26.69*/("""" class="pull-right">
                            <select id="roomId" name="roomId" class="medium">
                                <option value=0>Qoo</option>
                                <option value=1>手遊代理</option>
                                <option value=2>頁遊代理</option>
                            </select>
                            <input id="username" name="username" class="input-small" type="text" placeholder="Username">
                            <button class="btn" type="submit">Log in</button>
                        </form>
                    """)))})),format.raw/*35.22*/("""
                    
                </div>
            </div>
        </div>

        <div class="container">
            <div id="content" class="content">
                """),_display_(Seq[Any](/*43.18*/content)),format.raw/*43.25*/("""
            </div>
        </div>
        
    </body>
</html>
"""))}
    }
    
    def render(connected:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(connected)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (connected) => (content) => apply(connected)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 22 20:25:58 HKT 2014
                    SOURCE: /Users/user/play-2.2.2/MultiChatRooms/app/views/main.scala.html
                    HASH: dfcb5c9c617cd2dede1a062b5e351c68a8bf6014
                    MATRIX: 778->1|906->35|1068->162|1082->168|1142->207|1233->263|1247->269|1302->303|1399->364|1414->370|1468->402|1529->427|1544->433|1611->478|1858->689|1873->695|1915->715|2013->777|2043->798|2083->800|2209->890|2240->899|2317->940|2332->946|2374->966|2456->1030|2469->1035|2508->1036|2584->1076|2599->1082|2644->1105|3251->1680|3463->1856|3492->1863
                    LINES: 26->1|29->1|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|46->18|46->18|46->18|48->20|48->20|48->20|50->22|50->22|51->23|51->23|51->23|53->25|53->25|53->25|54->26|54->26|54->26|63->35|71->43|71->43
                    -- GENERATED --
                */
            