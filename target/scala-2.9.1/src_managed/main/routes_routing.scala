// @SOURCE:/Users/satouriri/todolist1/conf/routes
// @HASH:52bc6a7c64b62015337c98cdb45b9fa139b8770a
// @DATE:Tue Feb 05 21:58:52 JST 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_Application_tasks1 = Route("GET", PathPattern(List(StaticPart("/tasks"))))
                    

// @LINE:10
val controllers_Application_newTask2 = Route("POST", PathPattern(List(StaticPart("/tasks"))))
                    

// @LINE:11
val controllers_Application_deleteTask3 = Route("POST", PathPattern(List(StaticPart("/tasks/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:14
val controllers_Assets_at4 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/tasks""","""controllers.Application.tasks()"""),("""POST""","""/tasks""","""controllers.Application.newTask()"""),("""POST""","""/tasks/$id<[^/]+>/delete""","""controllers.Application.deleteTask(id:Long)"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:9
case controllers_Application_tasks1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.tasks(), HandlerDef(this, "controllers.Application", "tasks", Nil))
   }
}
                    

// @LINE:10
case controllers_Application_newTask2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.newTask(), HandlerDef(this, "controllers.Application", "newTask", Nil))
   }
}
                    

// @LINE:11
case controllers_Application_deleteTask3(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.deleteTask(id), HandlerDef(this, "controllers.Application", "deleteTask", Seq(classOf[Long])))
   }
}
                    

// @LINE:14
case controllers_Assets_at4(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                