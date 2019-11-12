<%@ page import="utils.Errors" %><%--
  Created by IntelliJ IDEA.
  User: tanya
  Date: 05.11.2019
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>$Title$</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up Form</title>
    <link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
</head>
<body>

<form method="post">

    <h1>Sign Up</h1>

    <fieldset>
        <legend><span class="number">1</span>Your basic info</legend>
        <label for="name">Name:</label>
        <input type="text" id="name" name="user_name" placeholder="Ivan Petrov">
        <p>
        </p>

        <label for="mail">Email:</label>
        <input type="text" id="mail" name="user_email" placeholder="example@example.com">
        <c:if test="${status_email != null}">
            <c:if test="${status_email.equals('true')}">
                <p>OK </p>
            </c:if>
            <c:if test="${!status_email.equals('true')}">
                <p style="color: red">NOT CORRECT EMAIL</p>
            </c:if>
        </c:if>
        <p>
        </p>

        <label for="name">Country</label>
        <select class="form-control" id="country" name="country_name">
            <option>Russia</option>
            <option>Germany</option>
            <option>USA</option>
        </select>
        <p>
        </p>

        <label for="password1">Password:</label>
        <input type="password" id="password1" name="user_password">
        <p>
        </p>


        <label for="password2">Password replay:</label>
        <input type="password" id="password2" name="user_password2">
        <p>
        </p>
        <c:if test="${status_password != null}">
                <c:if test="${status_password.equals('false')}">
                    <p style="color: red">${status_password}</p>
                </c:if>
        </c:if>

        <label>Age:</label>
        <input type="radio" id="under_13" value="under_13" name="user_age"><label for="under_13" class="light">Under
        13</label><br>
        <input type="radio" id="over_13" value="over_13" name="user_age"><label for="over_13" class="light">13 or
        older</label>
        <p>
        </p>


        <label>Gender:</label>

        <input type="radio" id="men" value="men" name="user_gender"><label for="men" class="light">M</label><br>
        <input type="radio" id="women" value="women" name="user_gender"><label for="women" class="light">F</label>
        <p>
        </p>


        <legend><span class="number">2</span>Your profile</legend>
        <label for="bio">Biography:</label>
        <textarea id="bio" name="user_bio"></textarea>
        <p>
        </p>

        <label>Consent to the processing of personal data</label>
        <input type="radio" id="consent" value="consent" name="consent"><label for="under_13"
                                                                               class="light">Consent</label><br>
    </fieldset>


    <button type="submit">Sign Up</button>
</form>

</body>
</html>