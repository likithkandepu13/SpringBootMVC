
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Autowired
    UserService us;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ModelAndView openMain() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("main");

        return mv;
    }

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public ModelAndView openLogin() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");

        return mv;
    }

    @RequestMapping(path = "/signup", method = RequestMethod.GET)
    public ModelAndView openSignup() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("signup");

        return mv;
    }

    @RequestMapping(path = "/registerUser", method = RequestMethod.POST)
    public ModelAndView registerUser(HttpServletRequest req) {

        String uemail = req.getParameter("uemail");
        String upwd = req.getParameter("upwd");

        ModelAndView mv = new ModelAndView();

        String msg = us.addUser(uemail, upwd);

        mv.addObject("msg", msg);
        mv.setViewName("login");

        return mv;
    }

    @RequestMapping(path = "/loginUser", method = RequestMethod.POST)
    public ModelAndView loginUser(HttpServletRequest req) {

        String uemail = req.getParameter("uemail");
        String upwd = req.getParameter("upwd");

        ModelAndView mv = new ModelAndView();

        String msg = us.loginUser(uemail, upwd);

        mv.addObject("msg", msg);

        if (msg.equals("Login Success")) {
            mv.setViewName("home");
        } else {
            mv.setViewName("login");
        }

        return mv;
    }
}

//package com.example.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.example.demo.service.UserService;
//
//@Controller
//public class UserController {
//
//    @Autowired
//    UserService us;
//
//    @RequestMapping(path = "/", method = RequestMethod.GET)
//    public ModelAndView openMain() {
//
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("main");
//
//        return mv;
//    }
//
//    @RequestMapping(path = "/login", method = RequestMethod.GET)
//    public ModelAndView openLogin() {
//
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("login");
//
//        return mv;
//    }
//
//    @RequestMapping(path = "/signup", method = RequestMethod.GET)
//    public ModelAndView openSignup() {
//
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("signup");
//
//        return mv;
//    }
//
//    @RequestMapping(path = "/registerUser", method = RequestMethod.POST)
//    public ModelAndView registerUser(
//            @RequestParam("uemail") String uemail,
//            @RequestParam("upwd") String upwd) {
//
//        ModelAndView mv = new ModelAndView();
//
//        String msg = us.addUser(uemail, upwd);
//
//        mv.addObject("msg", msg);
//        mv.setViewName("login");
//
//        return mv;
//    }
//
//    @RequestMapping(path = "/loginUser", method = RequestMethod.POST)
//    public ModelAndView loginUser(
//            @RequestParam("uemail") String uemail,
//            @RequestParam("upwd") String upwd) {
//
//        ModelAndView mv = new ModelAndView();
//
//        String msg = us.loginUser(uemail, upwd);
//
//        mv.addObject("msg", msg);
//
//        if(msg.equals("Login Success"))
//        {
//            mv.setViewName("home");
//        }
//        else
//        {
//            mv.setViewName("login");
//        }
//
//        return mv;
//    }
//}