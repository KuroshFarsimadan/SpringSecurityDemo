<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<title>LOGIN PAGE</title>

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
<!-- •Spring Security
•Todentaminen (Authentication)
•Valtuuttaminen (Authorization)
•Käyttäjätiedot XML-tiedostossa
•Käyttäjätiedot tietokannassa
•Web/HTTP Security
•Business Object (Method) Security
 -->
    <!-- Left Nav Section 
    <ul class="left">
      <li><a href="#">Left Nav Button</a></li>
    </ul>
    -->
  </section>
</nav>
<div id="margins">
<div id="leftC">
	<c:if test="${not empty loginerror}">
		<p class="Error">Sisäänkirjautuminen epäonnistui. Käyttäjätunnus tai salasana on syötetty väärin.</p>
	</c:if>

	<c:if test="${not empty loggedout}">
		<p class="Info">Uloskirjautuminen onnistui</p>
	</c:if>
<center>
	<form action="j_spring_security_check" method="post" style="width:50%;">
	<fieldset>
    <legend><h3>LOGIN PAGE</h3></legend>
	<p>kurosh / BananaShake1</p>
   <table>
	<tr>
    	<th></th>
    	<th></th>
  	</tr>
  	<tr>
    	<td>Username:</td>
    	<td>		   	
    		<input type='text' name='j_username' value=''>
    	</td>
  	</tr>
  	<tr>
    	<td>Password:</td>
    	<td>		
    		<input type='password' name='j_password' value=''>
    	</td>
  	</tr>
	</table>
		<button type="submit">Sign in</button>
		
  </fieldset>

	</form>
</center>
</div>
</div>
<div id="footer">
      <div class="container">
        <div id="leftTen"><b> &copy; www.kurosh-farsimadan.com 2014 - 2015, All rights reserved (Page under construction)</b></div>
      </div>
</div>
</body>
</html>