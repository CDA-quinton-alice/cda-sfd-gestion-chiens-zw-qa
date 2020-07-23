<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Wouf-Inscription</title>
</head>
<body>
<button type="button" class="btn btn-lg btn-info" disabled>Revenir à l'accueil de Wouf</button>

<div class="jumbotron jumbotron-fluid">
  <div class="container">
    <h1 class="display-6">Voici l'espace qui permettra de vous inscrire à Wouf pour pouvoir accéder à votre espace ensuite.</h1>
    <p class="lead"> Hâtez-vous ! Notre monde merveilleux de fans de toutous n'attends que vous ! </p>
    <br>
 	<div class="text-center">
  <img src="static/img/corgi.jpg" class="rounded" alt="corgi">
  <br>
</div>
<br>
  <form>
  <div class="form-group">
    <label for="exampleInputEmail1">votre email</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    <small id="emailHelp" class="form-text text-muted"> Il va évidemment sans dire que nous gardons nos coordonnées pour vous et ne les partageons avec quiconque sans votre accord.</small>
  </div>
     <div class="form-group">
    <label for="exampleInputEmail1">identifiant</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    <small id="emailHelp" class="form-text text-muted"> Avoir un pseudo c'est plus sympa au sein de notre communauté !</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">mot de passe</label>
    <input type="password" class="form-control" id="exampleInputPassword1">
    <small id="emailHelp" class="form-text text-muted"> Nous n'allons pas vous rappeler les règles élémentaires en matière de sécurité de mot de passe, mais évitez les choses comme 1234 !</small>
  	 <button type="submit" class="btn btn-success">s'inscrire à Wouf</button>
  </div>
	<br>
  <img src="static/img/loulou_de_pomeranie.jpg" class="rounded" alt="pomeranie">
  <br>
</div>
</form>
</div>
</body>
</html>