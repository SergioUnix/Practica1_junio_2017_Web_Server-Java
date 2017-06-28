<%-- 
    Document   : agregar_autor
    Created on : 22/06/2017, 10:15:47 PM
    Author     : Ariel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Biblioteca en Linea</title>
<meta name="keywords" content="keyword1, keyword2, keyword3, etc..." />
<meta name="description" content="Description of website here..." />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<!--[if IE ]>
<link href="css/ie.css" rel="stylesheet" type="text/css" />
<![endif]-->
</head>
<body>
<div id="leftMain"> <a href="index.jsp"><img src="images/logo.gif" alt="School Website" border="0" /></a>
  <div id="navbar">
    <ul>
       <li><a href="index.jsp">Inicio</a></li>
      <li><a href="agregar_libro.jsp">Agregar libro</a></li> 
      <li><a href="consulta_libro.jsp">Consulta Libro</a></li>
      <li><a href="agregar_autor.jsp">Agregar Autor</a></li>
       <li><a href="pretamo.jsp">Realizar Un Prestamo</a></li>
       <li><a href="agregar_estudiante.jsp">Agregar Estudiante</a></li>
      <li><a href="directions.html">Directions</a></li>
      <li><a href="contact.html">Contact Us</a></li>
    </ul>
  </div>
  <div id="navbarAlt">
   
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
 
<form id="form1" name="form1" method="post" action="">
        <label>Nombre:<br />
        <input type="text" name="nombre" value=""  id="name" />
        
        </label>
        <p>
          <label>Tipo Autor:<br />
                <select  name="cod_tipo_autor">
            <option>Original</option>
            <option>Anónimo</option>
        </select>
        
        </label>
        </p>
     
        <p>
            
          <input type="submit" name="grabar" value="Agregar" />
          
        </p>
      </form>
  </div>
  
  
     <%-- start web service invocation --%><hr/>
    <%
    try {
	practica.WebServicePractica1_Service service = new practica.WebServicePractica1_Service();
	practica.WebServicePractica1 port = service.getWebServicePractica1Port();
	 // TODO initialize WS operation arguments here
	java.lang.String nombre = request.getParameter("nombre");
        int codTipoAutor;
      
        if(request.getParameter("cod_tipo_autor").equals("Original")){
	codTipoAutor = 1;
    }else 
    {codTipoAutor = 2;}
	
// TODO process result here
	java.lang.String result = port.agregarAutor(nombre, codTipoAutor);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>


  
  
  

</body>

</html>
