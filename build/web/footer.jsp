<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
<%
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
%>

<div id="footer">Copyright &copy; <%= currentYear %> TOBA<br>
    <a href="mailto:Andriy@Maksymiv.net">Andriy@Maksymiv.net</a>
</div>
