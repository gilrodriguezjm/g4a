<%-- 
    Document   : usuarios.jsp
    Created on : 5 abr 2022, 18:21:17
    Author     : gil
--%>

<%@page import="g4a.entity.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de usuarios</h1>
        <table>
            <tr>
                <th>ID</th>
                <th>ALIAS</th>
                <th>PASS</th>
                <th>ROL</th>
            </tr>
        <%
            List <Usuario> listaUsuarios = (List)request.getAttribute("listaUsuarios");
            for(Usuario usuario:listaUsuarios){
        %>
        <tr>
            <td><%= usuario.getUsuarioId() %></td>
            <td><%= usuario.getAlias() %></td>
            <td><%= usuario.getPassword() %></td>
            <td><%= usuario.getRol() %></td>
        </tr>
        <%
            }
        %>
        </table>
    </body>
</html>
