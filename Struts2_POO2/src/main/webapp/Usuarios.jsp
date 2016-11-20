<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	</head>
<body>

<h1>Usuarios</h1>
<s:actionerror/>

<s:form action="guar" method="post">
	<s:hidden name="objeUsua.codiUsua"/>
	<s:textfield name="objeUsua.codiAlum" label="Alumno"/>
	<s:textfield name="objeUsua.acceUsua" label="Acceso"/>
	<s:textfield name="objeUsua.contUsua" label="Contraseña"/>
	<s:select list="objeUsua" label="estado">
	  <s:option value="1">Activo</s:option>
	  <s:option value="0">Inactivo</s:option>
	</s:select>
	<s:submit value="Agregar" align="center"/>
</s:form>

<h2>Usuarios</h2>
<table>
<tr>
	<th>Alumno</th>
	<th>Acceso</th>
	<th>Contraseña</th>
	<th>Eliminar</th>
</tr>
<s:iterator value="listUsua" var="objeUsua">
	<tr>
		<td><s:property value="codiAlum"/></td>
		<td><s:property value="acceAlum"/></td>
		<td><s:property value="contAlum"/></td>
		<td><s:property value="estaAlum"/></td>
		<td><a href="elim?id=<s:property value="id"/>">Eliminar</a></td>
	</tr>	
</s:iterator>
</table>
</body>
</html>