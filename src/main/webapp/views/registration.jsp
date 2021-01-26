<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<style>

.registerbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 40%;
  opacity: 0.9;
}

.container {
  padding: 16px;
  background-color: white;
}


input[type=text]{
  width: 40%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

h1{
	font-family: "Sofia";
    font-size: 52px;
    color: #33ccff;
    text-align: center;
	text-shadow: 2px 2px 5px #99ff33;
	}

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
     <script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js"></script>
     <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
     <script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
     <link href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet">  
     <link href="https://fonts.googleapis.com/css?family=Montserrat:900|Work+Sans:300" rel="stylesheet"> 
     <link href="https://fonts.googleapis.com/css?family=Quicksand:300,500" rel="stylesheet"> 
     
</head>
<body>

<div align="center" class="container">
<h1 class="display-4 p-2">Expert system for Heart Attack Risk Estimation</h1>
<form action="subDetails">
<br>
<h3 class="display-4 p-2"> General Details</h3><br>
  First Name : <input type="text" id="FName" name="Fname" required /> <br>
  <br>
  Last Name : <input type="text" id="LName" name="LName" /> <br>
  <br>
  Gender : <input type="radio" name="Gender" value="1" checked=true required/> Male
  <input type="radio" name="Gender" value="2" /> Female <br>
  <br>
  Weight (Kg): <input type="text" id="Weight" name="Weight" required/> <br>
  Height (cm) : <input type="text" id="Height" name="Height" required/> <br>
  Age : <input type="text" id="Age" name="Age" required/> <br>
   <br>
   <h2 class="display-4 p-2"> Health Details</h2>
   <br>
   Cholestrol level(mg/dl) : <input type="text" id="Chol" name="Chol" required/> <br>
   <br>
   Blood Sugar Level (Fasting) : <input type="text" id="BSL" name="BSL" required/> <br>
   <br>
   Blood Pressure Level(mmHg) : <input type="text" id="BPL" name="BPL" required/> <br>
   <br>
   Have Diabetes ? : <input type="radio" name="Diabetes" value="1" checked=true required/> Yes
  <input type="radio" name="Diabetes" value="2" required/> No <br>
 <br>
  Do You Exercise ?  : <input type="radio" name="Exercise" value="1" checked=true required/> Yes
  <input type="radio" name="Exercise" value="2" required/> No <br>
  <br>
  Do You Smoke ?  : <input type="radio" name="Smoke" value="1" checked=true required/> Yes
  <input type="radio" name="Smoke" value="2" required/> No <br>
  <br>
  Are you experiencing any of following : Chest Pain or Discomfort/Shortness of Breath/Numbness, Pain in your legs arms? : <br>
  <br>
  <input type="radio" name="Symptoms" value="1" checked=true required/> Yes
  <input type="radio" name="Symptoms" value="2" required /> No <br>
  
  
  
  <br>
  <input type="submit" value="Submit" class="registerbtn" /><br>
  <br>
  <br>
  <br>
  
</form>


</div>
<div class="bottom">
 <footer class="bg-dark align-top " >
  <div class="d-flex justify-content-between" >
    <div class="p-2 text-white">Dr. Jacek Mazurkiewicz</div>
    <div class="p-2 text-white"> SoftComputing Project Phase - 2 </div>
    <div class="p-2 text-white">Vatsal Singh (257375)<br>
    </div>
      </div>
        
 </footer>
</div>

    
</body>
</html>