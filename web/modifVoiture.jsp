<%-- 
    Document   : modifVoiture
    Created on : 28 avr. 2023, 01:57:51
    Author     : PC
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="controleur.controleurVoiture"%>
<%@page import="model.voiture"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<% 
                        int idv = Integer.parseInt(request.getParameter("idVoiture"));
                        voiture mod = new voiture();
                        mod.setIdVoitur(idv);
                        //String sql = "Select * from etudiant";
                        //AccessBdd bdd = new AccessBdd();
                        //bdd.loadDriver();
                        //ResultSet rs = bdd.executeSelect(sql);
                        
                        controleurVoiture ins = new controleurVoiture();
                        ResultSet rs = ins.edition(mod);
                %>
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
                <a class="navbar-brand" href="index.jsp"><i class=""></i> <strong>EDEN Trans</strong></a>
            </div>
                 <a href="index.jsp" class="w3-bar-item w3-button">Client</a>
                  <a href="insertVoiture.jsp" class="w3-bar-item w3-button">Voiture</a> 
                  <a href="read.jsp" class="w3-bar-item w3-button">Afficher Liste</a>
                  
         </nav>
        
        <div class="w3-row-padding">
            <% 
                        if(rs.next()){
                %>
                
                
                
                <hr/>
                
                
                
            <div class="w3-col m5 w3-animate-zoom">
                
                <form action="EditVoiture" method="post" class="w3-container w3-card-4 w3-light-grey w3-text-blue w3-margin">
                    
                     <label for="exampleInputUsername" class="sr-only">Id</label>
                                <div class="position-relative has-icon-right">
                                    <input type="text" id="exampleInputUsername" name="idVoiture" class="form-control input-shadow" value="<%= rs.getInt(1) %>">
                                </div>
                     <div class="form-group w3-container w3-section">
                                <label for="exampleInputUsername" class="sr-only">Numero Matricule</label>
                                <div class="position-relative has-icon-right">
                                    <input type="text" id="exampleInputUsername" name="matricule" class="form-control input-shadow" value="<%= rs.getString(2) %>">
                                </div>

                     </div>
                     <div class="form-group w3-container w3-section">
                                <label for="exampleInputUsername" class="sr-only">Marque</label>
                                <div class="position-relative has-icon-right">
                                    <input type="text" id="exampleInputUsername" name="marque" class="form-control input-shadow" value = "<%= rs.getString(3) %>">
                                </div>

                     </div>
                     <div class="form-group w3-container">
                                   <label for="exampleInputUsername" class="sr-only">Type</label>
                                    <div class="position-relative has-icon-right"> 
                                        <input type="text" id="exampleInputUsername" name="type" class="form-control input-shadow" value="<%= rs.getString(4) %>">
                                           <div class="form-control-position">
                                                   <i class="icon-user"></i>
                                           </div>
                                     </div>
                     </div>

                     <button  type="submit" class="w3-button w3-section w3-blue w3-ripple">Modifier</button>

        </form>
            </div>
            <div class="w3-col m7">
                <div class="w3-container">
                <p>Liste des client:</p>
                <table class="w3-table w3-striped">
                    <tr>
                        <th>id</th>
                        <th>Matricule</th>
                        <th>Marque</th>
                        <th>Type</th>
                    </tr>
                    <tr>
                        <td><%=rs.getInt(1) %></td>
                        <td><%=rs.getString(2) %></td>
                        <td><%=rs.getString(3) %></td>
                        <td><%=rs.getString(4) %></td>
                        
                        <td>
                            <a href="suprVoiture?idVoiture=<%=rs.getInt(1) %>" class="w3-button w3-section w3-red w3-ripple">Supprimer</a>
                        </td>
                    </tr>
                <%
                        }else{ %>
                        <p>tsy misy</p>
                                <%
                        }
                %>
                </table>
              </div>
            </div>
        </div>
    </body>
</html>
