/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import javax.websocket.Session;

/**
 *
 * @author admin
 */
@WebServlet(urlPatterns = {"/loginServlet"})
public class LoginServlet extends HttpServlet {

    @Resource(name = "test2")
    private DataSource test2;

    

    private Connection conn;

    @Override
    public void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull", "root", "root");
        } catch (SQLException sqle) {
            System.out.println("" + sqle);
        }
    }

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
            throws ServletException, IOException, SQLException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            String in_username = request.getParameter("username");
            String in_password = request.getParameter("password");

            String sql = "SELECT * FROM user_login join userrole on (user_login.user_name = userrole.user_name)";
            String sql1 = "SELECT * FROM Customer";

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
           
            while (rs.next()) {
         
                String user = rs.getString("user_name");
                String role = rs.getString("role_name");
                String pass = rs.getString("pass_word");
                HttpSession session = request.getSession();
                
                
                if (role.equals("customer") && user.equals(in_username) && pass.equals(in_password)){
                    response.sendRedirect("index.jsp");
                }
                else if (role.equals("manager") && user.equals(in_username) && pass.equals(in_password)){
                    response.sendRedirect("man_index.jsp");
                }
                else if (role.equals("information") && user.equals(in_username) && pass.equals(in_password)){
                    response.sendRedirect("inf_index.jsp");
                }
                else if (role.equals("accounting") && user.equals(in_username) && pass.equals(in_password)){
                    response.sendRedirect("acc_index.jsp");
                }
                else if (role.equals("mec") && user.equals(in_username) && pass.equals(in_password)){
                    response.sendRedirect("mec_index.jsp");
                }
                
                session.setAttribute("user", user);
                session.setAttribute("roles", rs.getString("role_name"));
                    
            }
            

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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
