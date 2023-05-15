package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import controleur.controleurVoiture;

public final class insertVoiture_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>Agence de transport</title>\n");
      out.write("    <!-- Bootstrap Styles-->\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- FontAwesome Styles-->\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- Morris Chart Styles-->\n");
      out.write("    <link href=\"assets/js/morris/morris-0.4.3.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- Custom Styles-->\n");
      out.write("    <link href=\"assets/css/custom-styles.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- Google Fonts-->\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' /> \n");
      out.write("     <link rel=\"stylesheet\" href=\"css/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("        <nav class=\"navbar navbar-default top-navbar\" role=\"navigation\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".sidebar-collapse\">\n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\"><i class=\"\"></i> <strong>EDEN Trans</strong></a>\n");
      out.write("            </div>\n");
      out.write("                  <a href=\"index.jsp\" class=\"w3-bar-item w3-button\">Client</a>\n");
      out.write("                  <a href=\"insertVoiture.jsp\" class=\"w3-bar-item w3-button\">Reservation</a> \n");
      out.write("                  <a href=\"#home\" class=\"w3-bar-item w3-button\">Home</a>\n");
      out.write("                  <a href=\"#home\" class=\"w3-bar-item w3-button\">Home</a>       \n");
      out.write("        </nav>\n");
      out.write("                 \n");
      out.write("      <div class=\"w3-row-padding\">\n");
      out.write("            \n");
      out.write("            <div class=\"w3-col m6 \">\n");
      out.write("                <form action=\"ServeletVoiture\" method=\"post\" class=\"w3-container w3-card-4 w3-light-grey w3-text-blue w3-margin\">\n");
      out.write("                 \n");
      out.write("                    \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                    <label>Numero Matricule</label>\n");
      out.write("                     <input type=\"text\"  name=\"matricule\" class=\"form-control\" placeholder=\" Inserer la matricule\">\n");
      out.write("            </div>\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("                    <label>Marque</label>\n");
      out.write("                     <input  type=\"text\" name=\"marque\"  class=\"form-control\" placeholder=\"La marque du voiture\">\n");
      out.write("            </div>        \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                    <label>Type</label>\n");
      out.write("                     <input type=\"text\" name=\"\ttype\" class=\"form-control\" placeholder=\"Type du voiture\">\n");
      out.write("            </div> \n");
      out.write("           \n");
      out.write(" \n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Ajouter</button>\n");
      out.write("               </div>\n");
      out.write("          </div>\n");
      out.write("                     \n");
      out.write("                <div class=\"w3-container\">\n");
      out.write("                    <div class=\"table-responsive\">\n");
      out.write("                \n");
      out.write("                ");
 
                        controleurVoiture ins = new controleurVoiture();
                        ResultSet rs = ins.ReadClient();
                
      out.write("\n");
      out.write("                 <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                    <thead>\n");
      out.write("                                       <tr>\n");
      out.write("                                            <th>id</th>\n");
      out.write("                                            <th>Matricule</th>\n");
      out.write("                                            <th>Marque</th>\n");
      out.write("                                            <th>Type</th>\n");
      out.write("                                          \n");
      out.write("                                      </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                ");
 
                        while(rs.next()){
                
      out.write(" \n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(rs.getInt(1) );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString(2) );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString(3) );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString(4) );
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"modifierClient.jsp?Num=");
      out.print(rs.getInt(1));
      out.write("\"  class=\"w3-button w3-section w3-light-blue w3-ripple\">Modifier</a>\n");
      out.write("                            <a href=\"Suprimer?Num=");
      out.print(rs.getInt(1) );
      out.write("\" class=\"w3-button w3-section w3-red w3-ripple\">Supprimer</a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                ");

                        }
                
      out.write("\n");
      out.write("                </table>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("     </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
