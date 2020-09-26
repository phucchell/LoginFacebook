<%-- 
    Document   : index
    Created on : Sep 23, 2020, 10:01:24 AM
    Author     : phuch_cqzh776
--%>

<%@page import="SupportLoginFacebook.FBGetUrl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/d3js/6.1.1/d3.min.js"></script>
    </head>
    <body>
        <h1>Hello World!</h1>

        <h1>login</h1>
        <button id="bnt-login-with-facebook">Facebook</button>
        <script>
            $(document).ready(function () {
                $('#bnt-login-with-facebook').click(function () {
                    window.open('<%= FBGetUrl.getUrl()%>', "_blank", "resizable=yes,top=0,left=500,width=600,height=700");
                });
            });

        </script>
    </body>
</html>
