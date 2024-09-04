<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ page isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>tissues</title>
                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
        </head>

        <body>
<h1 style="color:red">

<h1 style="color:red"> ${errorMsg}</h1>
<h1 style="color:red"> ${message}</h1>

</h1>
            <div class="container mt-5 bg-light">
                <h1 class="mb-4 text-center">Trainee Information</h1>

                <form action="saveTrainee" method="post">
                    <div class="row g-3">
                        <div class="col-md-6">
                            <label for="chocolateName" class="form-label">Enter your Name </label>
                            <input type="text" id="chocolateName" name="traineeName" class="form-control"
                                placeholder="Enter your name" value="${dto.traineeName}">
                        </div>


                        <div class="col-md-6">
                            <label for="email" class="form-label">enter your CGPA</label>
                            <input type="number" id="email" name="cgpa" class="form-control"
                                placeholder="Enter your cgpa" value="${dto.cgpa}">
                        </div>
                        <div class="col-12">
                            <button type="submit" class="btn btn-primary w-100">save details</button>
                        </div>
                    </div>
                </form>
            </div>

            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
        </body>

        </html>