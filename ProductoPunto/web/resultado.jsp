
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Resultado</title>
  </head>
  <body>
    <h1>Resultado</h1>
  
    <!--Declaramos el JavaBean a utilizar-->
    <jsp:useBean id="datos" class="beans.datos"
                 scope="session" />
    <br>
    <br>
    <%
          //Valores en codigo duro
          int V11 = Integer.parseInt(request.getParameter("V11"));
          int V12 = Integer.parseInt(request.getParameter("V12"));
          int V21 = Integer.parseInt(request.getParameter("V21"));
          int V22 = Integer.parseInt(request.getParameter("V22"));
          double resultado=(V11*V21+V12*V22);
        %>
    
    Resultado <%= resultado%>

    <br>
    <br>
    <a href="index.html">Inicio</a>
  </body>
</html>
