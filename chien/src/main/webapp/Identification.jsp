<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Wouf-Identification</title>
</head>
<body>

	<button type="button" class="btn btn-lg btn-info" disabled>Revenir à l'accueil de Wouf</button>

<div class="jumbotron jumbotron-fluid">
  <div class="container">
    <h1 class="display-6">Bonjour,</h1>
    <p class="lead">Veuillez vous identifier afin d'accéder à votre espace personnel Wouf.</p>
    <br>
 	<div class="text-center">
  <img src="static/img/patou.jpg" class="rounded" alt="patou">
  <br>
</div>
<br>
  <form>
  <div class="form-group">
    <label for="exampleInputEmail1">email</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    <small id="emailHelp" class="form-text text-muted"> Bien entendu, nous préférons toujours vous rappeler que nous ne le partageons avec quinconque sans votre accord.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">mot de passe</label>
    <input type="password" class="form-control" id="exampleInputPassword1">
  </div>
  <button type="submit" class="btn btn-primary">s'identifier</button>
  <br> <br>
      <h1 class="display-6">Pas encore inscrit.e à Wouf ? Qu'attendez-vous pour vivre à fond votre passion des toutous ?</h1>
      <br>
      <div class="text-center">
  <img src="static/img/Popeye.jpg" class="rounded" alt="popeye">
</div>
<br>
    <button type="submit" class="btn btn-success">s'inscrire à Wouf</button>
    <br>
  
</form>
</div>
</body>
</html>