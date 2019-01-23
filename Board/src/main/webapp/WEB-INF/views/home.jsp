<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>

<%@include file="include/header.jsp" %>

    <!-- Main content -->
    <section class="content">
      <div class="row">
      <!-- left column -->
      <div class="col-md-12">
        <!-- general form elements -->

					<div class="box">
            <div class="box-header with-border">
              <h3 class="box-title">HOME PAGE</h3>
            </div>
            
            <div class="box-footer">
            
            <input type="button" value="GO TO LIST" class = "btn btn-warning" name="listBtn" onclick = "location.href='/spost/list'"></input>
            <input type="button" value="+NEW POST" class = "btn btn-success" name="registerBtn" onclick = "location.href='/spost/register'"></input>
            
            </div>
          </div>
      </div><!--/.col (left) -->
      </div>   <!-- /.row -->
    </section><!-- /.content -->

    
<%@include file="include/footer.jsp" %>
