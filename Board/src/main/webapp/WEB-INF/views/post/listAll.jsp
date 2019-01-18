<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session= "false" %>

<%@include file="../include/header.jsp"%>

<!-- Main Content -->
<section class="content">
<div class="row">
<!-- left column -->

<div class="col-md-12">
<!--  general form elements -->
<div class='box'>
<div class="box-header with-border">
<h3 class="box-title">POST LIST</h3>
</div>
<div class='box-body'>
<table class="table table-bordered">
<tr>
<th style="width:40px">PostId</th>
<th>TITLE</th>
<th>WRITER</th>
<th>DATE</th>
<th style="width:40px">VIEWCOUNT</th>
</tr>

<c:forEach items="${list}" var="PostVO">

<tr>
<td>${PostVO.postId}</td>
<td><a href='/post/read?postId=${PostVO.postId}'>${PostVO.postTitle }</a></td>
<td>${PostVO.userId}</td>
<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${PostVO.postDate }" /></td>
<td><span class="badge bg-yellow">${PostVO.viewcnt}</span></td>
</tr>

</c:forEach>
</table>

</div>
<!-- /.box.body -->
<div class="box-footer">Footer</div>
<!-- /.box-footer -->
</div>
</div>
<!-- /.col (left) -->

</div>
<!-- /.row -->
</section>
<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<script>
var result='${msg}';

if(result=='SUCCESS'){
alert("Finished successfully.");
}

</script>

<%@include file="../include/footer.jsp" %>