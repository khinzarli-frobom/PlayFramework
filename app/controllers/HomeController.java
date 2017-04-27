package controllers;

import javax.inject.Inject;
import javax.persistence.PersistenceException;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Transaction;

import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;


public class HomeController extends Controller {

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }
    
    public Result index(){
        return ok(views.html.home.render());
    }

  
    
    public  Result login(){
        updateLast();

        Form<User> userForm = formFactory.form(User.class);
        
        return ok(views.html.login.render(userForm));
    }
    
    public  Result postLogin() {
        Form<User> userForm = formFactory.form(User.class).bindFromRequest();
        updateLast();
        String email = session().get("email");
        String password = session().get("password");
        if(email.length()==0 && password.length()==0){
            return ok(views.html.login.render(userForm));
        }else{
        return ok(views.html.home.render());
      }
    }
    
    public static void updateLast(){
        
        session().put("email", "khin123@gmail.com");
        session().put("password", "123456");
        
            }
    
    public Result signup() {
        Form<User> signupForm = formFactory.form(User.class);

        return ok(views.html.signup.render(signupForm));
    }
    
    
    public Result create() {
       
            Form<User> signupForm = formFactory.form(User.class).bindFromRequest();

            signupForm.get().save();

            flash("success", "User " + signupForm.get().userName + " has been registered.");

            return ok(views.html.home.render());

        }
    
    public Result profile() {
        

        return ok(views.html.profile.render());
    }
    
    public Result edit(Long id) {
        Form<User> computerForm = formFactory.form(User.class).fill(
                User.find.byId(id)
        );
        return ok(
            views.html.editForm.render(id, editForm)
        );
    }
 
    public Result update(Long id) throws PersistenceException {
        Form<User> editForm = formFactory.form(User.class).bindFromRequest();
        if(editForm.hasErrors()) {
            return badRequest(views.html.editForm.render(id, editForm));
        }

        Transaction txn = Ebean.beginTransaction();
        try {
            User saved = User.find.byId(id);
            if (saved != null) {
                User newData = editForm.get();
                saved.userName = newData.userName;
                saved.userEmail = newData.userEmail;
                saved.userPassword = newData.userPassword;
                

                saved.update();
                flash("success", "Computer " + editForm.get().userName + " has been updated");
                txn.commit();
            }
        } finally {
            txn.end();
        }

        return ok(views.html.profile.render());
    }
 }
    

