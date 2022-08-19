<?php

$nombre= $_POST ['nombre'];
$clave=$_POST ['clave'];
$conexion=mysqli_connect("localhost","root","","usuarios");
$consulta="select * from usu where usuario='$nombre' and clave='$clave'";// Toma la tabla y el campo porque la conexión con la bd ya estaba realizada

$resultado=mysqli_query($conexion,$consulta);

if($resultado->num_rows>0){
    header("location:bienvenido.html");
}
else{
echo"Error en Datos de Autenticación";
}
?>