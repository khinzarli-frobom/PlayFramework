package models;

import play.data.validation.Constraints;
import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

/**
 * Computer entity managed by Ebean
 */
@Entity 
public class User extends Model{
    
    
    public long userId;
    @Constraints.Required
    public String userName;
    @Constraints.Required
    public String userEmail;
    @Constraints.Required
    public String userPassword;
    
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserEmail() {
        return userEmail;
        
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    
    public  User(long userId,String userName,String userEmail,String userPassword){
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        
    }
    
}
