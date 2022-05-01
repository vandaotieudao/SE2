package com.example.tut2.servlet;

import com.example.tut2.dao.StudentDAO;
import com.example.tut2.entity.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletStudent", value = "/home")
public class ServletStudent extends HttpServlet {
    private StudentDAO studentDAO;
    @Override
    public void init() throws ServletException {
        studentDAO = new StudentDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        showStudentList(request,response);
String action = request.getServletPath();
switch (action){
    case "/add":
        addStudent(request,response);
        break;
    case "/update":
        updateStudent(request,response);
        break;
    case "/delete":
        deleteStudent(request,response);
        break;

}
    }
private void showStudentList (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    List<Student> studentList = studentDAO.getStudentList();
    request.setAttribute( "students" , studentList);
    RequestDispatcher requestDispatcher = request.getRequestDispatcher("viewStudent.jsp");
    requestDispatcher.forward(request,response);
    }
    private void deleteStudent(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        studentDAO.deleteStudent(id);
        response.sendRedirect("list");

    }
    private void updateStudent(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double score = Double.parseDouble(request.getParameter("score"));

        Student student = new Student(id, name, score);
        studentDAO.updateStudent(student);
        response.sendRedirect("list");
    }
    private void addStudent(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        double score = Double.parseDouble(request.getParameter("score"));
        Student newstudent = new Student(name, score);
        studentDAO.addStudent(newstudent);
        response.sendRedirect("list");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
this.doGet(request,response);
    }

}
