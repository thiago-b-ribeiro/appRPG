<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-br">

	<head>
	
		<meta charset="utf-8">
		<title>appRPG - Login</title>
		
		<link rel="stylesheet" type="text/css" href="css/stylePrincipal.css">
					
	</head>

	<body>
	
		<header>
		
			<%@ include file="jsp/header.jsp" %>
			
		</header>
		
		<div class="container">
		
			<div class="box">
			
				<form action="" method="post">
				
					<label for="email">E-mail: </label>
					<input type="email" name="email" id="email">
					
					
					<label for="senha">Senha: 
					<input type="password" name="senha" id="senha">
					</label>
					
					<br>
					
					<input type="submit" value="Entrar">
					<input type="button" value="Cadastrar" onClick="javascript:window.location='ServletCadastrarUsuario'"/>
					<input type="reset" value="Limpar">
				
				</form>
			
			</div>
		
		</div>
		
		<footer>
		
			<%@ include file="jsp/footer.jsp" %>
		
		</footer>
		
	</body>

</html>