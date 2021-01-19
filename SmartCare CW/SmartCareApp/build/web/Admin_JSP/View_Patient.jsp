<%-- 
    Document   : View_Patient
    Created on : Jan 13, 2021, 7:01:31 PM
    Author     : Lil Shil
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Admin Page</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.7 -->
    <link rel="stylesheet" href="../assets/admin/bower_components/bootstrap/dist/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="../assets/admin/bower_components/font-awesome/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="../assets/admin/bower_components/Ionicons/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="../assets/admin/dist/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. Choose a skin from the css/skins
folder instead of downloading all of them to reduce the load. -->
    <link rel="stylesheet" href="../assets/admin/dist/css/skins/_all-skins.min.css">
    <!-- Morris chart -->
    <link rel="stylesheet" href="../assets/admin/bower_components/morris.js/morris.css">
    <!-- jvectormap -->
    <link rel="stylesheet" href="../assets/admin/bower_components/jvectormap/jquery-jvectormap.css">
    <!-- Date Picker -->
    <link rel="stylesheet" href="../assets/admin/bower_components/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css">
    <!-- Daterange picker -->
    <link rel="stylesheet" href="../assets/admin/bower_components/bootstrap-daterangepicker/daterangepicker.css">
    <!-- bootstrap wysihtml5 - text editor -->
    <link rel="stylesheet" href="../assets/admin/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <!-- Google Font -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
      <!-- jQuery 3 -->
    <script src="../assets/admin/bower_components/jquery/dist/jquery.min.js"></script>
    <!-- jQuery UI 1.11.4 -->
    <script src="../assets/admin/bower_components/jquery-ui/jquery-ui.min.js"></script>
    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
    <script>
      $.widget.bridge('uibutton', $.ui.button);
    </script>
    <!-- Bootstrap 3.3.7 -->
    <script src="../assets/admin/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- Morris.js charts -->
    <script src="../assets/admin/bower_components/raphael/raphael.min.js"></script>
    <script src="../assets/admin/bower_components/morris.js/morris.min.js"></script>
    <!-- Sparkline -->
    <script src="../assets/admin/bower_components/jquery-sparkline/dist/jquery.sparkline.min.js"></script>
    <!-- jvectormap -->
    <script src="../<assets/admin/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
    <script src="../assets/admin/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
    <!-- jQuery Knob Chart -->
    <script src="../assets/admin/bower_components/jquery-knob/dist/jquery.knob.min.js"></script>
    <!-- daterangepicker -->
    <script src="../assets/admin/bower_components/moment/min/moment.min.js"></script>
    <script src="../assets/admin/bower_components/bootstrap-daterangepicker/daterangepicker.js"></script>
    <!-- datepicker -->
    <script src="../assets/admin/bower_components/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"></script>
    <!-- Bootstrap WYSIHTML5 -->
    <script src="../assets/admin/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
    <!-- Slimscroll -->
    <script src="../assets/admin/bower_components/jquery-slimscroll/jquery.slimscroll.min.js"></script>
    <!-- FastClick -->
    <script src="../assets/admin/bower_components/fastclick/lib/fastclick.js"></script>
    <!-- AdminLTE App -->
    <script src="../assets/admin/dist/js/adminlte.min.js"></script>
    <!-- AdminLTE dashboard demo (This is only for demo purposes) -->
    <script src="../assets/admin/dist/js/pages/dashboard.js"></script>
    <!-- AdminLTE for demo purposes -->
    <script src="../assets/admin/dist/js/demo.js"></script>
  </head>
  <body class="hold-transition skin-blue sidebar-mini">
    <div class="wrapper">

      <header class="main-header">
        <!-- Logo -->
        <a href="../DashBoard_JSP/admin.jsp" class="logo">
          <!-- mini logo for sidebar mini 50x50 pixels -->
          <span class="logo-mini"><b>A</b>LT</span>
          <!-- logo for regular state and mobile devices -->
          <span class="logo-lg"><b>Admin</b></span>
        </a>
        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top">
          <!-- Sidebar toggle button-->
          <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
            <span class="sr-only">Toggle navigation</span>
          </a>
          <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
              <!-- User Account: style can be found in dropdown.less -->
              <li class="dropdown user user-menu">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  <img src="../assets/admin/images/Admin.png" class="user-image" alt="User Image">
                  <span class="hidden-xs">
                    <%=request.getParameter("UserID")%>
                  </span>
                </a>
                <ul class="dropdown-menu">
                  <!-- User image -->
                  <li class="user-header">
                    <img src="../assets/admin/images/Admin.png" class="img-circle" alt="User Image">
                    <p>
                      <%=request.getParameter("UserID")%>
                    </p>
                  </li>
                  <!-- Menu Footer-->
                  <li class="user-footer">
                    <div class="pull-left">
                      <a href="#" class="btn btn-default btn-flat">Profile</a>
                    </div>
                    <div class="pull-right">
                      <a href="" class="btn btn-default btn-flat">Sign out</a>
                    </div>
                  </li>
                </ul>
              </li>
              <!-- Control Sidebar Toggle Button -->
              <li>
                <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
              </li>
            </ul>
          </div>
        </nav>
      </header>
      <!-- Left side column. contains the logo and sidebar -->
      <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
          <!-- Sidebar user panel -->
          <div class="user-panel">
            <div class="pull-left image">
              <img src="../assets/admin/images/Admin.png" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
              <p><%=request.getParameter("UserID")%></p>
              <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
            </div>
          </div>
          <!-- search form -->
          <form action="#" method="get" class="sidebar-form">
            <div class="input-group">
              <input type="text" name="q" class="form-control" placeholder="Search...">
              <span class="input-group-btn">
    <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
    </button>
    </span>
            </div>
          </form>
          <!-- /.search form -->
          <!-- sidebar menu: : style can be found in sidebar.less -->
          <ul class="sidebar-menu" data-widget="tree">
            <li class="active treeview">
              <a href="#">
                <i class="fa fa-dashboard"></i> <span>Manage</span>
                <span class="pull-right-container">
    <i class="fa fa-angle-left pull-right"></i>
    </span>
              </a>
              <ul class="treeview-menu">
                <li class="active"><a href="../Admin_JSP/View_Patient.jsp"><i class="fa fa-circle-o"></i> View Patient</a></li>
                <li><a href="Adding_Doctor_Nurse.jsp"><i class="fa fa-circle-o"></i>Adding Doctor and Nurse</a></li>
                <li><a href="../Admin_JSP/Approve_Request.jsp"><i class="fa fa-circle-o"></i>Approve Request</a></li>
              </ul>
            </li>
          </ul>
        </section>
        <!-- /.sidebar -->
      </aside>
      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
          <div class="box">
            <div class="box-header">
                <h3 class="box-title">Private</h3><br>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <div id="example2_wrapper" class="dataTables_wrapper form-inline dt-bootstrap"><div class="row"><div class="col-sm-6"></div><div class="col-sm-6"></div></div><div class="row"><div class="col-sm-12"><table id="example2" class="table table-bordered table-hover dataTable" role="grid" aria-describedby="example2_info">
                <tbody>  
                <tr>
                    <td>cID</td>
                    <td>cName</td>
                    <td>cDOB</td>
                    <td>cAddress</td>
                    <td>cPO</td>
                    <td>cType</td>
                    <td>uName</td>
                </tr>      
                <%
                String driverName = "com.mysql.jdbc.Driver";
                String connectionUrl = "jdbc:mysql://localhost:3306/";
                String dbName = "demo";
                String userId = "root";
                String password = "admin";
                
                try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        
        try{
            String q = "SELECT * FROM demo.clients where cType='private'";
            con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
            ms = con.createStatement();
            rs = ms.executeQuery(q);
            while(rs.next()){
                
                %>
                <tr>
                    <td><%=rs.getInt("cID") %></td>
                    <td><%=rs.getString("cName") %></td>
                    <td><%=rs.getString("cDOB") %></td>
                    <td><%=rs.getString("cAddress") %></td>
                    <td><%=rs.getString("cPO") %></td>
                    <td><%=rs.getString("cType") %></td>
                    <td><%=rs.getString("uName") %></td>
                </tr>
                <%
                }
}
                catch (Exception e){
            
                    }   
                %>
            </tbody>
              </table>
                      </div>
                  </div>
                  <div class="row">
                      <div class="col-sm-5">
                          <div class="dataTables_info" id="example2_info" role="status" aria-live="polite">    
                          </div>
                      </div>
                  </div>
              </div>
            </div>
            <!-- /.box-body -->
          </div>
            <div class="box">
            <div class="box-header">
              <h3 class="box-title">NHS</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <div id="example2_wrapper" class="dataTables_wrapper form-inline dt-bootstrap"><div class="row"><div class="col-sm-6"></div><div class="col-sm-6"></div></div><div class="row"><div class="col-sm-12"><table id="example2" class="table table-bordered table-hover dataTable" role="grid" aria-describedby="example2_info">
                <tbody>
                    <tr>
                        <td>ID</td>
                        <td>Name</td>
                        <td>DateofBirth</td>
                        <td>Address</td>
                        <td>PostCode</td>
                        <td>Type</td>
                        <td>Name</td>
                    </tr>
                    <%
                try{
                    String q2 = "SELECT * FROM demo.clients where cType='NHS'";
                    ms = con.createStatement();
                    rs = ms.executeQuery(q2);
                    while(rs.next()){
                %>
                <tr>
                    <td><%=rs.getInt("cID") %></td>
                    <td><%=rs.getString("cName") %></td>
                    <td><%=rs.getString("cDOB") %></td>
                    <td><%=rs.getString("cAddress") %></td>
                    <td><%=rs.getString("cPO") %></td>
                    <td><%=rs.getString("cType") %></td>
                    <td><%=rs.getString("uName") %></td>
                </tr>
                                <%
                    }
                }
                catch(Exception e){

                }
                rs.close();
                ms.close();
                con.close();
                %> 
                </tbody>
                          </table>

                      </div>
                      <div class="row">
                          <div class="col-sm-5">
                              <div class="dataTables_info" id="example2_info" role="status" aria-live="polite"></div>     
                      </div>
                  </div>
              </div>
            </div>
            </div>
            <!-- /.box-body -->
          </div>
      </div>
      <!-- /.content-wrapper -->
      <footer class="main-footer">
        <strong>Copyright QuanBui-MinhNguyen-Xuer-KhanhLam-NiceMan</strong> 
      </footer>
        </div>
      </aside>
  </body>
        