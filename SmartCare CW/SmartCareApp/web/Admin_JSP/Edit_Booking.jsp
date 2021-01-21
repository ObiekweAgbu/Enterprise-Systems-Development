<%-- 
    Document   : Edit_Booking
    Created on : Jan 20, 2021, 3:11:59 AM
    Author     : Lil Shil
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="Login.Booking_OBJ"%>
<%@page import="Login.LoginData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <title>JSP Page</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script>
            function noCheck(){
                if(document.querySelectorAll('input[type = "checkbox"]:checked').length == 0){
                alert("You have to choose at least 1");
                return false;
            }
            if(document.querySelectorAll('input[type = "checkbox"]:checked').length > 1){
                alert("You can only delete one at a time");
                return false;
            }
        }
        </script>
        <title>Admin Page</title>
    
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
                    <%=session.getAttribute("user") %>
                  </span>
                </a>
                <ul class="dropdown-menu">
                  <!-- User image -->
                  <li class="user-header">
                    <img src="../assets/admin/images/Admin.png" class="img-circle" alt="User Image">
                    <p>
                     <%=session.getAttribute("user") %>
                    </p>
                  </li>
                  <!-- Menu Footer-->
                  <li class="user-footer">
                    <div class="pull-left">
                      <a href="#" class="btn btn-default btn-flat">Profile</a>
                    </div>
                    <div class="pull-right">
                      <a href="${pageContext.request.contextPath}/Log_Out.jsp" class="btn btn-default btn-flat">Sign out</a>
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
              <p><%=session.getAttribute("user") %></p>
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
                <li><a href="../Admin_JSP/Adding_Doctor_Nurse.jsp"><i class="fa fa-circle-o"></i>Adding Doctor and Nurse</a></li>
                <li><a href="../Admin_JSP/Approve_Request.jsp"><i class="fa fa-circle-o"></i>Approve Request</a></li>
                <li><a href="../Admin_JSP/Select_Employee.jsp"><i class="fa fa-circle-o"></i>Edit Booking</a></li>
                <li><a href="../Admin_JSP/Turn_Over.jsp"><i class="fa fa-circle-o"></i>Turn Over Fee</a></li>
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
              <h3 class="box-title">Edit Booking</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
             <form action="${pageContext.request.contextPath}/Delete_From_Booking">
              <div id="example2_wrapper" class="dataTables_wrapper form-inline dt-bootstrap"><div class="row"><div class="col-sm-6"></div><div class="col-sm-6"></div></div><div class="row"><div class="col-sm-12"><table id="example2" class="table table-bordered table-hover dataTable" role="grid" aria-describedby="example2_info">
               <tbody>
                <tr>
                    <th>Booking ID</th>
                    <th>Employee ID</th>
                    <th>Client</th>
                    <th>Date</th>
                    <th>Time</th>
                    <th>Service</th>
                    <th>Slot</th>
                    <th>Select</th>
                </tr>
                <%
        LoginData LD = new LoginData();
        String eName = request.getParameter("Employ_List");
        
        String uName = LD.get_eUname_From_eName(eName);
        System.out.println("uName ne "+ uName);
        String Date = request.getParameter("date");
        List<Booking_OBJ> bko = LD.get_Booking_List(uName, Date);
        %>
                     
                        <%
                for(int i = 0; i < bko.size();i++){
                %>
                 <tr>
                    <td><%= bko.get(i).getsID() %></td>
                    <td><%= bko.get(i).geteID() %></td>
                    <td><%= bko.get(i).getcID() %></td>
                    <td><%= Date %></td>
                    <td><%= bko.get(i).getsTime() %></td>
                    <td><%= bko.get(i).getsName() %></td>
                    <td><%= bko.get(i).getsSlot() %></td>
                    <td><input type="checkbox" name="Del_BKO" value="<%= bko.get(i).getsID() %>" /></td>
                </tr>
                                <%
                }
                %>
               </tbody>
                          </table>
                <input type="submit" value="Delete" onclick="return noCheck();"/>
                </form>
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
          </div>
            </div>
            <!-- /.box-body -->
            <strong>Copyright QuanBui-MinhNguyen-Xuer-KhanhLam-NiceMan</strong>
    </div> 
  </body>
</html>
       