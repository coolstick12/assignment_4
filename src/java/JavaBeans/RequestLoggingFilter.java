/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBeans;

/**
 *
 * @author andriy
 */
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.servlet.*;
import javax.servlet.http.*;

public class RequestLoggingFilter implements Filter {
	
    private FilterConfig filterConfig = null;
    
    @Override
    public void init(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
            
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        
        ServletContext sc = filterConfig.getServletContext();

        String logString = filterConfig.getFilterName() + " | ";
        
        logString += "Servlet path: " + httpRequest.getServletPath() + " | ";
        
        sc.log(logString);
        
        Files.write(Paths.get("./log.txt"), logString.getBytes());
        
        chain.doFilter(request, response);
    }

    public void destroy() {
        filterConfig = null;
    }
}
