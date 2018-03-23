<%@ page import="Hello"%>

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
      
       <jsp:useBean id = "date2" class = "Hello" /> 
      <p>The date/time is <%= date2.sayHello() %>
     
</body>
</html>
