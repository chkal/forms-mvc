<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Forms MVC</title>

    <script src="${pageContext.request.contextPath}/webjars/jquery/1.11.0/dist/jquery.js"></script>

    <link href="${pageContext.request.contextPath}/webjars/bootstrap/3.3.4/dist/css/bootstrap.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/webjars/bootstrap/3.3.4/dist/js/bootstrap.js"></script>

  </head>

  <body>

    <div class="container">

      <h1>Forms</h1>

      <!-- In real world application this should go into a tag file -->
      <c:if test="${not empty messages.infos}">
        <div class="alert alert-info" role="alert">
          <ul class="list-unstyled">
            <c:forEach var="info" items="${messages.infos}">
              <li>${info}</li>
            </c:forEach>
          </ul>
        </div>
      </c:if>
      <c:if test="${not empty messages.errors}">
        <div class="alert alert-danger" role="alert">
          <ul class="list-unstyled">
            <c:forEach var="error" items="${messages.errors}">
              <li>${error}</li>
            </c:forEach>
          </ul>
        </div>
      </c:if>

      <form action="${pageContext.request.contextPath}/r/forms"
            method="POST" class="form">

        <div class="form-group">
          <label for="text">Text input</label>
          <input id="text" name="text" type="text" class="form-control"
                 placeholder="some text" autofocus value="${initial.text}">
          <p class="help-block">Minimal length: 5</p>
        </div>

        <div class="form-group">
          <label for="number">Number input</label>
          <input id="number" name="number" type="text" class="form-control"
                 placeholder="some integer" value="${initial.number}">
          <p class="help-block">Some value between 1 and 100</p>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>

      </form>

    </div>

  </body>
</html>