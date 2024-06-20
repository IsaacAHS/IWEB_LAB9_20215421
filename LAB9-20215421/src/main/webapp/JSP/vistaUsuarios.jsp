<%--
  Created by IntelliJ IDEA.
  User: Isaac
  Date: 19/06/2024
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.lab920215421.Beans.Usuario" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="lista" scope="request" type="ArrayList<Usuario>"/>

<html>
<head>
    <title>Usuarios</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
          crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="clearfix mt-3 mt-2">
        <a href="<%=request.getContextPath()%>/UsuarioServlet">
            <h1 class="float-start link-dark">Lista de Usuarios</h1>
        </a>
      <!--  <a class="btn btn-primary float-end mt-1" href="<%=request.getContextPath() %>/UsuarioServlet?action=lista">Crear empleado</a>-->
    </div>
    <table class="table table-striped mt-3">
        <tr class="table-primary">
            <th>Usuario_ID</th>
            <th>Nombres</th>
            <th>Apellidos</th>
            <th>Numero telefonico</th>

        </tr>
        <% for (Usuario user : lista) { %>
        <tr>
            <td><%=user.getIdUsuario()%></td>
            <td><%=user.getNombres()%></td>
            <td><%=user.getApellidos()%></td>
            <td><%=user.getTelefono()%></td>

        </tr>
        <% } %>
    </table>

</div>

</body>
</html>
