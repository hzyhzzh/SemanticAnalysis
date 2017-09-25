package semanticanalysis.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import semanticanalysis.domain.repository.User;
import semanticanalysis.service.IUserService;

@Controller  
@RequestMapping("/user")  
public class UserController {  
    @Resource  
    private IUserService userService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        
        User user = this.userService.getUserById(2);  
        model.addAttribute("user", user);  
        return "test";  
    }  
}  