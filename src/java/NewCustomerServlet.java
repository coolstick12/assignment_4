/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;
import JavaBeans.User;
import JavaBeans.UserDB;
import JavaBeans.Account;
import JavaBeans.AccountDB;
import JavaBeans.PasswordUtil;
/**
 *
 * @author andriy
 */
public class NewCustomerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewCustomerServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewCustomerServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //processRequest(request, response);
        
        String url = "/success.jsp";
        String errorMessage = "Please fill out all the form's fields.";
        
        // get login parameters
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String state = request.getParameter("state");
        String city = request.getParameter("city");
        String zipcode = request.getParameter("zipcode");
        String email = request.getParameter("email");
        
        if (firstName.equals("") || lastName.equals("") || address.equals("") ||
            phone.equals("") || state.equals("") || city.equals("") ||
            zipcode.equals("") || email.equals(""))
        {
            request.setAttribute("error", errorMessage);
            url = "/new_customer.jsp";
        }
        
        User newUser = new User();
        newUser.setFirstName(firstName);
        newUser.setLastName(lastName);
        newUser.setAddress(address);
        newUser.setPhone(phone);
        newUser.setState(state);
        newUser.setCity(city);
        newUser.setZipCode(zipcode);
        newUser.setEmail(email);
        //newUser.setUsername(lastName+"_"+zipcode);
        newUser.setUsername("andriy");
        
        try {
            String hashedAndSaltedPassword = PasswordUtil.hasAndSaltPassword("welcome1");
            newUser.setPassword(hashedAndSaltedPassword);
        }
        catch(Exception ex) {
            newUser.setPassword("welcome1");
        }
        
        UserDB.insert(newUser);
        
        Account checkingAccount = new Account(newUser);        
        Account savingsAccount = new Account(newUser);
        savingsAccount.credit(25);
        
        AccountDB.insert(savingsAccount);
        AccountDB.insert(checkingAccount);
        
        HttpSession session = request.getSession();
        session.setAttribute("newUser", newUser);
        
        session.setAttribute("savings", savingsAccount);
        session.setAttribute("checking", checkingAccount);
        
        // forward request and response objects to specified URL
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
