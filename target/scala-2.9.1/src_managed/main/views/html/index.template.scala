
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
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta http-equiv="Content-Style-Type" content="text/css">
  <title></title>
  <meta name="Generator" content="Cocoa HTML Writer">
  <meta name="CocoaVersion" content="1138.51">
  <style type="text/css">
    p.p1 """),format.raw("""{"""),format.raw/*10.11*/("""margin: 0.0px 0.0px 0.0px 0.0px; font: 14.0px Courier; color: #48484c; background-color: #f7f7f9"""),format.raw("""}"""),format.raw/*10.108*/("""
    p.p2 """),format.raw("""{"""),format.raw/*11.11*/("""margin: 0.0px 0.0px 0.0px 0.0px; font: 14.0px Courier; color: #48484c; background-color: #f7f7f9; min-height: 17.0px"""),format.raw("""}"""),format.raw/*11.128*/("""
    p.p3 """),format.raw("""{"""),format.raw/*12.11*/("""margin: 0.0px 0.0px 0.0px 0.0px; font: 14.0px Courier; color: #dd1c44; background-color: #f7f7f9"""),format.raw("""}"""),format.raw/*12.108*/("""
    p.p4 """),format.raw("""{"""),format.raw/*13.11*/("""margin: 0.0px 0.0px 0.0px 0.0px; font: 14.0px Courier; color: #93a1a1; background-color: #f7f7f9"""),format.raw("""}"""),format.raw/*13.108*/("""
    span.s1 """),format.raw("""{"""),format.raw/*14.14*/("""color: #93a1a1"""),format.raw("""}"""),format.raw/*14.29*/("""
    span.s2 """),format.raw("""{"""),format.raw/*15.14*/("""color: #008080"""),format.raw("""}"""),format.raw/*15.29*/("""
    span.s3 """),format.raw("""{"""),format.raw/*16.14*/("""color: #195f91"""),format.raw("""}"""),format.raw/*16.29*/("""
    span.s4 """),format.raw("""{"""),format.raw/*17.14*/("""color: #48484c"""),format.raw("""}"""),format.raw/*17.29*/("""
    span.s5 """),format.raw("""{"""),format.raw/*18.14*/("""color: #dd1c44"""),format.raw("""}"""),format.raw/*18.29*/("""
    span.s6 """),format.raw("""{"""),format.raw/*19.14*/("""color: #1d347b"""),format.raw("""}"""),format.raw/*19.29*/("""
  </style>
</head>
<body>
<p class="p1"><span class="s1">"""),_display_(Seq[Any](/*23.33*/(</span>tasks<span class="s1">:</span> <span class="s2">List</span><span class="s1">[</span><span class="s2">Task</span><span class="s1">],</span> taskForm<span class="s1">:</span> <span class="s2">Form</span><span class="s1">[</span><span class="s2">Task</span><span class="s1">]))),format.raw/*23.314*/("""</span></p>
<p class="p2"><br></p>
<p class="p1"><span class="s3">"""),_display_(Seq[Any](/*25.33*/import)),format.raw/*25.39*/("""</span> helper<span class="s1">.</span>_</p>
<p class="p2"><br></p>
<p class="p3"><span class="s3">"""),_display_(Seq[Any](/*27.33*/main)),format.raw/*27.37*/("""</span><span class="s1">(</span>"Todo list"<span class="s1">)</span><span class="s4"> </span><span class="s1">"""),format.raw("""{"""),format.raw/*27.148*/("""</span></p>
<p class="p2"><span class="Apple-converted-space">    </span></p>
<p class="p1"><span class="Apple-converted-space">    </span><span class="s5">&lt;h1&gt;</span><span class="s3">"""),_display_(Seq[Any](/*29.114*/tasks)),format.raw/*29.119*/("""</span><span class="s1">.</span>size<span class="s1">()</span> task<span class="s1">(</span>s<span class="s1">)&lt;/</span>h1<span class="s1">&gt;</span></p>
<p class="p2"><span class="Apple-converted-space">    </span></p>
<p class="p1"><span class="Apple-converted-space">    </span><span class="s5">&lt;ul&gt;</span></p>
<p class="p1"><span class="Apple-converted-space">        </span><span class="s3">"""),_display_(Seq[Any](/*32.84*/for)),format.raw/*32.87*/("""</span><span class="s1">(</span>task <span class="s1">&lt;-</span> tasks<span class="s1">)</span> <span class="s1">"""),format.raw("""{"""),format.raw/*32.203*/("""</span></p>
<p class="p1"><span class="Apple-converted-space">            </span><span class="s5">&lt;li&gt;</span></p>
<p class="p1"><span class="Apple-converted-space">                </span><span class="s3">"""),_display_(Seq[Any](/*34.92*/task)),format.raw/*34.96*/("""</span><span class="s1">.</span>label</p>
<p class="p2"><span class="Apple-converted-space">                </span></p>
<p class="p1"><span class="Apple-converted-space">                </span><span class="s3">"""),_display_(Seq[Any](/*36.92*/form)),format.raw/*36.96*/("""</span><span class="s1">(</span>routes<span class="s1">.</span><span class="s2">Application</span><span class="s1">.</span>deleteTask<span class="s1">(</span>task<span class="s1">.</span>id<span class="s1">))</span> <span class="s1">"""),format.raw("""{"""),format.raw/*36.330*/("""</span></p>
<p class="p1"><span class="Apple-converted-space">                    </span><span class="s1">&lt;</span>input type<span class="s1">=</span><span class="s5">"submit"</span> value<span class="s1">=</span><span class="s5">"Delete"</span><span class="s1">&gt;</span></p>
<p class="p1"><span class="Apple-converted-space">                </span><span class="s1">"""),format.raw("""}"""),format.raw/*38.92*/("""</span></p>
<p class="p1"><span class="Apple-converted-space">            </span><span class="s1">&lt;</span><span class="s5">/li&gt;</span></p>
<p class="p3"><span class="Apple-converted-space">        </span>"""),format.raw("""}"""),format.raw/*40.67*/("""</p>
<p class="p3"><span class="Apple-converted-space">    </span>&lt;/<span class="s4">ul</span><span class="s1">&gt;</span></p>
<p class="p2"><span class="Apple-converted-space">    </span></p>
<p class="p1"><span class="Apple-converted-space">    </span><span class="s5">&lt;h2&gt;</span><span class="s2">Add</span> a <span class="s6">new</span> task<span class="s1">&lt;/</span>h2<span class="s1">&gt;</span></p>
<p class="p2"><span class="Apple-converted-space">    </span></p>
<p class="p1"><span class="Apple-converted-space">    </span><span class="s3">"""),_display_(Seq[Any](/*45.80*/form)),format.raw/*45.84*/("""</span><span class="s1">(</span>routes<span class="s1">.</span><span class="s2">Application</span><span class="s1">.</span>newTask<span class="s1">())</span> <span class="s1">"""),format.raw("""{"""),format.raw/*45.260*/("""</span></p>
<p class="p2"><span class="Apple-converted-space">        </span></p>
<p class="p1"><span class="Apple-converted-space">        </span><span class="s3">"""),_display_(Seq[Any](/*47.84*/inputText)),format.raw/*47.93*/("""</span><span class="s1">(</span>taskForm<span class="s1">(</span><span class="s5">"label"</span><span class="s1">))</span><span class="Apple-converted-space"> </span></p>
<p class="p2"><span class="Apple-converted-space">        </span></p>
<p class="p1"><span class="Apple-converted-space">        </span><span class="s1">&lt;</span>input type<span class="s1">=</span><span class="s5">"submit"</span> value<span class="s1">=</span><span class="s5">"Create"</span><span class="s1">&gt;</span></p>
<p class="p2"><span class="Apple-converted-space">        </span></p>
<p class="p1"><span class="Apple-converted-space">    </span><span class="s1">"""),format.raw("""}"""),format.raw/*51.80*/("""</span></p>
<p class="p2"><span class="Apple-converted-space">    </span></p>
<p class="p4">"""),format.raw("""}"""),format.raw/*53.16*/("""</p>
</body>
</html>
"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 05 23:03:24 JST 2013
                    SOURCE: /Users/satouriri/todolist1/app/views/index.scala.html
                    HASH: 491cc2bd2bb907f2ada31a80809194a07f8a160f
                    MATRIX: 819->0|1256->390|1401->487|1459->498|1624->615|1682->626|1827->723|1885->734|2030->831|2091->845|2153->860|2214->874|2276->889|2337->903|2399->918|2460->932|2522->947|2583->961|2645->976|2706->990|2768->1005|2863->1064|3167->1345|3270->1412|3298->1418|3434->1518|3460->1522|3619->1633|3847->1824|3875->1829|4318->2236|4343->2239|4507->2355|4754->2566|4780->2570|5027->2781|5053->2785|5335->3019|5753->3390|6011->3601|6609->4163|6635->4167|6859->4343|7060->4508|7091->4517|7784->5163|7924->5256
                    LINES: 30->1|39->10|39->10|40->11|40->11|41->12|41->12|42->13|42->13|43->14|43->14|44->15|44->15|45->16|45->16|46->17|46->17|47->18|47->18|48->19|48->19|52->23|52->23|54->25|54->25|56->27|56->27|56->27|58->29|58->29|61->32|61->32|61->32|63->34|63->34|65->36|65->36|65->36|67->38|69->40|74->45|74->45|74->45|76->47|76->47|80->51|82->53
                    -- GENERATED --
                */
            