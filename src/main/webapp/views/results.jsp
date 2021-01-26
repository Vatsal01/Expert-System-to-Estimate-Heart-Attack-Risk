<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet">  
</head>
<body>
<div align="center">
<h1 class="display-4 p-2"> Result Based on you Health Data</h1> <br>
<br>
<h4 class="display-6 p-2">Chances of Having Heart Attack are : </h4> <br>
<br>
<h2 class="display-5 p-2"> ${user.Result} %</h2>
<br>
<br>
<h3 class="display-5 p-2"> ${user.Msg}</h3>
<br>
<br>
<br>
<br>
<h3 class="display-6 p-2"> Calculated BMI : ${user.BMI} </h3>


</div>

<div class="fixed-bottom">
 <footer class="bg-dark align-top " >
  <div class="d-flex justify-content-between" >
    <div class="p-2 text-white">Vatsal Singh<br>
    </div>
      </div>
        
 </footer>
</div>
</body>
</html>
