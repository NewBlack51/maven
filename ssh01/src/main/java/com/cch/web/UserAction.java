package com.cch.web;

import com.cch.domain.User;
import com.cch.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**  
 * ClassName:UserAction <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午7:12:25 <br/>       
 */
public class UserAction extends ActionSupport implements ModelDriven<User>{

    private User model;
    @Override
    public User getModel() {
          
        if(model==null){
            model=new User();
        }
        
        return model;
    }
    
    private UserService userService;
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
    public String findById(){
        
        System.out.println(1111);
        
        model=userService.findById(model.getId());
        
        return SUCCESS;
    }

}
  
