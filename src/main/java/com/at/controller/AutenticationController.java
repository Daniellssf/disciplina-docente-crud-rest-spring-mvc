package com.at.controller;

import com.at.model.Docente;
import com.at.session.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class AutenticationController {

    @Autowired
    UserSession userSession;;

    @RequestMapping(value = "autentication/autenticationPage", method = RequestMethod.GET)
    public String autentication(Map<String, Object> model) {
        Docente docente = userSession.getLoggedUser();
        model.put("message", "O docente " + docente.getNome() + " foi autenticado com sucesso");
        return "/autentication/autenticationPage";
    }
}
