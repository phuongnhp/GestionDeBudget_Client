<%-- 
    Document   : login
    Created on : 24 févr. 2017, 09:27:04
    Author     : phuong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN</title>
    </head>
    <body>
        <h1>bienvenue</h1>
        <form method="post" action="j_spring_security_check">
            Identifiant :<input name="j_username" value="" type="text" />
            <br/>
            Mot de passe :<input name="j_password" type="password" />
            <input value="Valider" type="submit" />
        </form>
        <a href="signup.xhtml">S'inscrire</a>
    </body>
</html>
