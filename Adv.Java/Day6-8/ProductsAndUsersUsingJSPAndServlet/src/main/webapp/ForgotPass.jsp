<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot Pass</title>
</head>
<body>

	<h1>Change Password</h1>
	<form action="changePass" method="post">
		<h3>
			User Name : <input type="text" placeholder="Enter Username..."
				id="unm" name="unm">
		</h3>
		<h3>
			Email : <input type="email" placeholder="Enter Email..." id="mail"
				name="mail">
		</h3>
		<h3>
			New Password : <input type="text" placeholder="Enter new password..."
				id="newPass" name="newPass">
		</h3>
		<button type="submit" name="add" id="add">Change</button>
		<br> <br> <a href="Login.html" name='fpass' id='fpass'>
			Login As Existing User ?</a> <a href="registerUser" name='register'
			id='register'> Register As New User ?</a>

	</form>
</body>
</html>