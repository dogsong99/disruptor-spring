package com.dogsong.architecture.servlet;



import com.dogsong.architecture.a_Original.service.IDemoService;
import com.dogsong.architecture.a_Original.service.impl.DemoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author domisong.
 * @description: first servlet dome
 * @date 2021/4/16.
 */
@WebServlet(urlPatterns = "/dome1")
public class DemoServlet extends HttpServlet {

    IDemoService demoService = new DemoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(demoService.findAll().toString());
    }

}
