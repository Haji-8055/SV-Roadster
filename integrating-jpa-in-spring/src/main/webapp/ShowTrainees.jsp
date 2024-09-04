<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ page isELIgnored="false" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

            <html>

            <head>

                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">

            </head>

            <body>
                <h1 style="color: red ; text-align: center;">${message}</h1>


                <table border="2" class="table table-primary">
                    <tr>
                    <th>id</th>
                        <th>Trainee name</th>
                        <th>Trainee Cgpa</th>
                        <th>Edit</th>
                        <th>Delete</th>
                    </tr>

                    <c:forEach items="${trainees}" var="dto">
                        <tr>
                              <td>${dto.id}</td>
                            <td>${dto.traineeName}</td>
                            <td>${dto.cgpa}</td>
                            <td><a href="UpdateProfile?traineeName=${dto.traineeName}" class="btn btn-primary"> edit details</a></td>
                            <td><a href="deleteProfile?traineeName=${dto.traineeName}" class="btn btn-primary"> delete trainee</a></td>
                        </tr>
                    </c:forEach>

                    <tr>
                          <td>${obbane.id}</td>
                        <td>${obbane.traineeName}</td>
                        <td>${obbane.cgpa}</td>

                    </tr>

                </table>

                <form action="searchTrainee">

                    <input type="text" name="traineeName">
                    <input type="submit" value="search trainee">
                </form>

                        <td><a href="UpdateProfile.jsp"> edit details</a></td>


            </body>

            </html>