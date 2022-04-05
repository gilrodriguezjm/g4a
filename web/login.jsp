<%-- 
    Document   : login.jsp
    Created on : 5 abr 2022, 23:56:33
    Author     : gil
--%>

<%@page import="g4a.entity.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Iniciar Sesión</title>
    </head>
    <%
        Usuario usuario = (Usuario)session.getAttribute("usuario");
        if (usuario != null) {
        response.sendRedirect(request.getContextPath() + "/juegos.jsp");
        }
    %>
    <body>
        
        <form method="POST" action="iniciarSesionServlet">
            <input type="text" name="alias" value="" placeholder="Alias"/><br/>
            <input type="password" name="pass" value="" placeholder="Contraseña"/><br/> <br/>            
            <input type="submit" value="Iniciar sesión" />
        </form>
        
    </body>
</html>
