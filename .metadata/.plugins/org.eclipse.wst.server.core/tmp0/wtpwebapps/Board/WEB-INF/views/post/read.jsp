<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@include file="../include/header.jsp" %>

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
<input type='hidden' name="postId" value="${postVO.postId}">

</form>

<div class="box-body">
<div class="form-group">
<label for="exampleInputEmail1">TITLE</label><input type="text" name='postTitle' class="form-control" value="${postVO.postTitle}"
readonly="readonly">
</div>
<div class="form-group">
<label for="exampleInputPassword1">CONTENT</label>
<textarea class="form-control" name="postContent" rows="3" readonly="readonly">${postVO.postContent}</textarea>
</div>
<div class="form-group">
<label for="exampleInputEmail1">WRITER</label> <input type="text"
name="userId" class="form-control" value="${postVO.userId}" readonly="readonly">
</div>
</div>
<!-- /.box-body -->

<div class="box-footer">
<button type="submit" class="btn btn-warning">MODIFY</button>
<button type="submit" class="btn btn-danger">REMOVE</button>
<button type="submit" class="btn btn-primary">LIST</button>
</div>

<script>
$(document).ready(function(){
	
	var formObj = $("form[role='form']");
	
	console.log(formObj);
	
	$(".btn-warning").on("click", function(){
		formObj.attr("action", "/post/modify");
		formObj.attr("method", "get");
		formObj.submit();
	});
	
	$(".btn-danger").on("click", function(){
		formObj.attr("action", "/post/remove");
		formObj.submit();
	});
	
	$(".btn-primary").on("click", function(){
		self.location = "/post/listAll";
	});
	
});
</script>

</div>
<!-- /.box -->
</div>
<!-- /.col (left) -->
</div>
<!-- /.row -->
</section>
<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<%@ include file="../include/footer.jsp" %>