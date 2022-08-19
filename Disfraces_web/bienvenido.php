<?php
session_start();
if (!isset($_SESSION["session_username"])){
    header ("location.login.php");
} else {
 ?>
         <div id="Bienvenido">
         <h2> Bienvenido <span><?php echo $_SESSION['Session_username'];?>!</span></h2>
         <p><a href="logout.php">Finalice</a>Sesión aquí.</p>
    </div>

<?php
}
?>