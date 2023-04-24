<%-- 
    Document   : envio
    Created on : 06-01-2019, 08:22:15 AM
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
        <jsp:useBean id="mensa" scope="request" class="javabeans.MensajeBean" />
        <jsp:setProperty name="mensa" property="*" />
        <%
            if(request.getParameter("texto") != null){
        %>
        <jsp:forward page="Controlador?operacion=grabar"/>
        <%
            }          
        %>
        <body>
            <center>
                <h1>Generación de mensajes</h1>
                <form method="post">
                    <br><br>
                    <b>Datos del mensaje:</b><br/><br/>
                    Introduzca destinatario: <input type="text" name="destino"><br/>
                    Introduzca remitente: <input type="text" name="remite"><br/>
                    Introduzca texto: <textarea name="texto" id="texto"></textarea><br/>
                    <hr><br/>
                    <input type="submit" name="submit" value="Enviar">
                    <input type="reset" value="Reset">
                </form>
            </center>
        </body>
</html>
