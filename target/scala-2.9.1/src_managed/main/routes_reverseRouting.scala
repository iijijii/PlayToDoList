// @SOURCE:/Users/satouriri/todolist1/conf/routes
// @HASH:52bc6a7c64b62015337c98cdb45b9fa139b8770a
// @DATE:Tue Feb 05 21:58:52 JST 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def tasks() = {
   Call("GET", "/tasks")
}
                                                        
 
// @LINE:11
def deleteTask(id:Long) = {
   Call("POST", "/tasks/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:10
def newTask() = {
   Call("POST", "/tasks")
}
                                                        

                      
    
}
                            

// @LINE:14
class ReverseAssets {
    


 
// @LINE:14
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def tasks = JavascriptReverseRoute(
   "controllers.Application.tasks",
   """
      function() {
      return _wA({method:"GET", url:"/tasks"})
      }
   """
)
                                                        
 
// @LINE:11
def deleteTask = JavascriptReverseRoute(
   "controllers.Application.deleteTask",
   """
      function(id) {
      return _wA({method:"POST", url:"/tasks/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:10
def newTask = JavascriptReverseRoute(
   "controllers.Application.newTask",
   """
      function() {
      return _wA({method:"POST", url:"/tasks"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:14
class ReverseAssets {
    


 
// @LINE:14
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def tasks() = new play.api.mvc.HandlerRef(
   controllers.Application.tasks(), HandlerDef(this, "controllers.Application", "tasks", Seq())
)
                              
 
// @LINE:11
def deleteTask(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.deleteTask(id), HandlerDef(this, "controllers.Application", "deleteTask", Seq(classOf[Long]))
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:10
def newTask() = new play.api.mvc.HandlerRef(
   controllers.Application.newTask(), HandlerDef(this, "controllers.Application", "newTask", Seq())
)
                              

                      
    
}
                            

// @LINE:14
class ReverseAssets {
    


 
// @LINE:14
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                