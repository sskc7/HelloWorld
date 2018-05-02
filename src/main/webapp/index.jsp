

<html>
<body>
<h2>Hello World!</h2>
<h2>Hello World2</h2>
<h2>Hello World3!</h2>
<%
         out.println("Your IP address is " + request.getRemoteAddr());

      %>
        <jsp:useBean id = "date" class = "java.util.Date" /> 
      <p>The date/time is <%= date %>
       <p> Balancing Działa </p>
     
</body>
</html>
