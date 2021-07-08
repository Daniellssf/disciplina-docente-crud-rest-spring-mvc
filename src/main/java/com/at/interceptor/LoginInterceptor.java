package com.at.interceptor;

import com.at.model.Docente;
import com.at.session.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Component
public class LoginInterceptor  implements HandlerInterceptor {

    @Autowired
    UserSession userSession;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest,
                             HttpServletResponse httpServletResponse, Object o) throws Exception {

        String urlAtual = httpServletRequest.getRequestURI();
        Docente docente = userSession.getLoggedUser();

        if (docente != null) {
            return true;
        } else if (urlAtual.contains("/user/criar")
                || urlAtual.contains("/login/loginPage")
                || urlAtual.contains("/rest/docente")) {
            return true;
        }

//        if (1 == 1) {
//            return true;
//        }

        String loginPage = httpServletRequest.getContextPath() + "/login/loginPage";
        httpServletResponse.sendRedirect(loginPage);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
