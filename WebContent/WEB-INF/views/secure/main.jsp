<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE> <!--  html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MAIN PAGE</title>

<!-- Stylesheet declaration and import below -->
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/5.5.0/css/foundation.css">
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/5.5.0/css/foundation.min.css">
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/5.5.0/css/normalize.css">
<link rel="stylesheet" type="text/css" href="resources/css/main.css">



<!-- Javascript/JQuery declaration and import below -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/foundation/5.5.0/js/foundation.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/foundation/5.5.0/js/foundation/foundation.js"></script>



</head>
<body>
<nav class="top-bar" data-topbar role="navigation">
  <ul style="margin-left:35%;width:40%;" class="title-area">
    <li class="name" >
    <center>
      <h1><a href="loginpage">Java EE Example Project</a></h1>
     </center>
    </li>
     <!-- Remove the class "menu-icon" to get rid of menu icon. Take out "Menu" to just have icon alone -->
    <!--  <li class="toggle-topbar menu-icon"><a href="#"><span>Menu</span></a></li>-->
  </ul>
<!--  
  <section class="top-bar-section">
   
    <ul class="right">
      <li class="active"><a href="#">Right Button Active</a></li>
      <li class="has-dropdown">
        <a href="#">Right Button Dropdown</a>
        <ul class="dropdown">
          <li><a href="#">First link in dropdown</a></li>
          <li class="active"><a href="#">Active link in dropdown</a></li>
        </ul>
      </li>
    </ul>
    -->

    
    <ul class="left" style="color:white;margin-top:10px;margin-left:10%;">
      <li>Logged as: <sec:authentication property="principal.username"/></li>
    </ul>
  </section>
</nav>
<h1>MAIN PAGE</h1>
Logged in: <sec:authentication property="principal.username"/>



<sec:authorize access="hasRole('ROLE_ADMIN')">
<p><a href="admin/tools">Admin tools</a></p>
</sec:authorize>


 
<p><a href="../j_spring_security_logout" > Logout</a></p>

</body>
</html>