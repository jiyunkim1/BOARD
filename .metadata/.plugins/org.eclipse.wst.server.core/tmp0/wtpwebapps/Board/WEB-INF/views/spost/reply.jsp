<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="../include/header.jsp" %>

<!-- Main Content -->

<section class="content">
<div class="row">
<!-- left column -->
<div class="col-md-12">
<!-- general form elements -->
<div class="box box-primary">
<div class="box-header">
<h3 class="box-title">REPLY TO POST</h3>
</div>
<!--  /.box-header -->

<form role="form" method="post">


<input type='hidden' name='postId' value="${postVO.postId}"> 
<input type='hidden' name='postTitle' value="RE : ${postVO.postTitle}">
<input type='hidden' name='userId' value='${login.userId}'>
<input type='hidden' name='repGroup' value="${postVO.repGroup}">
<input type='hidden' name='repOrder' value="${postVO.repOrder}">
<input type='hidden' name='repIndent' value="${postVO.repIndent}">


<div class="box-body">
<%-- 
<div class="form-group">
<label for="exampleInputEmail1">TITLE</label><input type="text" 
name='postTitle' class="form-control">
</div>
--%>
<div class="form-group">
<label for="exampleInputPassword1">CONTENT</label>
<textarea class="form-control" name="postContent" rows="3"
placeholder="Enter..."></textarea>
</div>
<div class="form-group">
<label for="exampleInputEmail1">WRITER</label> <input type="text" 
name="userId" class="form-control" value='${login.userId}' readonly>
</div>

</div>
<!-- /.box-body -->



<div class="box-footer">
<button type="submit" class="btn btn-primary">SUBMIT</button>
</div>
</form>

</div>
<!-- /.box -->
</div>
<!-- /.col (left) -->

</div>
<!-- /.row -->

</section>
<!-- /.content -->
</div>
<!-- Content-wrapper -->

<%@include file="../include/footer.jsp"%>