package com.at.controller;

import com.at.model.Docente;
import com.at.repository.DocenteRepository;
import com.at.session.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    DocenteRepository docenteRepository;

    @Autowired
    UserSession userSession;

    @RequestMapping(value = "/login/loginPage", method = RequestMethod.GET)
    public String loginPage() {
        return "/login/loginPage";
    }

    @RequestMapping(value = "/login/loginPage", method = RequestMethod.POST)
    public String login(@RequestParam("email") String email,
                        @RequestParam("password") String password,
                        Map<String, Object> model) {

        Docente docente = docenteRepository.findByEmail(email);

        if (docente != null && docente.getEmail().equals(email) && docente.getPassword().equals(password)) {
            userSession.addLoggedUser(docente);
            return "redirect:/autentication/autenticationPage";
        }else {
            model.put("message", "Login ou senha inválidos");
            return "/login/loginPage";
        }
    }

    @RequestMapping(value = "/login/logout", method = RequestMethod.GET)
    public String logout() {
        userSession.removeLoggedUser();
        return "/login/loginPage";
    }
}
