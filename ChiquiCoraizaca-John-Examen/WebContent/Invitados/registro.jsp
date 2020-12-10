<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="ec.edu.ups.entities.Usuario"%>
<%@page import="ec.edu.ups.entities.Tipo"%>
<%@page import="ec.edu.ups.entities.Telefono"%>
<%@page import="ec.edu.ups.entities.Operadora"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
<script src='/ChiquiCoraizaca-John-Examen/JavaScript/crear.js'></script>
<!-- <link rel='stylesheet' type='text/css' href='/ChiquiCoraizaca-John-Examen/CSS/registro.css' />  -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

</head>
<body>

<h1 class="text-center text-primary" id="titulo">Nuevo Usuario</h1>
<div class="container-sm"" height="200px">
<FORM id="formularioT" action="guardarUsuario" method="post">


		
		<DIV id="registro">
		
		<label for="cedula" class="badge badge-success col-sm-2 col-form-label col-form-label-sm">DNI </label> 
		<input name='cedula' type='text'  > <BR />
		<label for="nombre" class="badge badge-success col-sm-2 col-form-label col-form-label-sm" >NOMBRES </label> 
		<input name='nombre' type='text'  > <BR />
		<label for="apellido" class="badge badge-success col-sm-2 col-form-label col-form-label-sm">APELLIDOS </label> 
		<input name='apellido' type='text' > <BR />
		<label for="correo" class="badge badge-success col-sm-2 col-form-label col-form-label-sm">EMAIL</label> 
		<input name='correo' type='text' > <BR />
		<label for="contra" class="badge badge-success col-sm-2 col-form-label col-form-label-sm">PASSWORD</label> 
		<input name='contra' type='text'> <BR />
		</DIV>
<BR />
		

		<DIV id="pantalla">
		
		
		</DIV>


		<DIV id="telefonos">
		<label for="telfs" class="badge badge-success col-sm-2 col-form-label col-form-label-sm">Agregar nuevo telefono </label> 
		<input name='telfs' type='text'>
		<!-- <<label for="numero" class="badge badge-success col-sm-2 col-form-label col-form-label-sm"> NUMERO </label> 
		<input name='numero' type='text'  > <BR />
		<label for="tipo" class="badge badge-success col-sm-2 col-form-label col-form-label-sm">TIPO </label> 
		<input name='tipo' type='text'  > <BR />
		<select name="tipo">
		<label for="opera">Operadora</label>
		</select>
		<select name="opera">
		</select>
		<INPUT type="submit" value='Guardar Telefonos'/> -->
		</DIV>
</FORM>
</div>
		
		<button id="crear" class="btn btn-outline-primary center-block" onclick="createOperadora()">Ingresar</button>
		

</body>
</html>