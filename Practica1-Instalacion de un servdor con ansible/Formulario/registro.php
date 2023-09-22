<?php

// Conexión a la base de datos
$db = mysqli_connect(null, 'administrador', 'Admin123', 'usuarios');

// Capturar los datos del formulario
$nombre = $_POST["nombre"];
$apellido = $_POST["apellido"];
$edad = $_POST["edad"];
$email = $_POST["email"];
$contraseña = $_POST["password"];
$ciudad = $_POST["ciudad"];
$pais = $_POST["pais"];
$telefono = $_POST["telefono"];

// Insertar los datos en la base de datos

$query = $db->prepare("INSERT INTO users (nombre, apellido, edad, email, contraseña, ciudad, pais, telefono) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
$query->execute(array($nombre, $apellido, $edad, $email, $contraseña, $ciudad, $pais, $telefono));

// Redirigir al usuario a la página de inicio
header("Location: index.html");

?>