<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Simple Web Application</title>
	  <style>
  body{
  font-family: 'Open Sans', sans-serif;
  text-align:center;
  margin: 200px 0px 200px 0px;
}




.box{

  width:300px;
  margin: 0 auto 0 auto;
  padding:0px 0px 70px 0px;

}

.fields{

  padding: 8px;
  width:250px;
  margin-top:10px;
  border: green 1px solid;

}



.button{

  width:125px;


  border: green 1px solid;

  margin-top:20px;

}




  </style>
</head>
<body>
<s:form action="login">
<div class="box">
<h1>C3002 Login</h1>
<s:textfield  name="username" cssClass="fields">
</s:textfield>
<s:password name="password" cssClass="fields">
</s:password>
<s:submit value="Login" cssClass="button"></s:submit>
<br>
Your login attempt was unsuccessful
</div>
</s:form>

</body>
</html>