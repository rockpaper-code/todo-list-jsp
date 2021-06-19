<!DOCTYPE html>

<%@page import="br.com.tdstecnologia.domain.Card"%>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		
		<link href="static/bootstrap.min.css" rel="stylesheet" />
	</head>
	<body>
		<nav class="navbar navbar-light bg-light">
		  <div class="container">
		    <span class="navbar-brand mb-0 h1">Navbar</span>
		  </div>
		</nav>
		
		<div class="container">
			<div class="row">
				<div class="col-12 border p-3 rounded my-3">
					<a href="#">
						<h2>Adicionar Card</h2>
					</a>
				</div>			
			</div>
			<div class="row">
				
				<%
					Card note = (Card) request.getAttribute("teste");
				%>
				
				
				
				<div class="col-sm-12 col-md-4 p-2">				
					<div class="card ">
					  <div class="card-body">
					    <h5 class="card-title"><%= note.getTitulo() %></h5>
					    <p class="card-text"><%= note.getDescricao() %></p>
					    
					    <div>
					    	<button class="btn btn-primary">Editar</button>
					    	<button class="btn btn-danger">Remover</button>
					    </div>
					    
					  </div>
					</div>
				</div>
				
				
			</div>
		</div>
		
	</body>
</html>