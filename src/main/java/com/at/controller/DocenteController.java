package com.at.controller;

import com.at.model.Disciplina;
import com.at.model.Docente;
import com.at.repository.DisciplinaRepository;
import com.at.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class DocenteController {

    @Autowired
    DocenteRepository docenteRepository;

    @Autowired
    DisciplinaRepository disciplinaRepository;

    @RequestMapping(value = "/user/criar", method = RequestMethod.GET)
    public String criar() {
        return "/user/criar";
    }

    @RequestMapping(value = "/user/criar", method = RequestMethod.POST)
    public void create(@RequestParam("nome") String nome,
                       @RequestParam("email") String email,
                       @RequestParam("password") String password,
                       @RequestParam("disciplina") String disciplina,
                       Map<String, Object> model) {

            Disciplina disc = new Disciplina(disciplina);
            Docente docente = new Docente(nome, email, password, disc);
            disciplinaRepository.save(disc);
            docenteRepository.save(docente);
            model.put("message", "O docente foi cadastrado com Sucesso!");
    }



    @RequestMapping(value = "/user/listar", method = RequestMethod.GET)
    public String listaPagina(Map<String, Object> model) {
        Iterable<Docente> all = docenteRepository.findAll();
        model.put("docenteList", all);
        return "/user/listar";
    }

    @RequestMapping(value = "/user/edit", method = RequestMethod.GET)
    public String editarPagina(@RequestParam("id") Long id,
                               Map<String, Object> model) {
        Docente docente = docenteRepository.findOne(id);
        Disciplina disciplina = disciplinaRepository.findOne(id);
        model.put("docente", docente);
        model.put("disciplina", disciplina);
        return "/user/edit";
    }

    @RequestMapping(value = "/user/edit", method = RequestMethod.POST)
    public void editarCliente(@RequestParam("id") Long id,
                              @RequestParam("nome") String nome,
                              @RequestParam("email") String email,
                              @RequestParam("password") String password,
                              @RequestParam("name") String name,
                              Map<String, Object> model) {
        Docente docente = docenteRepository.findOne(id);
        Long idDisciplina = null;
        if(docente.getDisciplina() != null) {
            idDisciplina = docente.getDisciplina().getId();
        }

        Disciplina disciplina = disciplinaRepository.findOne(idDisciplina);

        docente.setNome(nome);
        docente.setEmail(email);
        docente.setPassword(password);
        disciplina.setName(name);

        docenteRepository.save(docente);
        disciplinaRepository.save(disciplina);

        model.put("docente", docente);
        model.put("message", "O docente " + docente.getNome() + " foi editado com Sucesso!");
    }

    @RequestMapping(value = "/user/delete", method = RequestMethod.GET)
    public String delete(@RequestParam("id") Long id, Map<String, Object> model) {

        Docente docente = docenteRepository.findOne(id);
        Long idDisciplina = null;
        if(docente.getDisciplina() != null) {
            idDisciplina = docente.getDisciplina().getId();
        }

        docenteRepository.delete(id);
        if (idDisciplina != null) {
            disciplinaRepository.delete(idDisciplina);
        }
        return "redirect:/user/listar";
    }
}
