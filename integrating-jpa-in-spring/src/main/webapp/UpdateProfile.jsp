<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ page isELIgnored="false" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

            <html>

            <head>

                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">

            </head>

            <body>
        
   <div class="container mt-5 bg-light">
                <h1 class="mb-4 text-center"> Update Trainee Information</h1>

                <form action="updateTraineeDetails" method="post">
                    <div class="row g-3">
<input type="text" id="chocolateName" name="id" class="form-control" value="${dto.id}" hidden>


                        <div class="col-md-6">
                            <label for="chocolateName" class="form-label">Enter your new Name </label>
                            <input type="text" id="chocolateName" name="traineeName" class="form-control"
                                placeholder="Enter your name" value="${dto.traineeName}" >
                        </div>


                        <div class="col-md-6">
                            <label for="email" class="form-label">enter your new CGPA</label>
                            <input type="number" id="email" name="cgpa" class="form-control"
                                placeholder="Enter your cgpa" value="${dto.cgpa}" >
                        </div>
                        <div class="col-12">
                            <button type="submit" class="btn btn-primary w-100">save details</button>
                        </div>
                    </div>
                </form>
            </div>


            </body>

            </html>