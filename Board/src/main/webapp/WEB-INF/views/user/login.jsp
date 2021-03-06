<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Board | Login </title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
    <!-- Bootstrap 3.3.4 -->
    <link href="/resources/bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <!-- Font Awesome Icons -->
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
    <!-- Theme style -->
    <link href="/resources/dist/css/AdminLTE.min.css" rel="stylesheet" type="text/css" />
    <!-- iCheck -->
    <link href="/resources/plugins/iCheck/square/blue.css" rel="stylesheet" type="text/css" />

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    
</head>

<body class="login-page">
<div class="login-box">
<div class="login-logo">
<a href = "/"><b>Board Project</b></a>
</div><!--/.login-logo -->

<div class="login-box-body">
<p class="login-box-msg" style="font-size:150%;">Sign in to start!</p>

<form action="/user/loginPost" method="post">

<div class="form-group has-feedback">
<input type="text" name="userId" class="form-control" placeholder="User Id" />
<span class="glyphicon glyphicon-envelope form-control-feedback"></span>
</div>
<div class="form-group has-feedback">
<input type="password" name="userpw" class="form-control" placeholder="Password" />
<span class="glyphicon glyphicon-lock form-control-feedback"></span>
</div>
<div class="row">
<div class="col-xs-8">
<div class= "checkbox icheck"> 
<label style="margin-left:20px;">
<input type="checkbox" name="useCookie"> Remember Me
</label>
</div>
</div><!-- /.col -->
<div class="col-xs-4">
<button type="submit" class="btn btn-primary btn btn-block btn-flat">Sign In</button>
</div><!-- /.col -->
</div>
</form>

<div class="row">
<a href = "signup" style="margin-left:20px;">Don't have an account yet? sign up here</a>
</div>
</div>


</form>
</div>
</div>

</html>