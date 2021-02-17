<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-br">

	<head>
	
		<meta charset="utf-8">
		<title>appRPG - Cadastrar Novo Usuário</title>
		
		<link rel="stylesheet" type="text/css" href="../css/stylePrincipal.css">
		
		<script type="text/javascript" src="js/popularCombobox.js"></script>
		
	</head>

	<body>
	
		<header>
		
			<%@ include file="header.jsp" %>
			
		</header>
		
		<div class="container">
		
			<div class="box">
			
				<form action="" method="post">
				
					<label for="nomeUsuario">Nome: 
					<input type="text" name="nomeUsuario" id="nomeUsuario">
					</label>
					
					<label for="nascimentoUsuario">Data de Nascimento: 
					<input type="date" name="nascimentoUsuario" id="nascimentoUsuario">
					</label>
					
					<label for="cidadeUsuario">Cidade: 
					<select name="cidadeUsuario" id="cidadeUsuario">
						
						<option>Escolha uma cidade</option>
						
						<c:forEach var="municipio" items="${municipios}">
						
							<option> ${municipio} </option>
						
						</c:forEach>
						
					</select>
					</label>
					
					<label for="emailUsuario">E-mail: 
					<input type="email" name="emailUsuario" id="emailUsuario">
					</label>
					
					<label for="senhaUsuario">Senha: 
					<input type="password" name="senhaUsuario" id="senhaUsuario">
					</label>

					
					<br>
					
					<input type="submit" value="Cadastrar">
					<input type="reset" value="Limpar">
				
				</form>
			
			</div>
		
		</div>

		<footer>
		
			<%@ include file="footer.jsp" %>
		
		</footer>
		
	</body>

</html>