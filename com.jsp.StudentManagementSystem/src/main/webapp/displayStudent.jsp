<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Employee Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        .container {
            width: 50%;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h2 {
            color: #333;
            text-align: center;
        }

        label {
            display: block;
            margin-bottom: 5px;
            color: #333;
        }

        input[type="text"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Hi ${student.getName()}, Here Are Your Details</h2>
        <form:form action="" method="post" modelAttribute="student">
            <label for="id">ID:</label>
            <form:input path="id" id="id" readonly="true" /><br>

            <label for="name">Name:</label>
            <form:input path="name" id="name" readonly="true" /><br>
            
            <label for="email">Email:</label>
            <form:input path="email" id="email" readonly="true"/><br>
            
            <label for="phno">Phone Number:</label>
            <form:input path="phno" id="phno" readonly="true" /><br>
            
            <label for="age">Age:</label>
            <form:input path="age" id="age" readonly="true" /><br>
            
            <label for="gender">Gender:</label>
            <form:input path="gender" id="gender" readonly="true" /><br>
            
            <label for="role">Department:</label>
            <form:input path="department" id="department" readonly="true" /><br>
            <a href="find"><button>Back</button></a>
           <!--  <input type="submit" value="Update Details"> -->
        </form:form>
    </div>
</body>
</html>
