<?php

// Conexión a la base de datos
$db = mysqli_connect(null, 'administrador', 'Admin123', 'usuarios');

// Capturar los datos del formulario
$email = $_POST["email"];
$password = $_POST["password"];

// Comprobar si el usuario existe
$query = $db->prepare("SELECT * FROM users WHERE email = ? AND contraseña = ?");
$query->execute(array($email, $password));
$usuario = $query->fetch();

// Si el usuario existe, iniciar sesión
if ($usuario) {
  session_start();
  $_SESSION["usuario"] = $usuario;
  header("Location: Inicio.html");
} else {
  // Si el usuario no existe, mostrar un mensaje de error
  echo "El usuario o la contraseña son incorrectos.";
}

?>