<%-- 
    Document   : juegos
    Created on : 6 abr 2022, 0:08:31
    Author     : gil
--%>

<%@page import="g4a.entity.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        Usuario usuario = (Usuario)session.getAttribute("usuario");
        if (usuario == null) {
        response.sendRedirect(request.getContextPath());
        }
    %>
    <body>
        <h1>Juegos</h1>
        <a href="cerrarSesionServlet">Cerrar Sesión</a>
    </body>
</html>
