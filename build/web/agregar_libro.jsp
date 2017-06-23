<%-- 
    Document   : agregar_libro
    Created on : 22/06/2017, 07:59:31 PM
    Author     : Ariel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Contact Us</title>
<meta name="keywords" content="keyword1, keyword2, keyword3, etc..." />
<meta name="description" content="Description of website here..." />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<!--[if IE ]>
<link href="css/ie.css" rel="stylesheet" type="text/css" />
<![endif]-->
</head>
<body>
<div id="leftMain"> <a href="index.html"><img src="images/logo.gif" alt="School Website" border="0" /></a>
  <div id="navbar">
    <ul>
      <li><a href="index.jsp">Home</a></li>
      <li><a href="agregar_libro.jsp">Agregar libro</a></li> 
      <li><a href="mission.html">School Mission</a></li>
      <li><a href="classes.html">Our Classes</a></li>
      <li><a href="guarantee.html">Our Guarantee</a></li>
      <li><a href="getinvolved.html">Get Involved</a></li>
      <li><a href="directions.html">Directions</a></li>
      <li><a href="contact.html">Contact Us</a></li>
    </ul>
  </div>
  <div id="navbarAlt">
    <ul>
      <li><a href="contact.html">Email </a></li>
    </ul>
  </div>
</div>
<div id="main">
  <div align="right"><img src="images/contact-us.gif" alt="Contact Us" /></div>
  <div id="mainphotos"><img src="images/photo-1.jpg" alt="Photo 1" /><img src="images/photo-2.jpg" alt="Photo 2" /><img src="images/learning-is-fun.gif" alt="Learning is Fun" /><img src="images/photo-3.jpg" alt="Photo 3" /></div>
  <div id="maintext">
    <p>
    </p>
    <p><br />
    <br />
      
</p>
 
<form id="form1" name="form1" method="post" action="process.php">
        <label>Nombre:<br />
        <input type="text" name="nombre" value=""  id="name" />
        
        </label>
        <p>
          <label>Numero de ejemplar:<br />
        <input type="text" name="no_ejemplar" value="" id="email" />
        
        </label>
        </p>
        <p>
          <label>Paginas:<br />
        <input type="text" name="paginas" value="" />
        
        </label>
        </p>
    <p>
          <label>Tema:<br />
        <input type="text" name="tema" value="" />
        
        </label>
        </p>
    <p>
          <label>Código Autor:<br />
        <input type="text" name="nombre" value="" />
        
        </label>
        </p>
    <p>
          <label>Código Estado:<br />
        <input type="text" name="cod_estado" value="" />
        
        </label>
        </p>
    
        <p>
          <input type="submit" name="Submit" value="Send" />
        </p>
      </form>
  </div>
  <div class="clear"></div>
  <div id="footer"> &copy; Your CompaName | <a href="sitemap.html">Site Map</a><br />
    <!-- This template is provided free of charge as long as you keep the link to http://webdevelopmentquote.com -->
    <a href="http://webdevelopmentquote.com/" target="_blank" style="text-decoration:none;">Web Development</a> by WebDevelopmentQuote.com</div>
</div>

<div style="font-size: 0.8em; text-align: center; margin-top: 1.0em; margin-bottom: 1.0em;">
Design downloaded from <a href="http://www.freewebtemplates.com/">Free Templates</a> - your source for free web templates
</div>
</body>

</html>
