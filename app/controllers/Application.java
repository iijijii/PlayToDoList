package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import play.data.*;
import models.*;

public class Application extends Controller {
   
    static Form<Task> taskForm = Form.form(Task.class);
    
  public static Result index() {
      return redirect(routes.Application.tasks());
  }
    public static Result tasks() {
        return TODO;
    }
    
    public static Result newTask() {
        return TODO;
    }
    
    public static Result deleteTask(Long id) {
        return TODO;
    }
    
}