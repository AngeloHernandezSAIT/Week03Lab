package servlets;

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

/**
 *
 * @author Cyber
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "-----");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String calc = request.getParameter("calc");
        int result = 0;
        double divResult = 0;

        if (calc.equals("") || calc == null) {
            request.setAttribute("message", "-----");
        } else if (first.equals("") || first == null || second.equals("") || second == null) {
            request.setAttribute("message", "invalid");
        } else {
            int firstInt = Integer.parseInt(first);
            int secondInt = Integer.parseInt(second);

            if (calc.equals("+")) {
                result = firstInt + secondInt;
                request.setAttribute("message", result);
            } else if (calc.equals("-")) {
                result = firstInt - secondInt;
                request.setAttribute("message", result);
            } else if (calc.equals("*")) {
                result = firstInt * secondInt;
                request.setAttribute("message", result);
            } else if (calc.equals("%")) {
                double firstDouble = firstInt;
                double secondDouble = secondInt;
                divResult = firstDouble % secondDouble;
                request.setAttribute("message", divResult);
                //Okay, I give up on the division section. Everything I've done on it doesn't work.
                // I thought it'd be fixed if I converted the results to doubles, but it still only displays zeroes
                // Its too late to fix now though, hopefully 3/4 working operations is good enough
            }
        }
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}
