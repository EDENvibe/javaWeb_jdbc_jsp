<%-- 
    Document   : insertVoiture
    Created on : 27 avr. 2023, 23:40:57
    Author     : PC
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="controleur.controleurVoiture"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
       
        <div id="wrapper">
        <nav class="navbar navbar-default top-navbar" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    
                   
                </button>
                <a class="navbar-brand" href="insertVoiture.jsp"><i class=""></i> <strong>EDEN Trans</strong></a>
            </div>
                  <a href="index.jsp" class="w3-bar-item w3-button">Client</a>
                  <a href="insertVoiture.jsp" class="w3-bar-item w3-button">Voiture</a> 
                  <a href="read.jsp" class="w3-bar-item w3-button">Afficher Liste</a>      
        </nav>
           
      <div class="w3-row-padding">
            <hr/>
            <div class="w3-col m7 ">
                
                
                <form action="ServeletVoiture" method="post" class="w3-container w3-card-4 w3-light-grey w3-text-blue w3-margin">
                 
     
            <div class="form-group">
                    <label>Numero Matricule</label>
                     <input type="text"  name="matricule" class="form-control" placeholder=" Inserer la matricule">
            </div>
             <div class="form-group">
                    <label>Marque</label>
                     <input  type="text" name="marque"  class="form-control" placeholder="La marque du voiture">
            </div>        
            <div class="form-group">
                    <label>Type</label>
                     <input type="text" name="type" class="form-control" placeholder="Type du voiture">
            </div> 
           
 
                <button type="submit" class="btn btn-primary">Ajouter</button>
               </div>
          </div>
                     
                <div class="w3-container">
                    <div class="table-responsive">
                
                <% 
                        controleurVoiture ins = new controleurVoiture();
                        ResultSet rs = ins.ReadVoiture();
                %>
                 <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                       <tr>
                                            <th>id</th>
                                            <th>Matricule</th>
                                            <th>Marque</th>
                                            <th>Type</th>
                                          
                                      </tr>
                                    </thead>
                <% 
                        while(rs.next()){
                %> 
                    <tr>
                        <td><%=rs.getInt(1) %></td>
                        <td><%=rs.getString(2) %></td>
                        <td><%=rs.getString(3) %></td>
                        <td><%=rs.getString(4) %></td>
                        
                        <td>
                            <a href="modifVoiture.jsp?idVoiture=<%=rs.getInt(1) %>"  class="w3-button w3-section w3-light-blue w3-ripple">Modifier</a>
                            <a href="suprVoiture?idVoiture=<%=rs.getInt(1) %>" class="w3-button w3-section w3-red w3-ripple">Supprimer</a>
                        </td>
                    </tr>
                <%
                        }
                %>
                </table>
              </div>
            </div>
     </body>
</html>

