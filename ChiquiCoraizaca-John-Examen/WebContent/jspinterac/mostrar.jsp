<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="java.io.PrintWriter"%>
<%@page import="ec.edu.ups.entities.Telefono"%>
<%@page import="ec.edu.ups.entities.Operadora"%>
<%@page import="ec.edu.ups.entities.Tipo"%>
<%@page import="ec.edu.ups.entities.Usuario"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostrar Telefonos</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

</head>
<body>

<h1 class="text-center text-primary">LISTAR TELEFONOS</h1>

	<% List<Telefono> list = (List<Telefono>) request.getAttribute("listaTel"); %>

<div class="container-sm"" height="200px">
		<form action="findCedula" method="post">
		
			<label for="cedula" class="badge badge-light">Buscar por Cedula </label> 
			<input name='cedula' type='text'  > <BR />
	       	<input type="submit" class="btn btn-outline-primary center-block" value="Buscar" >
	       	
	   	</form> 
</div>
<div class="container-sm"" height="200px">
		<form action="findNumero" method="post">
		
			<label for="numero" class="badge badge-light">Buscar por Numero Telefono </label> 
			<input name='numero' type='text'> <BR />
	       	<input type="submit" class="btn btn-outline-primary center-block" value="Buscar" >
	       	
	   	</form>
</div>
	
	<br>
	<br>

	<table class='tg' style='width:90%'>
	    <tr>
	        <th class='tg-46ru'>Propietario:</th>
	        <th class='tg-46ru'>Telefono</th>
	        <th class='tg-46ru'>Tipo</th>
	        <th class='tg-46ru'>Operadora</th>
	       
	    </tr>

	    <% 
	    
	    if (list == null) {
	    	out.println("<tr>");
	    	out.println("<td class='tg-y698'><label colspan='4'> No existen numeros </label></td>");
	    	out.println("</tr>");
	    }else{
	    	 
	    	for (int i=0;i<list.size();i++){
	    			Telefono tel = list.get(i);
		    		int id = tel.getId();
		    		out.println("<tr>");
		    		out.println("<td class='tg-y698'><label name='nombre"+id+"'>"+tel.getUsuario().getNombre()+" "+tel.getUsuario().getApellido()+"</label></td>");
		    		out.println("<td class='tg-y698'><label name='telefono"+id+"'>"+tel.getNumero()+"</label></td>");
		    		out.println("<td class='tg-y698'><label name='tipo"+id+"'>"+tel.getTipo().getNombre()+"</label></td>");
		    		out.println("<td class='tg-y698'><label name='operadora"+id+"'>"+tel.getOperador().getNombre()+"</label></td>");
		    		out.println("</tr>");
		       	}
	    }
	    
	    
	   
	    %>
	    <a href="/ChiquiCoraizaca-John-Examen/index.html">    
	    
		<h2 class="text-center text-primary" >Pagina Principal</h2>
	
	</table>


</body>
</html>