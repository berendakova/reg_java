package servlets;

import entities.User;
import exceptions.DbException;
import exceptions.DuplicateEntryException;
import repositories.UserRepositories;
import utils.Errors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistrationJava extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Errors errors = new Errors();

        req.setAttribute("status_email",errors.isEmail(req.getParameter("user_email")));
        req.setAttribute("status_password",errors.isCorrectPasswords("user_password","user_password2"));
        req.setAttribute("status_consent",req.getParameter("consent"));

            String name = req.getParameter("user_name");
            String email = req.getParameter("user_email");
            String password = req.getParameter("user_password");
            String gender = req.getParameter("user_gender");
            String bio = req.getParameter("user_bio");
            String country = req.getParameter("country_name");
            String password2 = req.getParameter("user_password2");
            String age = req.getParameter("user_age");


            User user = new User(name, email, password, country, age, bio, gender);
         {

                try {
                    UserRepositories.add(user);
                    return;
                } catch (DbException | DuplicateEntryException ex) {
                    ex.printStackTrace();
                }
            }

        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }

        @Override
        protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
        }

    }
