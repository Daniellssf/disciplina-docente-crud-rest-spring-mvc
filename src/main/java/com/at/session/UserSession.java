package com.at.session;

import com.at.model.Docente;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserSession {

    Docente docente;

    public void addLoggedUser(Docente docente) {
        this.docente = docente;
    }

    public Docente getLoggedUser() {
        return docente;
    }

    public void removeLoggedUser() {
        this.docente = null;
    }
}
