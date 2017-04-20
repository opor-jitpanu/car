<%-- 
    Document   : index
    Created on : Apr 20, 2017, 6:21:56 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0"/>
        <title>Starter Template - Materialize</title>

        <!-- CSS  -->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    </head>



    <body>

        <nav class="light-blue lighten-1" role="navigation">
            <div class="nav-wrapper container"><a id="logo-container" href="index.jsp" class="brand-logo">Automobile Maintenance</a>
                <ul class="right hide-on-med-and-down">
                    <li><a href="promotion.html">Promotion</a></li>
                    <li><a href="service.html">Service</a></li>
                    <li><a href="aboutus.html">About us</a></li>
                    
                        <c:if test="${ sessionScope.user != null}">
                            <li><a href="LogoutServlet">Logout</a></li>
                        </c:if>
                        <c:if test="${ sessionScope.user ==null }">
                            <li><a href="login.html">Login</a></li>
                        </c:if>
          
                          
                </ul>
                

                <a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">menu</i></a>

            </div>
        </nav>





        <div class="section no-pad-bot" id="index-banner">
            <div class="container">
                <br><br>
                <h1 class="header center orange-text">Automobile Maintenance</h1>
                <div class="row center">
                    <h5 class="header col s12 light">All new Automobile Maintenance System first in the World!</h5>
                </div>
                <!--<div class="row center"> 
                  <a href="http://materializecss.com/getting-started.html" id="download-button" class="btn-large waves-effect waves-light orange">Get Started</a>
                </div>-->


                ${sessionScope.roles}









                <br><br>

            </div>
        </div>


        <div class="container">
            <div class="section">

                <!--   Icon Section   -->

                <div class="row">

                    <div class="col s1">
                    </div>
                    <div class="col s4">
                        <div class="icon-block">
                            <h2 class="center light-blue-text"> 
                                <h2 class="center light-blue-text"><i class="material-icons">flash_on</i></h2>
                                <h5 class="center">Promotions</h5>


                                <!-- <h5 class="center">Speeds up development</h5>
                     
                                 <p class="light">We did most of the heavy lifting for you to provide a default stylings that incorporate our custom components. Additionally, we refined animations and transitions to provide a smoother experience for developers.</p>-->
                                <div class="row center"> 
                                    <a href="promotion.html" id="download-button" class="btn-large waves-effect waves-light orange">Promotions</a>
                                </div>

                        </div>

                    </div>
                    <div class="col s1">
                    </div>
                    <div class="col s1">
                    </div>

                    <div class="col s4">
                        <div class="icon-block">
                            <h2 class="center light-blue-text"><i class="material-icons">settings</i></h2>
                            <h5 class="center">Services</h5>


                            <div class="row center"> 
                                <a href="service.html" id="download-button" class="btn-large waves-effect waves-light orange">Services</a>
                            </div>
                        </div>
                    </div>

                    <div class="col s1">
                    </div>
                </div>


                <div class="row">
                    <div class="col s1">
                    </div>

                    <div class="col s4">
                        <div class="icon-block">
                            <h2 class="center light-blue-text"><i class="material-icons">chat</i></h2>
                            <h5 class="center">Customers' Reviews</h5>


                            <div class="row center"> 
                                <a href="review.html" id="download-button" class="btn-large waves-effect waves-light orange">Reviews</a>
                            </div>
                        </div>
                    </div>

                    <div class="col s1">
                    </div>
                    <div class="col s1">
                    </div>

                    <div class="col s4">
                        <div class="icon-block">
                            <h2 class="center light-blue-text"><i class="material-icons">group</i></h2>
                            <h5 class="center">About Us</h5>

                            <div class="row center"> 
                                <a href="aboutus.html" id="download-button" class="btn-large waves-effect waves-light orange">About us</a>
                            </div>
                        </div>
                    </div>


                </div>

                <br><br>

                <div class="section">

                </div>
            </div>
        </div>
        <footer class="page-footer orange">
            <div class="container">
                <div class="row">
                    <div class="col l6 s12">
                        <h5 class="white-text">Automobile Maintenance System</h5>
                        <p class="grey-text text-lighten-4">We are a team of college students making the Automobile Maintenance System.</p>


                    </div>


                </div>
            </div>
            <div class="footer-copyright">
                <div class="container">
                    Made by <a class="orange-text text-lighten-3" href="#">IT KMITL</a>
                </div>
            </div>
        </footer>






        <!--  Scripts-->
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="js/materialize.js"></script>
        <script src="js/init.js"></script>

    </body>

</html>
