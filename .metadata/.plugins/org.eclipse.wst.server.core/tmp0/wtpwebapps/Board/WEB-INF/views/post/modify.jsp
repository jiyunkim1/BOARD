<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@include file="../include/header.jsp"%>

<!-- Main content -->
<section class="content">
<div class="row">
<!-- left column -->
<div class="col-md-12">
<!-- general form elements -->
<div class="box box-primary">
<div class="box-header">
<h3 class="box-title">READ POSTS</h3>
</div>
<!-- /.box-header -->

<form role="form" method="post">

<div class="box-body">

<div class="form-group">
<label for="exampleInputEmail1">POSTID</label> <input type="text" 
name='postId' class="form-control" value="${postVO.postId}" 
readonly="readonly">
</div>

<div class="form-group">
<label for="examplueInputEmail1">TITLE</label><input type="text"
name='postTitle' class="form-control" value="${postVO.postTitle}">
</div>

<div class="form-group">
<label for="exampleInputEmail1">WRITER</label><input type="text"
name='userId' class="form-control"
value="${postVO.userId}"> 
</div>
</div>
<!--/.box-body -->

</form>

<div class="box-footer">
<button type="submit" class="btn btn-primary">SAVE</button>
<button type="submit" class="btn btn-warning">CANCEL</button>
</div>

<script>
$(document).ready(function() {
	
	var formObj = $("form[role='form']");
	
	console.log(formObj);
	
	$(".btn-warning").on("click", function() {
		self.location = "/post/listAll";
	});
	
	$(".btn-primary").on("click", function() {
		formObj.submit();
	});
	
});
</script>
</div>
<!-- /.box -->
</div>
<!-- /.col -->

</div>
<!-- /.row -->
</section>
<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<%@include file="../include/footer.jsp" %>