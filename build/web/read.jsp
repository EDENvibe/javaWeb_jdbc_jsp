<%-- 
    Document   : read
    Created on : 28 avr. 2023, 09:41:12
    Author     : PC
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="controleur.controleur"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Agence de transport</title>
    <!-- Bootstrap Styles-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FontAwesome Styles-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!-- Morris Chart Styles-->
    <link href="assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
    <!-- Custom Styles-->
    <link href="assets/css/custom-styles.css" rel="stylesheet" />
    <!-- Google Fonts-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' /> 
     <link rel="stylesheet" href="css/w3.css">
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div class="w3-container">
             <nav class="navbar navbar-default top-navbar" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    
                   
                </button>
                <a class="navbar-brand" href="index.jsp"><i class=""></i> <strong>EDEN Trans</strong></a>
            </div>
                  <a href="index.jsp" class="w3-bar-item w3-button">Client</a>
                  <a href="insertVoiture.jsp" class="w3-bar-item w3-button">Reservation</a> 
                  <a href="read.jsp" class="w3-bar-item w3-button">Afficher Liste</a>
                  <a href="" onclick="imprimer('pdf')" class="w3-bar-item w3-button">PDF</a>
        
        </nav>
            <br/>
            <br/>
             <br/> 
             <div class="table-responsive" id="pdf">
                
                <% 
                        controleur ins = new controleur();
                        ResultSet rs = ins.ReadList();
                %>
                 <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                       <tr>
                                            <th>Matricule</th>
                                            <th>Marque de la voiture</th>
                                            <th>Nom du client</th>
                                            <th>Prenom du client</th>
                                            <th>Numero de telephone</th>
                                            <th>Type</th>
                                      </tr>
                                    </thead>
                <% 
                        while(rs.next()){
                %> 
                    <tr>
                        <td><%=rs.getString(1) %></td>
                        <td><%=rs.getString(2) %></td>
                        <td><%=rs.getString(3) %></td>
                        <td><%=rs.getString(4) %></td>
                        <td><%=rs.getInt(5) %></td>
                         <td><%=rs.getString(6) %></td>
                        
                        
                    </tr>
                <%
                        }
                %>
                </table>
              </div>
            </div>
                <script src="css/Print.js">  </script>
    </body>
</html>
