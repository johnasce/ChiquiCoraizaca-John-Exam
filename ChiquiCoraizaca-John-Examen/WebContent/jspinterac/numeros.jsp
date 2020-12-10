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
<% List<Tipo> lT = (List<Tipo>) request.getAttribute("listaTip"); %>

<% List<Operadora> lO = (List<Operadora>) request.getAttribute("listaOpe"); %>

<% int iter = (Integer) request.getAttribute("numeros"); %>

<% 

for (int i=0; i< iter ;i++){
	out.println("<label for='numero' class='badge badge-success col-sm-2 col-form-label col-form-label-sm'"+i+"'>Numero : </label>");
	out.println("<input name='numero"+i+"' type='text' /> <BR />" );
	
	out.println("<label for='tipo' class='badge badge-success col-sm-2 col-form-label col-form-label-sm'" +i+"'>Tipo: </label> ");
	out.println("<select name='tipo"+i+"'> ");
			
			
	for (int j=0; j< lT.size() ;j++){
				out.println("<option value="+lT.get(j).getId()+">"+lT.get(j).getNombre()+"</option>");
		}
			
			
			out.println("</select>");
			out.println("<label for='opera' class='badge badge-success col-sm-2 col-form-label col-form-label-sm'"+i+"'>Operadora: </label>" );
			out.println("<select name='opera"+i+"'>");
			
			
			for (int j=0;j< lO.size() ;j++){
				out.println("<option value="+lO.get(j).getId()+">"+lO.get(j).getNombre()+"</option>");
			};
			
			out.println("</select>");
	
			
			
			out.println("<br>");
			out.println("<br>");
}

out.println("<INPUT type='submit' class='btn btn-outline-primary center-inline' value='Guardar Contacto'/>");
%>