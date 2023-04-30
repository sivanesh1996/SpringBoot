<html>
<head>
<title>Save contact</title>
<style>
body{
background-color:lightblue;
}
</style>
</head>
<body>
<h2>${ct} updated successfully:</h2>

<h2>Save another contact</h2>
<form action="save">
Enter Name:<input type="text" name="name"><br>
Enter mobile:<input type="text" maxlength="10" name="mobile" value="enter 10 digits only"><br>
<input type="submit" value="save"> <br>
</form>
<a href="http://localhost:8080/home">click here to return to homepage</a>


</body>
</html>