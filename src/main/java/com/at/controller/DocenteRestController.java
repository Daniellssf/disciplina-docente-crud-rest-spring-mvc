package com.at.controller;


import com.at.model.Docente;
import com.at.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docente")
public class DocenteRestController {

    @Autowired
    DocenteRepository docenteRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Docente> findAll() {
        return docenteRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Docente insert(@RequestBody Docente docente) {
        Docente d = docenteRepository.save(docente);
        return d;
    }
}
