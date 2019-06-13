package com.hfut.servlet;

import com.hfut.service.AirportService;
import com.hfut.service.impl.AirportServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.jws.WebService;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/airport")
public class AirportServlet extends HttpServlet {
    private AirportService airportService;

    @Override
    public void init() throws ServletException {
        ApplicationContext ac=WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        airportService=ac.getBean("airportService",AirportServiceImpl.class);
        System.out.println(airportService.show());
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("list",airportService.show());
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
